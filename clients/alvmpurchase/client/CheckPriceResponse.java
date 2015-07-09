
package alvmpurchase.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkPriceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkPriceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlvmCyberCheckResp" type="{http://service.purchase.alvm.alvmcyber.labes.icmc.usp.br/}alvmCyberCheckPriceResponse" minOccurs="0"/>
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
@XmlType(name = "checkPriceResponse", namespace="aa", propOrder = {
    "alvmCyberCheckResp"
})
public class CheckPriceResponse {

    @XmlElement(name = "AlvmCyberCheckResp")
    protected AlvmCyberCheckPriceResponse alvmCyberCheckResp;

    /**
     * Gets the value of the alvmCyberCheckResp property.
     * 
     * @return
     *     possible object is
     *     {@link AlvmCyberCheckPriceResponse }
     *     
     */
    public AlvmCyberCheckPriceResponse getAlvmCyberCheckResp() {
        return alvmCyberCheckResp;
    }

    /**
     * Sets the value of the alvmCyberCheckResp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlvmCyberCheckPriceResponse }
     *     
     */
    public void setAlvmCyberCheckResp(AlvmCyberCheckPriceResponse value) {
        this.alvmCyberCheckResp = value;
    }

}
