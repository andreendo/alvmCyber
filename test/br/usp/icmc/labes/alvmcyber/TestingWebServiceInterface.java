package br.usp.icmc.labes.alvmcyber;

import gehen.client.GehenConfirmationMessage;
import gehen.client.GehenMobileBaseService;
import gehen.client.GehenMobileBaseServiceService;

import org.junit.Test;

import alvm.client.AlvmOrderService;
import alvm.client.AlvmOrderServiceService;
import alvmpurchase.client.AlvmCyberCheckPriceResponse;
import alvmpurchase.client.AlvmCyberOrderOfferAck;
import alvmpurchase.client.AlvmCyberPurchaseService;
import alvmpurchase.client.AlvmCyberPurchaseServiceService;
import braco.client.BracoArmsService;
import braco.client.BracoArmsServiceService;

import pegar.client.PegarArmsService;
import pegar.client.PegarArmsServiceService;
import static org.junit.Assert.*;

public class TestingWebServiceInterface 
{
	@Test
	public void test_single_services_01()
	{
		GehenMobileBaseService gehenService = (new GehenMobileBaseServiceService()).getGehenMobileBaseServicePort();
		GehenConfirmationMessage gehenConfMsg = gehenService.checkMobileBase("", "", 0);
		assertFalse( gehenConfMsg.isContainProducts() );
		assertTrue( gehenConfMsg.getMessage().endsWith("The amount provided was invalid.") );
		
		gehenConfMsg = gehenService.checkMobileBase("", "aaa", 10);
		assertFalse( gehenConfMsg.isContainProducts() );
		assertTrue( gehenConfMsg.getMessage().endsWith("The client code provided was invalid.") );
		
		gehenConfMsg = gehenService.checkMobileBase("ALVMCYBER", "aaa", 10);
		assertFalse( gehenConfMsg.isContainProducts() );
		assertTrue( gehenConfMsg.getMessage().endsWith("The model provided was invalid.") );
		
		gehenConfMsg = gehenService.checkMobileBase("ALVMCYBER", "A1", 10);
		assertFalse( gehenConfMsg.isContainProducts() );
		assertTrue( gehenConfMsg.getMessage().endsWith("Sorry. We do not have the products.") );
		
		gehenConfMsg = gehenService.checkMobileBase("ALVMCYBER", "A1", 13);
		assertTrue( gehenConfMsg.isContainProducts() );
	}
	
	@Test
	public void test_single_services_02()
	{
		PegarArmsService pasService = (new PegarArmsServiceService()).getPegarArmsServicePort();
		pasService.hasArms("some", "some", 12);
		
		BracoArmsService basService = (new BracoArmsServiceService()).getBracoArmsServicePort();
		basService.hasArms("some", "some", 11);
		
		AlvmOrderService aosService = (new AlvmOrderServiceService()).getAlvmOrderServicePort();
		aosService.order(12);
		
		AlvmCyberPurchaseService acpsService = (new AlvmCyberPurchaseServiceService()).getAlvmCyberPurchaseServicePort();
		acpsService.checkPrice("someCode", 2000);
		acpsService.orderOffer("someid", 12);
	}
	
	@Test
	public void test_single_services_03()
	{
		AlvmCyberPurchaseService acpsService = (new AlvmCyberPurchaseServiceService()).getAlvmCyberPurchaseServicePort();
		AlvmCyberCheckPriceResponse acpsResp = acpsService.checkPrice("ABC", 11);
		assertEquals("ABC", acpsResp.getClientId());
		assertTrue( acpsResp.isValidOffer() );
		assertTrue( acpsResp.getMessage().startsWith("SUCCESS") );
		assertEquals(11, acpsResp.getNumberOfRobots());
		assertTrue( acpsResp.getOfferCode() > 0 );
		
		AlvmCyberOrderOfferAck ackMsg = acpsService.orderOffer("ABC", acpsResp.getOfferCode());
		assertEquals("SUCCESS: Your offer has been ordered. Wait for contact.", ackMsg.getMessage());
	}	
	
	@Test
	public void test_single_services_04()
	{
		AlvmCyberPurchaseService acpsService = (new AlvmCyberPurchaseServiceService()).getAlvmCyberPurchaseServicePort();
		AlvmCyberCheckPriceResponse acpsResp = acpsService.checkPrice("ABC", 101);
		assertEquals("ABC", acpsResp.getClientId());
		assertTrue( acpsResp.isValidOffer() );
		assertTrue( acpsResp.getMessage().startsWith("SUCCESS") );
		assertEquals(101, acpsResp.getNumberOfRobots());
		assertTrue( acpsResp.getOfferCode() > 0 );
		
		AlvmCyberOrderOfferAck ackMsg = acpsService.orderOffer("ABC", acpsResp.getOfferCode());
		assertEquals("SUCCESS: Your offer has been ordered. Wait for contact.", ackMsg.getMessage());
	}	

	@Test
	public void test_single_services_05()
	{
		AlvmCyberPurchaseService acpsService = (new AlvmCyberPurchaseServiceService()).getAlvmCyberPurchaseServicePort();
		AlvmCyberCheckPriceResponse acpsResp = acpsService.checkPrice("ABC", 102);
		assertEquals("ABC", acpsResp.getClientId());
		assertFalse( acpsResp.isValidOffer() );
		assertTrue( acpsResp.getMessage().startsWith("ERROR: there is no mobile base. no purchase.") );
		assertEquals(102, acpsResp.getNumberOfRobots());
		
	}
}