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
    "mcafeeEnabled",
    "mcafeeHeuristicsEnabled",
    "mcafeeNestingLimit",
    "mcafeeNumEngineThreads"
})
@XmlRootElement(name = "mcafee")
public class Mcafee {

    @XmlElement(name = "mcafee_enabled")
    protected String mcafeeEnabled;
    @XmlElement(name = "mcafee_heuristics_enabled")
    protected String mcafeeHeuristicsEnabled;
    @XmlElement(name = "mcafee_nesting_limit")
    protected String mcafeeNestingLimit;
    @XmlElement(name = "mcafee_num_engine_threads")
    protected String mcafeeNumEngineThreads;

    /**
     * Gets the value of the mcafeeEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcafeeEnabled() {
        return mcafeeEnabled;
    }

    /**
     * Sets the value of the mcafeeEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcafeeEnabled(String value) {
        this.mcafeeEnabled = value;
    }

    /**
     * Gets the value of the mcafeeHeuristicsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcafeeHeuristicsEnabled() {
        return mcafeeHeuristicsEnabled;
    }

    /**
     * Sets the value of the mcafeeHeuristicsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcafeeHeuristicsEnabled(String value) {
        this.mcafeeHeuristicsEnabled = value;
    }

    /**
     * Gets the value of the mcafeeNestingLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcafeeNestingLimit() {
        return mcafeeNestingLimit;
    }

    /**
     * Sets the value of the mcafeeNestingLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcafeeNestingLimit(String value) {
        this.mcafeeNestingLimit = value;
    }

    /**
     * Gets the value of the mcafeeNumEngineThreads property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMcafeeNumEngineThreads() {
        return mcafeeNumEngineThreads;
    }

    /**
     * Sets the value of the mcafeeNumEngineThreads property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMcafeeNumEngineThreads(String value) {
        this.mcafeeNumEngineThreads = value;
    }

}
