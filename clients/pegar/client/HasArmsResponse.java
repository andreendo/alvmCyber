
package pegar.client;

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
 *         &lt;element name="pegarRespMsg" type="{http://service.pegar.alvmcyber.labes.icmc.usp.br/}pegarResponseMessage" minOccurs="0"/>
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
    "pegarRespMsg"
})
public class HasArmsResponse {

    protected PegarResponseMessage pegarRespMsg;

    /**
     * Gets the value of the pegarRespMsg property.
     * 
     * @return
     *     possible object is
     *     {@link PegarResponseMessage }
     *     
     */
    public PegarResponseMessage getPegarRespMsg() {
        return pegarRespMsg;
    }

    /**
     * Sets the value of the pegarRespMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link PegarResponseMessage }
     *     
     */
    public void setPegarRespMsg(PegarResponseMessage value) {
        this.pegarRespMsg = value;
    }

}
