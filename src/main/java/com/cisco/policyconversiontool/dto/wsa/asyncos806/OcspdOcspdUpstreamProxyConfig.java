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
    "ocspdOcspdUpstreamProxyEnabled",
    "ocspdOcspdUpstreamProxyGroup",
    "ocspdOcspdUpstreamProxyExemptList"
})
@XmlRootElement(name = "ocspd_ocspd_upstream_proxy_config")
public class OcspdOcspdUpstreamProxyConfig {

    @XmlElement(name = "ocspd_ocspd_upstream_proxy_enabled", required = true)
    protected String ocspdOcspdUpstreamProxyEnabled;
    @XmlElement(name = "ocspd_ocspd_upstream_proxy_group", required = true)
    protected String ocspdOcspdUpstreamProxyGroup;
    @XmlElement(name = "ocspd_ocspd_upstream_proxy_exempt_list", required = true)
    protected OcspdOcspdUpstreamProxyExemptList ocspdOcspdUpstreamProxyExemptList;

    /**
     * Gets the value of the ocspdOcspdUpstreamProxyEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcspdOcspdUpstreamProxyEnabled() {
        return ocspdOcspdUpstreamProxyEnabled;
    }

    /**
     * Sets the value of the ocspdOcspdUpstreamProxyEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcspdOcspdUpstreamProxyEnabled(String value) {
        this.ocspdOcspdUpstreamProxyEnabled = value;
    }

    /**
     * Gets the value of the ocspdOcspdUpstreamProxyGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcspdOcspdUpstreamProxyGroup() {
        return ocspdOcspdUpstreamProxyGroup;
    }

    /**
     * Sets the value of the ocspdOcspdUpstreamProxyGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcspdOcspdUpstreamProxyGroup(String value) {
        this.ocspdOcspdUpstreamProxyGroup = value;
    }

    /**
     * Gets the value of the ocspdOcspdUpstreamProxyExemptList property.
     * 
     * @return
     *     possible object is
     *     {@link OcspdOcspdUpstreamProxyExemptList }
     *     
     */
    public OcspdOcspdUpstreamProxyExemptList getOcspdOcspdUpstreamProxyExemptList() {
        return ocspdOcspdUpstreamProxyExemptList;
    }

    /**
     * Sets the value of the ocspdOcspdUpstreamProxyExemptList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OcspdOcspdUpstreamProxyExemptList }
     *     
     */
    public void setOcspdOcspdUpstreamProxyExemptList(OcspdOcspdUpstreamProxyExemptList value) {
        this.ocspdOcspdUpstreamProxyExemptList = value;
    }

}
