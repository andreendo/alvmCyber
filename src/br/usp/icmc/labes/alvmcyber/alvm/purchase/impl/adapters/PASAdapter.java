package br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters;

import pegar.client.PegarArmsService;
import pegar.client.PegarArmsServiceService;
import pegar.client.PegarResponseMessage;

public class PASAdapter 
{
	private static PASAdapter instance;
	private PegarArmsService pasService;
	
	private PASAdapter()
	{
		pasService = (new PegarArmsServiceService()).getPegarArmsServicePort();
	}
	
	public static PASAdapter getInstance()
	{
		if(instance == null)
			instance = new PASAdapter();
		return instance;
	}

	public PASAdapterResponse callSearchArms(String clientId, String model, int amount) 
	{
		PegarResponseMessage pasResponse = pasService.hasArms(clientId, model, amount);
		
		PASAdapterResponse adapterResponse = new PASAdapterResponse();
		adapterResponse.setHasSupplies( pasResponse.isCanMeetOrder() );
		adapterResponse.setPrice( pasResponse.getValue() );
		
		return adapterResponse;
	}
}
