package br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.adapters;

public class GMBSAdapterResponse 
{
	boolean hasSupplies;
	double price;

	public boolean hasSupplies() {
		return hasSupplies;
	}
	public void setHasSupplies(boolean hasSupplies) {
		this.hasSupplies = hasSupplies;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
}
