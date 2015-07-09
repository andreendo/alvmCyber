package br.usp.icmc.labes.alvmcyber.gehen.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.usp.icmc.labes.alvmcyber.gehen.service.GehenConfirmationMessage;

@WebService
public interface GehenMobileBaseService 
{
	/**
	 * 
	 * @param clientCode
	 * @param model
	 * @param amount
	 * @return -
	 */
	public @WebResult(name="gehenConfMsg") GehenConfirmationMessage 
				checkMobileBase(@WebParam(name="clientCode") String clientCode, 
								@WebParam(name="modelType") String model, 
								@WebParam(name="amount") int amount);
}
