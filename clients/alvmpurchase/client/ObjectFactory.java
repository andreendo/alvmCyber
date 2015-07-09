
package alvmpurchase.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.usp.icmc.labes.alvmcyber.alvm.purchase.service package. 
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

    private final static QName _OrderOfferResponse_QNAME = new QName("http://service.purchase.alvm.alvmcyber.labes.icmc.usp.br/", "orderOfferResponse");
    private final static QName _CheckPrice_QNAME = new QName("http://service.purchase.alvm.alvmcyber.labes.icmc.usp.br/", "checkPrice");
    private final static QName _CheckPriceResponse_QNAME = new QName("http://service.purchase.alvm.alvmcyber.labes.icmc.usp.br/", "checkPriceResponse");
    private final static QName _OrderOffer_QNAME = new QName("http://service.purchase.alvm.alvmcyber.labes.icmc.usp.br/", "orderOffer");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.usp.icmc.labes.alvmcyber.alvm.purchase.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AlvmCyberCheckPriceResponse }
     * 
     */
    public AlvmCyberCheckPriceResponse createAlvmCyberCheckPriceResponse() {
        return new AlvmCyberCheckPriceResponse();
    }

    /**
     * Create an instance of {@link AlvmCyberOrderOfferAck }
     * 
     */
    public AlvmCyberOrderOfferAck createAlvmCyberOrderOfferAck() {
        return new AlvmCyberOrderOfferAck();
    }

    /**
     * Create an instance of {@link OrderOfferResponse }
     * 
     */
    public OrderOfferResponse createOrderOfferResponse() {
        return new OrderOfferResponse();
    }

    /**
     * Create an instance of {@link CheckPriceResponse }
     * 
     */
    public CheckPriceResponse createCheckPriceResponse() {
        return new CheckPriceResponse();
    }

    /**
     * Create an instance of {@link OrderOffer }
     * 
     */
    public OrderOffer createOrderOffer() {
        return new OrderOffer();
    }

    /**
     * Create an instance of {@link CheckPrice }
     * 
     */
    public CheckPrice createCheckPrice() {
        return new CheckPrice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderOfferResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.purchase.alvm.alvmcyber.labes.icmc.usp.br/", name = "orderOfferResponse")
    public JAXBElement<OrderOfferResponse> createOrderOfferResponse(OrderOfferResponse value) {
        return new JAXBElement<OrderOfferResponse>(_OrderOfferResponse_QNAME, OrderOfferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.purchase.alvm.alvmcyber.labes.icmc.usp.br/", name = "checkPrice")
    public JAXBElement<CheckPrice> createCheckPrice(CheckPrice value) {
        return new JAXBElement<CheckPrice>(_CheckPrice_QNAME, CheckPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.purchase.alvm.alvmcyber.labes.icmc.usp.br/", name = "checkPriceResponse")
    public JAXBElement<CheckPriceResponse> createCheckPriceResponse(CheckPriceResponse value) {
        return new JAXBElement<CheckPriceResponse>(_CheckPriceResponse_QNAME, CheckPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderOffer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.purchase.alvm.alvmcyber.labes.icmc.usp.br/", name = "orderOffer")
    public JAXBElement<OrderOffer> createOrderOffer(OrderOffer value) {
        return new JAXBElement<OrderOffer>(_OrderOffer_QNAME, OrderOffer.class, null, value);
    }

}
