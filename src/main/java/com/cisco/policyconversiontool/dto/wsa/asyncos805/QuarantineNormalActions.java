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
    "quarantineAction"
})
@XmlRootElement(name = "quarantine_normal_actions")
public class QuarantineNormalActions {

    @XmlElement(name = "quarantine_action", required = true)
    protected String quarantineAction;

    /**
     * Gets the value of the quarantineAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarantineAction() {
        return quarantineAction;
    }

    /**
     * Sets the value of the quarantineAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarantineAction(String value) {
        this.quarantineAction = value;
    }

}