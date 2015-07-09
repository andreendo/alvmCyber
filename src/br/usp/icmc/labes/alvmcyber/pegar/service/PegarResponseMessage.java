package br.usp.icmc.labes.alvmcyber.pegar.service;

public class PegarResponseMessage 
{
	private double value;
	private boolean canMeetOrder;
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public boolean isCanMeetOrder() {
		return canMeetOrder;
	}
	public void setCanMeetOrder(boolean canMeetOrder) {
		this.canMeetOrder = canMeetOrder;
	}
}
