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
    "proxConfigAuthRealmLdapServerHost",
    "proxConfigAuthRealmLdapServerPort"
})
@XmlRootElement(name = "prox_config_auth_realm_ldap_server")
public class ProxConfigAuthRealmLdapServer {

    @XmlElement(name = "prox_config_auth_realm_ldap_server_host", required = true)
    protected String proxConfigAuthRealmLdapServerHost;
    @XmlElement(name = "prox_config_auth_realm_ldap_server_port")
    protected String proxConfigAuthRealmLdapServerPort;

    /**
     * Gets the value of the proxConfigAuthRealmLdapServerHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapServerHost() {
        return proxConfigAuthRealmLdapServerHost;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapServerHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapServerHost(String value) {
        this.proxConfigAuthRealmLdapServerHost = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapServerPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapServerPort() {
        return proxConfigAuthRealmLdapServerPort;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapServerPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapServerPort(String value) {
        this.proxConfigAuthRealmLdapServerPort = value;
    }

}
