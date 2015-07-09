package br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters;

public class PASAdapterResponse 
{
	boolean hasSupplies;
	double price;
	
	public boolean hasSupplies() {
		return hasSupplies;
	}
	public double getPrice() {
		return price;
	}
	public void setHasSupplies(boolean hasSupplies) {
		this.hasSupplies = hasSupplies;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
