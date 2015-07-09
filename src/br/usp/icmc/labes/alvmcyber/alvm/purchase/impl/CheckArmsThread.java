package br.usp.icmc.labes.alvmcyber.alvm.purchase.impl;

import br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters.BASAdapter;
import br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters.BASAdapterResponse;

public class CheckArmsThread extends Thread 
{
	BASAdapter basAdapter;
	BASAdapterResponse response;
	int amount;
	
	public CheckArmsThread(BASAdapter basAdapter) {
		this.basAdapter = basAdapter;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public BASAdapterResponse getResponse() {
		return response;
	}
	
	@Override
	public void run() 
	{
		response = basAdapter.callSearchArms("ALVMCYBER", "ARM-TYPE01", amount);
	}
}
