package br.usp.icmc.labes.alvmcyber;

import org.junit.Test;

import br.usp.icmc.labes.alvmcyber.gehen.service.GehenConfirmationMessage;
import static org.junit.Assert.*;
import br.usp.icmc.labes.alvmcyber.alvm.order.impl.AlvmOrderServiceImpl;
import br.usp.icmc.labes.alvmcyber.gehen.impl.GehenMobileBaseServiceImpl;

public class SingleServicesTest 
{
	@Test
	public void test_AlvmOrderService_01()
	{
		AlvmOrderServiceImpl service = new AlvmOrderServiceImpl();
		service.order(12);
	}
	
	@Test
	public void test_GehenMobileBaseService_01()
	{
		GehenMobileBaseServiceImpl service = new GehenMobileBaseServiceImpl();
		GehenConfirmationMessage msg = service.checkMobileBase("ALVMCYBER", "A1", 12);
		assertEquals(false, msg.isContainProducts());
		
		msg = service.checkMobileBase("ALVMCYBER", "A1", 15);
		assertEquals(true, msg.isContainProducts());
		assertTrue(msg.getPrice() > 0);
	}
}
