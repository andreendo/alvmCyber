package br.usp.icmc.labes.alvmcyber.alvm.purchase.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface AlvmCyberPurchaseService 
{
	public @WebResult(name="AlvmCyberCheckResp") AlvmCyberCheckPriceResponse 
				checkPrice(@WebParam(name="clientId") String clientId, 
						   @WebParam(name="numberOfRobots") int numberOfRobots);
	
	public @WebResult(name="AlvmCyberOfferAck") AlvmCyberOrderOfferAck 
				orderOffer(@WebParam(name="clientId") String clientId, 
						   @WebParam(name="offerCode") int offerCode);
}
