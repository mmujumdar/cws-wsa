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
    "proxConfigNtlmInterfaces",
    "proxConfigNtlmSecurityMode",
    "proxConfigNtlmPageSize"
})
@XmlRootElement(name = "prox_config_ntlm_settings")
public class ProxConfigNtlmSettings {

    @XmlElement(name = "prox_config_ntlm_interfaces", required = true)
    protected String proxConfigNtlmInterfaces;
    @XmlElement(name = "prox_config_ntlm_security_mode", required = true)
    protected String proxConfigNtlmSecurityMode;
    @XmlElement(name = "prox_config_ntlm_page_size", required = true)
    protected String proxConfigNtlmPageSize;

    /**
     * Gets the value of the proxConfigNtlmInterfaces property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigNtlmInterfaces() {
        return proxConfigNtlmInterfaces;
    }

    /**
     * Sets the value of the proxConfigNtlmInterfaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigNtlmInterfaces(String value) {
        this.proxConfigNtlmInterfaces = value;
    }

    /**
     * Gets the value of the proxConfigNtlmSecurityMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigNtlmSecurityMode() {
        return proxConfigNtlmSecurityMode;
    }

    /**
     * Sets the value of the proxConfigNtlmSecurityMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigNtlmSecurityMode(String value) {
        this.proxConfigNtlmSecurityMode = value;
    }

    /**
     * Gets the value of the proxConfigNtlmPageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigNtlmPageSize() {
        return proxConfigNtlmPageSize;
    }

    /**
     * Sets the value of the proxConfigNtlmPageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigNtlmPageSize(String value) {
        this.proxConfigNtlmPageSize = value;
    }

}
