//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.26 at 05:46:49 PM IST 
//


package com.cisco.policyconversiontool.dto.wsa.asyncos806;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "profiles",
    "signingKeys",
    "verify"
})
@XmlRootElement(name = "domainkeys")
public class Domainkeys {

    @XmlElement(required = true)
    protected String profiles;
    @XmlElement(name = "signing_keys", required = true)
    protected String signingKeys;
    @XmlElement(required = true)
    protected String verify;

    /**
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfiles(String value) {
        this.profiles = value;
    }

    /**
     * Gets the value of the signingKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigningKeys() {
        return signingKeys;
    }

    /**
     * Sets the value of the signingKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigningKeys(String value) {
        this.signingKeys = value;
    }

    /**
     * Gets the value of the verify property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerify() {
        return verify;
    }

    /**
     * Sets the value of the verify property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerify(String value) {
        this.verify = value;
    }

}
