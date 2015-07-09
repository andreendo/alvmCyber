package br.usp.icmc.labes.alvmcyber.braco.impl;

import java.util.logging.Logger;

import javax.jws.WebService;

import br.usp.icmc.labes.alvmcyber.braco.service.BracoArmsService;
import br.usp.icmc.labes.alvmcyber.braco.service.BracoResponseMessage;

@WebService(serviceName="BracoArmsService", 
		endpointInterface = "br.usp.icmc.labes.alvmcyber.braco.service.BracoArmsService")
public class BracoArmsServiceImpl implements BracoArmsService 
{
	private Logger logger = Logger.getAnonymousLogger();
	
	@Override
	public BracoResponseMessage hasArms(String clientCode, String model, int amount) 
	{
		BracoResponseMessage respMsg = new BracoResponseMessage();
		
		if(amount <= 100) //always contains the amount is smaller than 100
		{
			respMsg.setMessage("yes");
			respMsg.setPrice(amount * 300.20);
		}
		else
		{
			respMsg.setMessage("no");
			respMsg.setPrice(0.0);
		}
		return respMsg;
	}
}
