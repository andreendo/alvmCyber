package br.usp.icmc.labes.alvmcyber.alvm.purchase.impl;

import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters.AOSAdapter;
import br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters.BASAdapter;
import br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters.GMBSAdapter;
import br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters.PASAdapter;
import br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters.PASAdapterResponse;
import br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.dao.GenericDAO;
import br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.dao.OfferInfo;
import br.usp.icmc.labes.alvmcyber.alvm.purchase.service.AlvmCyberCheckPriceResponse;
import br.usp.icmc.labes.alvmcyber.alvm.purchase.service.AlvmCyberOrderOfferAck;
import br.usp.icmc.labes.alvmcyber.alvm.purchase.service.AlvmCyberPurchaseService;

@WebService(serviceName="AlvmCyberPurchaseService", 
		endpointInterface = "br.usp.icmc.labes.alvmcyber.alvm.purchase.service.AlvmCyberPurchaseService")
public class AlvmCyberPurchaseServiceImpl implements AlvmCyberPurchaseService 
{
	@Resource
	private WebServiceContext wsContext;
	
	private Logger logger = Logger.getAnonymousLogger();
	private AOSAdapter aosAdapter;
	private BASAdapter basAdapter;
	private GMBSAdapter gmbsAdapter;
	private PASAdapter pasAdapter;
	private GenericDAO dao;
	
	@PostConstruct
	@WebMethod(exclude=true)
	public void onBeginService() 
	{
		logger.info("starting the service..." + wsContext.toString());
		
		//initializing adapters (to access partner services)
		aosAdapter = AOSAdapter.getInstance();
		basAdapter = BASAdapter.getInstance();
		gmbsAdapter = GMBSAdapter.getInstance();
		pasAdapter = PASAdapter.getInstance();
		//initializing dao
		dao = GenericDAO.getInstance();
	}
	
	@PreDestroy
	@WebMethod(exclude=true)
	public void onEndService()
	{
		logger.info("ending the service...");
	}
	
	@Override
	public AlvmCyberCheckPriceResponse checkPrice(String clientId, 	int numberOfRobots) 
	{
		AlvmCyberCheckPriceResponse resp = AuxiliarCreator.createDefaultResponse();
		resp.setClientId(clientId);
		resp.setNumberOfRobots(numberOfRobots);
		
		//wrong client id
		if(! dao.containClient(clientId))
		{
			resp.setMessage("ERROR: Wrong client id.");
			return resp;
		}
		//numberofrobots < 5
		if(! dao.isEnoughUnits(numberOfRobots))
		{
			resp.setMessage("ERROR: It is required at least 5 units.");
			return resp;			
		}
		//workflow
		// gmbs || bas
		CheckMobileBaseThread mbaseThread = new CheckMobileBaseThread(gmbsAdapter);
		//one base for each unit
		mbaseThread.setAmount(numberOfRobots);
		
		CheckArmsThread armsThread = new CheckArmsThread(basAdapter);
		//two arms for each unit
		armsThread.setAmount(2 * numberOfRobots);
		
		mbaseThread.start();
		armsThread.start();
		try {
			mbaseThread.join(10000);
			armsThread.join(10000);
		} 
		catch (InterruptedException e) {
			resp.setMessage("ERROR: thread internal");
			return resp;
		}
		
		if(! mbaseThread.getResponse().hasSupplies())
		{
			resp.setMessage("ERROR: there is no mobile base. no purchase.");
			return resp;
		}
		
		//essential offer info + mobile base info 
		OfferInfo offerInfo = new OfferInfo();
		offerInfo.setClientId(clientId);
		offerInfo.setNumberOfRobots(numberOfRobots);
		offerInfo.setMobileBaseVendor("Gehen");
		offerInfo.setMobileBaseModel("A1");
		offerInfo.setMobileBaseTotalPrice( mbaseThread.getResponse().getPrice() );
		
		if(! armsThread.getResponse().hasSupplies())
		{
			//call another supplier
			PASAdapterResponse pasResponse = pasAdapter.callSearchArms("ALVMCYBER", "PEGAR-ARM-TYPE1234", 2*numberOfRobots);
			if(! pasResponse.hasSupplies())
			{
				resp.setMessage("ERROR: there is no arms. no purchase.");
				return resp;
			}
			else
			{
				offerInfo.setArmVendor("Pegar");
				offerInfo.setArmModel("PEGAR-ARM-TYPE1234");
				offerInfo.setArmTotalPrice(pasResponse.getPrice());
			}
		}
		else
		{
			offerInfo.setArmVendor("Braco");
			offerInfo.setArmModel("ARM-TYPE01");
			offerInfo.setArmTotalPrice(armsThread.getResponse().getPrice());
		}
		//calculate total price
		double tempTotal = offerInfo.getArmTotalPrice() + offerInfo.getMobileBaseTotalPrice();
		tempTotal += offerInfo.getNumberOfRobots() * GenericDAO.COST_PER_ROBOT;
		offerInfo.setTotalPrice(tempTotal);
		offerInfo.setUnitPrice(tempTotal / numberOfRobots);
		
		dao.save(offerInfo);
		
		AuxiliarCreator.copyOfferToResponse(offerInfo, resp);
		resp.setMessage("SUCCESS: Check offer attached.");
		return resp;
	}
	
	@Override
	public AlvmCyberOrderOfferAck orderOffer(String clientId, int offerCode) 
	{
		AlvmCyberOrderOfferAck msg = new AlvmCyberOrderOfferAck();
		//valid offer code?
		OfferInfo offer = dao.get(clientId, offerCode);
		if(offer == null)
		{
			msg.setMessage("ERROR: Wrong offer and clientid codes.");
			return msg;
		}
		if(! offer.isActive())
		{
			msg.setMessage("ERROR: your offer has already been ordered.");
			return msg;			
		}

		aosAdapter.order(offer.getOfferCode());
		
		dao.deactivate(offer);
		
		msg.setMessage("SUCCESS: Your offer has been ordered. Wait for contact.");
		return msg;
	}
}
