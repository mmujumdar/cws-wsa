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
    "fkAutoApply",
    "fkAutoCheck",
    "fkLocalUrl",
    "fkServerType",
    "fkSrcIpIface"
})
@XmlRootElement(name = "feature_key_conf")
public class FeatureKeyConf {

    @XmlElement(name = "fk_auto_apply", required = true)
    protected String fkAutoApply;
    @XmlElement(name = "fk_auto_check", required = true)
    protected String fkAutoCheck;
    @XmlElement(name = "fk_local_url", required = true)
    protected String fkLocalUrl;
    @XmlElement(name = "fk_server_type", required = true)
    protected String fkServerType;
    @XmlElement(name = "fk_src_ip_iface", required = true)
    protected String fkSrcIpIface;

    /**
     * Gets the value of the fkAutoApply property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkAutoApply() {
        return fkAutoApply;
    }

    /**
     * Sets the value of the fkAutoApply property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkAutoApply(String value) {
        this.fkAutoApply = value;
    }

    /**
     * Gets the value of the fkAutoCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkAutoCheck() {
        return fkAutoCheck;
    }

    /**
     * Sets the value of the fkAutoCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkAutoCheck(String value) {
        this.fkAutoCheck = value;
    }

    /**
     * Gets the value of the fkLocalUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkLocalUrl() {
        return fkLocalUrl;
    }

    /**
     * Sets the value of the fkLocalUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkLocalUrl(String value) {
        this.fkLocalUrl = value;
    }

    /**
     * Gets the value of the fkServerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkServerType() {
        return fkServerType;
    }

    /**
     * Sets the value of the fkServerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkServerType(String value) {
        this.fkServerType = value;
    }

    /**
     * Gets the value of the fkSrcIpIface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkSrcIpIface() {
        return fkSrcIpIface;
    }

    /**
     * Sets the value of the fkSrcIpIface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkSrcIpIface(String value) {
        this.fkSrcIpIface = value;
    }

}
