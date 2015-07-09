package br.usp.icmc.labes.alvmcyber.alvm.order.service;

import javax.jws.Oneway;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface AlvmOrderService 
{
	/**
	 * 
	 * @param offerCode
	 */
	@Oneway
	public void order(@WebParam(name="offerCode") int offerCode);
}