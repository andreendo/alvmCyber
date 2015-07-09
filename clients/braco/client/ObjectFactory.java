
package braco.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.usp.icmc.labes.alvmcyber.braco.service package. 
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

    private final static QName _HasArms_QNAME = new QName("http://service.braco.alvmcyber.labes.icmc.usp.br/", "hasArms");
    private final static QName _HasArmsResponse_QNAME = new QName("http://service.braco.alvmcyber.labes.icmc.usp.br/", "hasArmsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.usp.icmc.labes.alvmcyber.braco.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HasArms }
     * 
     */
    public HasArms createHasArms() {
        return new HasArms();
    }

    /**
     * Create an instance of {@link HasArmsResponse }
     * 
     */
    public HasArmsResponse createHasArmsResponse() {
        return new HasArmsResponse();
    }

    /**
     * Create an instance of {@link BracoResponseMessage }
     * 
     */
    public BracoResponseMessage createBracoResponseMessage() {
        return new BracoResponseMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasArms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.braco.alvmcyber.labes.icmc.usp.br/", name = "hasArms")
    public JAXBElement<HasArms> createHasArms(HasArms value) {
        return new JAXBElement<HasArms>(_HasArms_QNAME, HasArms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasArmsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.braco.alvmcyber.labes.icmc.usp.br/", name = "hasArmsResponse")
    public JAXBElement<HasArmsResponse> createHasArmsResponse(HasArmsResponse value) {
        return new JAXBElement<HasArmsResponse>(_HasArmsResponse_QNAME, HasArmsResponse.class, null, value);
    }

}
