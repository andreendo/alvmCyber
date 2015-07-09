package br.usp.icmc.labes.alvmcyber.alvm.purchase.impl;

import br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.dao.OfferInfo;
import br.usp.icmc.labes.alvmcyber.alvm.purchase.service.AlvmCyberCheckPriceResponse;

public class AuxiliarCreator 
{
	public static AlvmCyberCheckPriceResponse createDefaultResponse()
	{
		AlvmCyberCheckPriceResponse response = new AlvmCyberCheckPriceResponse();
		response.setOfferCode(0);
		response.setUnitPrice(-1.0);
		response.setTotalPrice(-1.0);
		response.setValidOffer(false);
		response.setNumberOfRobots(0);
		response.setClientId("");
		return response;
	}
	
	public static void copyOfferToResponse(OfferInfo offerInfo, AlvmCyberCheckPriceResponse response)
	{
		response.setOfferCode( offerInfo.getOfferCode() );
		response.setUnitPrice( offerInfo.getUnitPrice() );
		response.setTotalPrice( offerInfo.getTotalPrice() );
		response.setValidOffer(true);
		response.setNumberOfRobots( offerInfo.getNumberOfRobots() );
		response.setClientId( offerInfo.getClientId() );
	}
}
