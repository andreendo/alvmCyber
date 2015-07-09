package br.usp.icmc.labes.alvmcyber;

import br.usp.icmc.labes.alvmcyber.gehen.service.GehenMobileBaseService;
import br.usp.icmc.labes.alvmcyber.alvm.order.impl.AlvmOrderServiceImpl;
import br.usp.icmc.labes.alvmcyber.alvm.order.service.AlvmOrderService;
import br.usp.icmc.labes.alvmcyber.alvm.purchase.impl.AlvmCyberPurchaseServiceImpl;
import br.usp.icmc.labes.alvmcyber.alvm.purchase.service.AlvmCyberPurchaseService;
import br.usp.icmc.labes.alvmcyber.braco.impl.BracoArmsServiceImpl;
import br.usp.icmc.labes.alvmcyber.braco.service.BracoArmsService;
import br.usp.icmc.labes.alvmcyber.gehen.impl.GehenMobileBaseServiceImpl;
import br.usp.icmc.labes.alvmcyber.pegar.impl.PegarArmsServiceImpl;
import br.usp.icmc.labes.alvmcyber.pegar.service.PegarArmsService;

public class Main 
{
	public static void main(String[] args) 
	{
		GenericServer aosServer = new GenericServer("http://localhost:9001/AlvmOrderService", AlvmOrderService.class, new AlvmOrderServiceImpl());
		aosServer.start();
		
		GenericServer gmbsServer = new GenericServer("http://localhost:9002/GehenMobileBaseService", GehenMobileBaseService.class, new GehenMobileBaseServiceImpl());
		gmbsServer.start();
		
		GenericServer basServer = new GenericServer("http://localhost:9003/BracoArmsService", BracoArmsService.class, new BracoArmsServiceImpl());
		basServer.start();
		
		GenericServer pasServer = new GenericServer("http://localhost:9004/PegarArmsService", PegarArmsService.class, new PegarArmsServiceImpl());
		pasServer.start();
		
		GenericServer acpsServer = new GenericServer("http://localhost:9005/AlvmCyberPurchaseService", AlvmCyberPurchaseService.class, new AlvmCyberPurchaseServiceImpl());
		acpsServer.start();
	}
}