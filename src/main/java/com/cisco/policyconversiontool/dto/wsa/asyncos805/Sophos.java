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
    "sophosEnabled",
    "sophosNestingLimit",
    "sophosNumEngineThreads"
})
@XmlRootElement(name = "sophos")
public class Sophos {

    @XmlElement(name = "sophos_enabled")
    protected String sophosEnabled;
    @XmlElement(name = "sophos_nesting_limit")
    protected String sophosNestingLimit;
    @XmlElement(name = "sophos_num_engine_threads")
    protected String sophosNumEngineThreads;

    /**
     * Gets the value of the sophosEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSophosEnabled() {
        return sophosEnabled;
    }

    /**
     * Sets the value of the sophosEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSophosEnabled(String value) {
        this.sophosEnabled = value;
    }

    /**
     * Gets the value of the sophosNestingLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSophosNestingLimit() {
        return sophosNestingLimit;
    }

    /**
     * Sets the value of the sophosNestingLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSophosNestingLimit(String value) {
        this.sophosNestingLimit = value;
    }

    /**
     * Gets the value of the sophosNumEngineThreads property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSophosNumEngineThreads() {
        return sophosNumEngineThreads;
    }

    /**
     * Sets the value of the sophosNumEngineThreads property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSophosNumEngineThreads(String value) {
        this.sophosNumEngineThreads = value;
    }

}
