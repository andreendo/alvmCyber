
package braco.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for hasArmsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="hasArmsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bracoRespMsg" type="{http://service.braco.alvmcyber.labes.icmc.usp.br/}bracoResponseMessage" minOccurs="0"/>
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
@XmlType(name = "hasArmsResponse", namespace="aa", propOrder = {
    "bracoRespMsg"
})
public class HasArmsResponse {

    protected BracoResponseMessage bracoRespMsg;

    /**
     * Gets the value of the bracoRespMsg property.
     * 
     * @return
     *     possible object is
     *     {@link BracoResponseMessage }
     *     
     */
    public BracoResponseMessage getBracoRespMsg() {
        return bracoRespMsg;
    }

    /**
     * Sets the value of the bracoRespMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BracoResponseMessage }
     *     
     */
    public void setBracoRespMsg(BracoResponseMessage value) {
        this.bracoRespMsg = value;
    }

}
