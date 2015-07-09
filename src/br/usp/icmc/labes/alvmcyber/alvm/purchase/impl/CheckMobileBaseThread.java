package br.usp.icmc.labes.alvmcyber.alvm.purchase.impl;

import br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters.GMBSAdapter;
import br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters.GMBSAdapterResponse;

public class CheckMobileBaseThread extends Thread 
{
	GMBSAdapter gmbsAdapter;
	int amount;
	GMBSAdapterResponse response;
	
	public CheckMobileBaseThread(GMBSAdapter gmbsAdapter) 
	{
		this.gmbsAdapter = gmbsAdapter;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public GMBSAdapterResponse getResponse() {
		return response;
	}
	
	@Override
	public void run() 
	{
		response = gmbsAdapter.callSearchMobileBase("ALVMCYBER", "A1", amount);
	}
}
