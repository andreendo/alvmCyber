
package gehen.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkMobileBaseResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkMobileBaseResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gehenConfMsg" type="{http://service.gehen.alvmcyber.labes.icmc.usp.br/}gehenConfirmationMessage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkMobileBaseResponse", namespace="aa", propOrder = {
    "gehenConfMsg"
})
public class CheckMobileBaseResponse {

    protected GehenConfirmationMessage gehenConfMsg;

    /**
     * Gets the value of the gehenConfMsg property.
     * 
     * @return
     *     possible object is
     *     {@link GehenConfirmationMessage }
     *     
     */
    public GehenConfirmationMessage getGehenConfMsg() {
        return gehenConfMsg;
    }

    /**
     * Sets the value of the gehenConfMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link GehenConfirmationMessage }
     *     
     */
    public void setGehenConfMsg(GehenConfirmationMessage value) {
        this.gehenConfMsg = value;
    }

}
