package br.usp.icmc.labes.alvmcyber.gehen.impl;

import java.util.logging.Logger;

import javax.jws.WebService;

import br.usp.icmc.labes.alvmcyber.gehen.service.GehenConfirmationMessage;
import br.usp.icmc.labes.alvmcyber.gehen.service.GehenMobileBaseService;


@WebService(serviceName="GehenMobileBaseService", 
		endpointInterface = "br.usp.icmc.labes.alvmcyber.gehen.service.GehenMobileBaseService")
public class GehenMobileBaseServiceImpl implements GehenMobileBaseService 
{
	private static String INVALID_AMOUNT_MSG = "The amount provided was invalid.";
	private static String INVALID_CLIENT_MSG = "The client code provided was invalid.";
	private static String INVALID_MODEL_MSG = "The model provided was invalid.";
	private static String NO_PRODUCT_MSG = "Sorry. We do not have the products.";
	private static String HAS_PRODUCT_MSG = "We have the product. the price is attached.";
	private Logger logger = Logger.getAnonymousLogger();
	
	@Override
	public GehenConfirmationMessage checkMobileBase(String clientCode, String model, int amount) 
	{
		GehenConfirmationMessage retMsg = new GehenConfirmationMessage();
		retMsg.setClientCode(clientCode);
		retMsg.setModel(model);
		retMsg.setAmount(amount);
		
		if(amount <= 0)
		{
			retMsg.setContainProducts(false);
			retMsg.setPrice(0.0);
			retMsg.setMessage(INVALID_AMOUNT_MSG);
			logger.info("GehenMobileBaseService: " + INVALID_AMOUNT_MSG);
			return retMsg;
		}
		
		if(! clientCode.equalsIgnoreCase("ALVMCYBER"))
		{
			retMsg.setContainProducts(false);
			retMsg.setPrice(0.0);
			retMsg.setMessage(INVALID_CLIENT_MSG);
			logger.info("GehenMobileBaseService: " + INVALID_CLIENT_MSG);
			return retMsg;
		}

		if(! model.equalsIgnoreCase("A1"))
		{
			retMsg.setContainProducts(false);
			retMsg.setPrice(0.0);
			retMsg.setMessage(INVALID_MODEL_MSG);
			logger.info("GehenMobileBaseService: " + INVALID_MODEL_MSG);
			return retMsg;
		}
		
		//this decision is if the amount is
		if(amount % 2 == 0) //even - has no product
		{
			retMsg.setContainProducts(false);
			retMsg.setPrice(0.0);
			retMsg.setMessage(NO_PRODUCT_MSG);
			logger.info("GehenMobileBaseService: " + NO_PRODUCT_MSG);			
		}
		else	//odd - has the product
		{
			retMsg.setContainProducts(true);
			retMsg.setPrice( amount * 34.55 );
			retMsg.setMessage(HAS_PRODUCT_MSG);
			logger.info("GehenMobileBaseService: " + HAS_PRODUCT_MSG);
			logger.info("GehenMobileBaseService: " + retMsg.getPrice());
		}
		return retMsg;
	}
}
