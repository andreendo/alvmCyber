
package alvmpurchase.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alvmCyberCheckPriceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alvmCyberCheckPriceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfRobots" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="offerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="unitPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="validOffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alvmCyberCheckPriceResponse", propOrder = {
    "clientId",
    "message",
    "numberOfRobots",
    "offerCode",
    "totalPrice",
    "unitPrice",
    "validOffer"
})
public class AlvmCyberCheckPriceResponse {

    protected String clientId;
    protected String message;
    protected int numberOfRobots;
    protected int offerCode;
    protected double totalPrice;
    protected double unitPrice;
    protected boolean validOffer;

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the numberOfRobots property.
     * 
     */
    public int getNumberOfRobots() {
        return numberOfRobots;
    }

    /**
     * Sets the value of the numberOfRobots property.
     * 
     */
    public void setNumberOfRobots(int value) {
        this.numberOfRobots = value;
    }

    /**
     * Gets the value of the offerCode property.
     * 
     */
    public int getOfferCode() {
        return offerCode;
    }

    /**
     * Sets the value of the offerCode property.
     * 
     */
    public void setOfferCode(int value) {
        this.offerCode = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     */
    public void setTotalPrice(double value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     */
    public double getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     */
    public void setUnitPrice(double value) {
        this.unitPrice = value;
    }

    /**
     * Gets the value of the validOffer property.
     * 
     */
    public boolean isValidOffer() {
        return validOffer;
    }

    /**
     * Sets the value of the validOffer property.
     * 
     */
    public void setValidOffer(boolean value) {
        this.validOffer = value;
    }

}
