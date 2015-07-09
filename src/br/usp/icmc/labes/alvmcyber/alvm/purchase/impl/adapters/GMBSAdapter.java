package br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters;

import gehen.client.GehenConfirmationMessage;
import gehen.client.GehenMobileBaseService;
import gehen.client.GehenMobileBaseServiceService;


public class GMBSAdapter 
{
	private static GMBSAdapter instance;
	private GehenMobileBaseService gmbsService;
	
	private GMBSAdapter()
	{
		gmbsService = (new GehenMobileBaseServiceService()).getGehenMobileBaseServicePort();
	}
	
	public static GMBSAdapter getInstance()
	{
		if(instance == null)
			instance = new GMBSAdapter();
		return instance;
	}

	public GMBSAdapterResponse callSearchMobileBase(String clientId, String model, int amount) 
	{
		GehenConfirmationMessage msg = gmbsService.checkMobileBase(clientId, model, amount);
		
		GMBSAdapterResponse adapterResponse = new GMBSAdapterResponse();
		adapterResponse.setHasSupplies( msg.isContainProducts() );
		adapterResponse.setPrice( msg.getPrice() );
		
		return adapterResponse;
	}
}
