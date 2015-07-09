package br.usp.icmc.labes.alvmcyber.pegar.impl;

import java.util.logging.Logger;

import javax.jws.WebService;

import br.usp.icmc.labes.alvmcyber.pegar.service.PegarArmsService;
import br.usp.icmc.labes.alvmcyber.pegar.service.PegarResponseMessage;

@WebService(serviceName="PegarArmsService", 
		endpointInterface = "br.usp.icmc.labes.alvmcyber.pegar.service.PegarArmsService")
public class PegarArmsServiceImpl implements PegarArmsService 
{
	private Logger logger = Logger.getAnonymousLogger();
	
	@Override
	public PegarResponseMessage hasArms(String clientCode, String model, int amount) 
	{
		PegarResponseMessage pegarMsg = new PegarResponseMessage();
		
		//always contains the amount when
		if(amount > 100 && amount <= 500)
		{
			pegarMsg.setCanMeetOrder(true);
			pegarMsg.setValue(amount * 423.30);
		}
		else
		{
			pegarMsg.setCanMeetOrder(false);
			pegarMsg.setValue(0.0);
		}
		return pegarMsg;
	}
}
