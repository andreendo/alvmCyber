package br.usp.icmc.labes.alvmcyber.gehen.service;

public class GehenConfirmationMessage 
{
	private String clientCode, model, message;
	private int amount;
	private boolean containProducts;
	private double price;
	
	public String getClientCode() {
		return clientCode;
	}
	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public boolean isContainProducts() {
		return containProducts;
	}
	public void setContainProducts(boolean containProducts) {
		this.containProducts = containProducts;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
