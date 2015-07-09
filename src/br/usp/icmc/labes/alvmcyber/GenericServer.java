package br.usp.icmc.labes.alvmcyber;

import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class GenericServer 
{
	private String address;
	private Class serviceClass;
	private Object serviceBean;
	
	public GenericServer(String address, Class serviceClass, Object serviceBean) 
	{
		this.address = address;
		this.serviceClass = serviceClass;
		this.serviceBean = serviceBean;
	}
	
	public void start()
	{
		JaxWsServerFactoryBean svrBean = new JaxWsServerFactoryBean();
		svrBean.setAddress(address);
		svrBean.setServiceClass(serviceClass);
		svrBean.setServiceBean(serviceBean);
		Server server = svrBean.create();
		server.start();
	}
}