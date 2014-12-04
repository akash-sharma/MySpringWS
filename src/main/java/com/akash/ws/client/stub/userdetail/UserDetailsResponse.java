
package com.akash.ws.client.stub.userdetail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullUserDetails" type="{http://data.ws.akash.com/schema/userdetails}fullUserDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fullUserDetails"
})
@XmlRootElement(name = "UserDetailsResponse")
public class UserDetailsResponse {

    @XmlElement(required = true)
    protected FullUserDetails fullUserDetails;

    /**
     * Gets the value of the fullUserDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FullUserDetails }
     *     
     */
    public FullUserDetails getFullUserDetails() {
        return fullUserDetails;
    }

    /**
     * Sets the value of the fullUserDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullUserDetails }
     *     
     */
    public void setFullUserDetails(FullUserDetails value) {
        this.fullUserDetails = value;
    }

}
