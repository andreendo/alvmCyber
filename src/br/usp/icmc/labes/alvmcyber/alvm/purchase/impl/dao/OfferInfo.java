package br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.dao;

public class OfferInfo 
{
	int offerCode;
	String clientId;
	double totalPrice, unitPrice, mobileBaseTotalPrice, armTotalPrice;
	int numberOfRobots;
	String mobileBaseModel, mobileBaseVendor, armModel, armVendor;
	boolean active = true;
	
	public void setActive(boolean active) {
		this.active = active;
	}
	public boolean isActive() {
		return active;
	}
	public double getMobileBaseTotalPrice() {
		return mobileBaseTotalPrice;
	}
	public void setMobileBaseTotalPrice(double mobileBaseTotalPrice) {
		this.mobileBaseTotalPrice = mobileBaseTotalPrice;
	}
	public double getArmTotalPrice() {
		return armTotalPrice;
	}
	public void setArmTotalPrice(double armTotalPrice) {
		this.armTotalPrice = armTotalPrice;
	}
	public int getOfferCode() {
		return offerCode;
	}
	public void setOfferCode(int offerCode) {
		this.offerCode = offerCode;
	}
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public double getTotalPrice() 
	{
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
	public int getNumberOfRobots() {
		return numberOfRobots;
	}
	public void setNumberOfRobots(int numberOfRobots) {
		this.numberOfRobots = numberOfRobots;
	}
	public String getMobileBaseModel() {
		return mobileBaseModel;
	}
	public void setMobileBaseModel(String mobileBaseModel) {
		this.mobileBaseModel = mobileBaseModel;
	}
	public String getMobileBaseVendor() {
		return mobileBaseVendor;
	}
	public void setMobileBaseVendor(String mobileBaseVendor) {
		this.mobileBaseVendor = mobileBaseVendor;
	}
	public String getArmModel() {
		return armModel;
	}
	public void setArmModel(String armModel) {
		this.armModel = armModel;
	}
	public String getArmVendor() {
		return armVendor;
	}
	public void setArmVendor(String armVendor) {
		this.armVendor = armVendor;
	}
}
