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
    "proxConfigAuthRealmName",
    "proxConfigAuthRealmLdap",
    "proxConfigAuthRealmAd",
    "proxConfigAuthRealmSchemes"
})
@XmlRootElement(name = "prox_config_auth_realm")
public class ProxConfigAuthRealm {

    @XmlElement(name = "prox_config_auth_realm_name")
    protected String proxConfigAuthRealmName;
    @XmlElement(name = "prox_config_auth_realm_ldap")
    protected ProxConfigAuthRealmLdap proxConfigAuthRealmLdap;
    @XmlElement(name = "prox_config_auth_realm_ad")
    protected ProxConfigAuthRealmAd proxConfigAuthRealmAd;
    @XmlElement(name = "prox_config_auth_realm_schemes")
    protected ProxConfigAuthRealmSchemes proxConfigAuthRealmSchemes;

    /**
     * Gets the value of the proxConfigAuthRealmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmName() {
        return proxConfigAuthRealmName;
    }

    /**
     * Sets the value of the proxConfigAuthRealmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmName(String value) {
        this.proxConfigAuthRealmName = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdap property.
     * 
     * @return
     *     possible object is
     *     {@link ProxConfigAuthRealmLdap }
     *     
     */
    public ProxConfigAuthRealmLdap getProxConfigAuthRealmLdap() {
        return proxConfigAuthRealmLdap;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdap property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxConfigAuthRealmLdap }
     *     
     */
    public void setProxConfigAuthRealmLdap(ProxConfigAuthRealmLdap value) {
        this.proxConfigAuthRealmLdap = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmAd property.
     * 
     * @return
     *     possible object is
     *     {@link ProxConfigAuthRealmAd }
     *     
     */
    public ProxConfigAuthRealmAd getProxConfigAuthRealmAd() {
        return proxConfigAuthRealmAd;
    }

    /**
     * Sets the value of the proxConfigAuthRealmAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxConfigAuthRealmAd }
     *     
     */
    public void setProxConfigAuthRealmAd(ProxConfigAuthRealmAd value) {
        this.proxConfigAuthRealmAd = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmSchemes property.
     * 
     * @return
     *     possible object is
     *     {@link ProxConfigAuthRealmSchemes }
     *     
     */
    public ProxConfigAuthRealmSchemes getProxConfigAuthRealmSchemes() {
        return proxConfigAuthRealmSchemes;
    }

    /**
     * Sets the value of the proxConfigAuthRealmSchemes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxConfigAuthRealmSchemes }
     *     
     */
    public void setProxConfigAuthRealmSchemes(ProxConfigAuthRealmSchemes value) {
        this.proxConfigAuthRealmSchemes = value;
    }

}