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
    "policyStatus",
    "antivirus"
})
@XmlRootElement(name = "antivirus_policy")
public class AntivirusPolicy {

    @XmlElement(name = "policy_status", required = true)
    protected String policyStatus;
    protected Antivirus antivirus;

    /**
     * Gets the value of the policyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyStatus() {
        return policyStatus;
    }

    /**
     * Sets the value of the policyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyStatus(String value) {
        this.policyStatus = value;
    }

    /**
     * Gets the value of the antivirus property.
     * 
     * @return
     *     possible object is
     *     {@link Antivirus }
     *     
     */
    public Antivirus getAntivirus() {
        return antivirus;
    }

    /**
     * Sets the value of the antivirus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Antivirus }
     *     
     */
    public void setAntivirus(Antivirus value) {
        this.antivirus = value;
    }

}
