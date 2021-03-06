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
    "caseSuspectThreshold",
    "caseSpamThreshold",
    "caseEnableEe"
})
@XmlRootElement(name = "case_policy")
public class CasePolicy {

    @XmlElement(name = "case_suspect_threshold", required = true)
    protected String caseSuspectThreshold;
    @XmlElement(name = "case_spam_threshold", required = true)
    protected String caseSpamThreshold;
    @XmlElement(name = "case_enable_ee", required = true)
    protected String caseEnableEe;

    /**
     * Gets the value of the caseSuspectThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseSuspectThreshold() {
        return caseSuspectThreshold;
    }

    /**
     * Sets the value of the caseSuspectThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseSuspectThreshold(String value) {
        this.caseSuspectThreshold = value;
    }

    /**
     * Gets the value of the caseSpamThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseSpamThreshold() {
        return caseSpamThreshold;
    }

    /**
     * Sets the value of the caseSpamThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseSpamThreshold(String value) {
        this.caseSpamThreshold = value;
    }

    /**
     * Gets the value of the caseEnableEe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseEnableEe() {
        return caseEnableEe;
    }

    /**
     * Sets the value of the caseEnableEe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseEnableEe(String value) {
        this.caseEnableEe = value;
    }

}
