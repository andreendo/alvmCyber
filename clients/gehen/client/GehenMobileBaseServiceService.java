
/*
 * 
 */

package gehen.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.2.6
 * Thu Aug 08 17:35:30 BRT 2013
 * Generated source version: 2.2.6
 * 
 */


@WebServiceClient(name = "GehenMobileBaseServiceService", 
                  wsdlLocation = "http://localhost:9002/GehenMobileBaseService?wsdl",
                  targetNamespace = "http://service.gehen.alvmcyber.labes.icmc.usp.br/") 
public class GehenMobileBaseServiceService extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("http://service.gehen.alvmcyber.labes.icmc.usp.br/", "GehenMobileBaseServiceService");
    public final static QName GehenMobileBaseServicePort = new QName("http://service.gehen.alvmcyber.labes.icmc.usp.br/", "GehenMobileBaseServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:9002/GehenMobileBaseService?wsdl");
        } catch (MalformedURLException e) {
            System.err.println("Can not initialize the default wsdl from http://localhost:9002/GehenMobileBaseService?wsdl");
            // e.printStackTrace();
        }
        WSDL_LOCATION = url;
    }

    public GehenMobileBaseServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GehenMobileBaseServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GehenMobileBaseServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    /**
     * 
     * @return
     *     returns GehenMobileBaseService
     */
    @WebEndpoint(name = "GehenMobileBaseServicePort")
    public GehenMobileBaseService getGehenMobileBaseServicePort() {
        return super.getPort(GehenMobileBaseServicePort, GehenMobileBaseService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GehenMobileBaseService
     */
    @WebEndpoint(name = "GehenMobileBaseServicePort")
    public GehenMobileBaseService getGehenMobileBaseServicePort(WebServiceFeature... features) {
        return super.getPort(GehenMobileBaseServicePort, GehenMobileBaseService.class, features);
    }

}
