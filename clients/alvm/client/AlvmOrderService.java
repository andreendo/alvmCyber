package alvm.client;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;

/**
 * This class was generated by Apache CXF 2.2.6
 * Thu Aug 08 16:44:26 BRT 2013
 * Generated source version: 2.2.6
 * 
 */
 
@WebService(targetNamespace = "http://service.order.alvm.alvmcyber.labes.icmc.usp.br/", name = "AlvmOrderService")
@XmlSeeAlso({ObjectFactory.class})
public interface AlvmOrderService {

    @Oneway
    @RequestWrapper(localName = "order", targetNamespace = "http://service.order.alvm.alvmcyber.labes.icmc.usp.br/", className = "br.usp.icmc.labes.alvmcyber.alvm.order.service.Order")
    @WebMethod
    public void order(
        @WebParam(name = "offerCode", targetNamespace = "")
        int offerCode
    );
}
