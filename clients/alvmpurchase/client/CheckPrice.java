
package alvmpurchase.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkPrice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfRobots" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "checkPrice", namespace="aa", propOrder = {
    "clientId",
    "numberOfRobots"
})
public class CheckPrice {

    protected String clientId;
    protected int numberOfRobots;

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

}
