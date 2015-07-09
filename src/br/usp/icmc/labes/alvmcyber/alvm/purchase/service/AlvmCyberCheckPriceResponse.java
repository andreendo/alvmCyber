package br.usp.icmc.labes.alvmcyber.alvm.purchase.service;

public class AlvmCyberCheckPriceResponse 
{
	double totalPrice, unitPrice;
	String clientId;
	int numberOfRobots;
	boolean validOffer;
	int offerCode;
	String message;
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public int getNumberOfRobots() {
		return numberOfRobots;
	}
	public void setNumberOfRobots(int numberOfRobots) {
		this.numberOfRobots = numberOfRobots;
	}
	public boolean isValidOffer() {
		return validOffer;
	}
	public void setValidOffer(boolean validOffer) {
		this.validOffer = validOffer;
	}
	public int getOfferCode() {
		return offerCode;
	}
	public void setOfferCode(int offerCode) {
		this.offerCode = offerCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
