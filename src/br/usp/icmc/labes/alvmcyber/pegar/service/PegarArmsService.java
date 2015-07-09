package br.usp.icmc.labes.alvmcyber.pegar.service;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface PegarArmsService 
{
	public @WebResult(name="pegarRespMsg") PegarResponseMessage 
			hasArms(@WebParam(name="clientCode") String clientCode, 
					@WebParam(name="modelType") String model, 
					@WebParam(name="amount") int amount);
}
