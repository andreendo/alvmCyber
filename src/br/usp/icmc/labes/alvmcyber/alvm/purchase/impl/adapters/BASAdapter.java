package br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters;

import braco.client.BracoArmsService;
import braco.client.BracoArmsServiceService;
import braco.client.BracoResponseMessage;

public class BASAdapter 
{
	private static BASAdapter instance;
	private BracoArmsService basService;
	
	private BASAdapter()
	{
		basService = (new BracoArmsServiceService()).getBracoArmsServicePort();
	}
	
	public static BASAdapter getInstance()
	{
		if(instance == null)
			instance = new BASAdapter();
		return instance;
	}

	public BASAdapterResponse callSearchArms(String clientId, String model, int amount) 
	{
		BracoResponseMessage bracoResponse = basService.hasArms(clientId, model, amount);
		
		BASAdapterResponse adapterResponse = new BASAdapterResponse();
		adapterResponse.setHasSupplies( bracoResponse.getMessage().equalsIgnoreCase("YES") );
		adapterResponse.setPrice( bracoResponse.getPrice() );
		
		return adapterResponse;
	}
}
