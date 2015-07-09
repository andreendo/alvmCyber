package br.usp.icmc.labes.alvmcyber.alvm.order.impl;

import java.util.logging.Logger;

import javax.jws.WebService;

import br.usp.icmc.labes.alvmcyber.alvm.order.service.AlvmOrderService;

@WebService(serviceName="AlvmOrderService", 
		endpointInterface = "br.usp.icmc.labes.alvmcyber.alvm.order.service.AlvmOrderService")
public class AlvmOrderServiceImpl implements AlvmOrderService
{
	private Logger logger = Logger.getAnonymousLogger();
	
	@Override
	public void order(int offerCode) 
	{
		logger.info("AlvmOrderService: An order has been initiated for offer code: " + offerCode);
	}
}
