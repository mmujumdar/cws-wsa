//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.15 at 08:28:02 PM IST 
//


package com.cisco.policyconversiontool.dto.wsa.asyncos805;

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
    "proxConfigLdapInterface",
    "proxConfigLdapPageSize"
})
@XmlRootElement(name = "prox_config_ldap_settings")
public class ProxConfigLdapSettings {

    @XmlElement(name = "prox_config_ldap_interface", required = true)
    protected String proxConfigLdapInterface;
    @XmlElement(name = "prox_config_ldap_page_size", required = true)
    protected String proxConfigLdapPageSize;

    /**
     * Gets the value of the proxConfigLdapInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigLdapInterface() {
        return proxConfigLdapInterface;
    }

    /**
     * Sets the value of the proxConfigLdapInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigLdapInterface(String value) {
        this.proxConfigLdapInterface = value;
    }

    /**
     * Gets the value of the proxConfigLdapPageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigLdapPageSize() {
        return proxConfigLdapPageSize;
    }

    /**
     * Sets the value of the proxConfigLdapPageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigLdapPageSize(String value) {
        this.proxConfigLdapPageSize = value;
    }

}
