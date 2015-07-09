
package gehen.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.usp.icmc.labes.alvmcyber.gehen.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckMobileBase_QNAME = new QName("http://service.gehen.alvmcyber.labes.icmc.usp.br/", "checkMobileBase");
    private final static QName _CheckMobileBaseResponse_QNAME = new QName("http://service.gehen.alvmcyber.labes.icmc.usp.br/", "checkMobileBaseResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.usp.icmc.labes.alvmcyber.gehen.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GehenConfirmationMessage }
     * 
     */
    public GehenConfirmationMessage createGehenConfirmationMessage() {
        return new GehenConfirmationMessage();
    }

    /**
     * Create an instance of {@link CheckMobileBase }
     * 
     */
    public CheckMobileBase createCheckMobileBase() {
        return new CheckMobileBase();
    }

    /**
     * Create an instance of {@link CheckMobileBaseResponse }
     * 
     */
    public CheckMobileBaseResponse createCheckMobileBaseResponse() {
        return new CheckMobileBaseResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckMobileBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gehen.alvmcyber.labes.icmc.usp.br/", name = "checkMobileBase")
    public JAXBElement<CheckMobileBase> createCheckMobileBase(CheckMobileBase value) {
        return new JAXBElement<CheckMobileBase>(_CheckMobileBase_QNAME, CheckMobileBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckMobileBaseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.gehen.alvmcyber.labes.icmc.usp.br/", name = "checkMobileBaseResponse")
    public JAXBElement<CheckMobileBaseResponse> createCheckMobileBaseResponse(CheckMobileBaseResponse value) {
        return new JAXBElement<CheckMobileBaseResponse>(_CheckMobileBaseResponse_QNAME, CheckMobileBaseResponse.class, null, value);
    }

}
