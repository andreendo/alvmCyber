
package alvmpurchase.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orderOfferResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orderOfferResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlvmCyberOfferAck" type="{http://service.purchase.alvm.alvmcyber.labes.icmc.usp.br/}alvmCyberOrderOfferAck" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@andre: I added 'namespace="aa"' in the @XmlType

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderOfferResponse", namespace="aa", propOrder = {
    "alvmCyberOfferAck"
})
public class OrderOfferResponse {

    @XmlElement(name = "AlvmCyberOfferAck")
    protected AlvmCyberOrderOfferAck alvmCyberOfferAck;

    /**
     * Gets the value of the alvmCyberOfferAck property.
     * 
     * @return
     *     possible object is
     *     {@link AlvmCyberOrderOfferAck }
     *     
     */
    public AlvmCyberOrderOfferAck getAlvmCyberOfferAck() {
        return alvmCyberOfferAck;
    }

    /**
     * Sets the value of the alvmCyberOfferAck property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlvmCyberOrderOfferAck }
     *     
     */
    public void setAlvmCyberOfferAck(AlvmCyberOrderOfferAck value) {
        this.alvmCyberOfferAck = value;
    }

}
