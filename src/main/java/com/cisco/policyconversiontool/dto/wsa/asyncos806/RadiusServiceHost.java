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
    "radiusHostname",
    "radiusPort",
    "radiusSharedSecret",
    "radiusTimeout",
    "radiusAuthType"
})
@XmlRootElement(name = "radius_service_host")
public class RadiusServiceHost {

    @XmlElement(name = "radius_hostname", required = true)
    protected String radiusHostname;
    @XmlElement(name = "radius_port", required = true)
    protected String radiusPort;
    @XmlElement(name = "radius_shared_secret", required = true)
    protected String radiusSharedSecret;
    @XmlElement(name = "radius_timeout", required = true)
    protected String radiusTimeout;
    @XmlElement(name = "radius_auth_type")
    protected String radiusAuthType;

    /**
     * Gets the value of the radiusHostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadiusHostname() {
        return radiusHostname;
    }

    /**
     * Sets the value of the radiusHostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadiusHostname(String value) {
        this.radiusHostname = value;
    }

    /**
     * Gets the value of the radiusPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadiusPort() {
        return radiusPort;
    }

    /**
     * Sets the value of the radiusPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadiusPort(String value) {
        this.radiusPort = value;
    }

    /**
     * Gets the value of the radiusSharedSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadiusSharedSecret() {
        return radiusSharedSecret;
    }

    /**
     * Sets the value of the radiusSharedSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadiusSharedSecret(String value) {
        this.radiusSharedSecret = value;
    }

    /**
     * Gets the value of the radiusTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadiusTimeout() {
        return radiusTimeout;
    }

    /**
     * Sets the value of the radiusTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadiusTimeout(String value) {
        this.radiusTimeout = value;
    }

    /**
     * Gets the value of the radiusAuthType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadiusAuthType() {
        return radiusAuthType;
    }

    /**
     * Sets the value of the radiusAuthType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadiusAuthType(String value) {
        this.radiusAuthType = value;
    }

}
