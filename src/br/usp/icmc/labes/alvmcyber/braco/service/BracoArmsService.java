package br.usp.icmc.labes.alvmcyber.braco.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface BracoArmsService 
{
	public @WebResult(name="bracoRespMsg") BracoResponseMessage 
				hasArms(@WebParam(name="clientCode") String clientCode, 
						 @WebParam(name="modelType") String model, 
						 @WebParam(name="amount") int amount);
}
