package br.usp.icmc.labes.alvmcyber.braco.service;

public class BracoResponseMessage 
{
	private String message;
	private double price;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
