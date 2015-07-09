package br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.dao;

import java.util.ArrayList;

public class GenericDAO 
{
	private static GenericDAO instance;
	public static double COST_PER_ROBOT = 2100.0;
	private ArrayList<OfferInfo> offers;
	
	private GenericDAO()
	{
		offers = new ArrayList<OfferInfo>();
	}
	
	public static GenericDAO getInstance()
	{
		if(instance == null)
			instance = new GenericDAO();
		return instance;
	}
	
	public boolean containClient(String id)
	{
		if(id.equalsIgnoreCase("ABC") || id.equalsIgnoreCase("XYZ"))
			return true;
		
		return false;
	}
	
	public boolean isEnoughUnits(int numberOfUnits)
	{
		if(numberOfUnits < 5)
			return false;
		
		return true;
	}

	public void save(OfferInfo offerInfo) 
	{
		offers.add(offerInfo);
		int newOfferCode = offers.indexOf(offerInfo) + 1;
		offerInfo.setOfferCode(newOfferCode);
	}

	public OfferInfo get(String clientId, int offerCode) 
	{
		for(OfferInfo offer : offers)
			if(offer.getOfferCode() == offerCode && offer.getClientId().equals(clientId))
				return offer;
		
		return null;
	}

	public void deactivate(OfferInfo offer) {
		offer.setActive(false);	
	}
}
