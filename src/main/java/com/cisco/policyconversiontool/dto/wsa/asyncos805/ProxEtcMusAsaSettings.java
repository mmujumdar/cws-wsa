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
    "proxEtcMusAsaSettingsEnabled",
    "proxEtcMusAsaSettingsSharedSecret",
    "proxEtcMusAsaSettingsTimeInterval",
    "proxEtcMusAsaSettingsAsaConfig"
})
@XmlRootElement(name = "prox_etc_mus_asa_settings")
public class ProxEtcMusAsaSettings {

    @XmlElement(name = "prox_etc_mus_asa_settings_enabled", required = true)
    protected String proxEtcMusAsaSettingsEnabled;
    @XmlElement(name = "prox_etc_mus_asa_settings_shared_secret")
    protected String proxEtcMusAsaSettingsSharedSecret;
    @XmlElement(name = "prox_etc_mus_asa_settings_time_interval", required = true)
    protected String proxEtcMusAsaSettingsTimeInterval;
    @XmlElement(name = "prox_etc_mus_asa_settings_asa_config", required = true)
    protected ProxEtcMusAsaSettingsAsaConfig proxEtcMusAsaSettingsAsaConfig;

    /**
     * Gets the value of the proxEtcMusAsaSettingsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxEtcMusAsaSettingsEnabled() {
        return proxEtcMusAsaSettingsEnabled;
    }

    /**
     * Sets the value of the proxEtcMusAsaSettingsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxEtcMusAsaSettingsEnabled(String value) {
        this.proxEtcMusAsaSettingsEnabled = value;
    }

    /**
     * Gets the value of the proxEtcMusAsaSettingsSharedSecret property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxEtcMusAsaSettingsSharedSecret() {
        return proxEtcMusAsaSettingsSharedSecret;
    }

    /**
     * Sets the value of the proxEtcMusAsaSettingsSharedSecret property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxEtcMusAsaSettingsSharedSecret(String value) {
        this.proxEtcMusAsaSettingsSharedSecret = value;
    }

    /**
     * Gets the value of the proxEtcMusAsaSettingsTimeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxEtcMusAsaSettingsTimeInterval() {
        return proxEtcMusAsaSettingsTimeInterval;
    }

    /**
     * Sets the value of the proxEtcMusAsaSettingsTimeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxEtcMusAsaSettingsTimeInterval(String value) {
        this.proxEtcMusAsaSettingsTimeInterval = value;
    }

    /**
     * Gets the value of the proxEtcMusAsaSettingsAsaConfig property.
     * 
     * @return
     *     possible object is
     *     {@link ProxEtcMusAsaSettingsAsaConfig }
     *     
     */
    public ProxEtcMusAsaSettingsAsaConfig getProxEtcMusAsaSettingsAsaConfig() {
        return proxEtcMusAsaSettingsAsaConfig;
    }

    /**
     * Sets the value of the proxEtcMusAsaSettingsAsaConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxEtcMusAsaSettingsAsaConfig }
     *     
     */
    public void setProxEtcMusAsaSettingsAsaConfig(ProxEtcMusAsaSettingsAsaConfig value) {
        this.proxEtcMusAsaSettingsAsaConfig = value;
    }

}
