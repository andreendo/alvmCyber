package br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters;

import alvm.client.AlvmOrderService;
import alvm.client.AlvmOrderServiceService;

public class AOSAdapter 
{
	private static AOSAdapter instance;
	private AlvmOrderService aosService;
	
	private AOSAdapter()
	{
		aosService = (new AlvmOrderServiceService()).getAlvmOrderServicePort();
	}
	
	public static AOSAdapter getInstance()
	{
		if(instance == null)
			instance = new AOSAdapter();
		return instance;
	}

	public void order(int offerCode) 
	{
		aosService.order(offerCode);
	}
}
