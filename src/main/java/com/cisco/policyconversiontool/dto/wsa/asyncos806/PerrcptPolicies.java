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
    "inboundPolicies",
    "outboundPolicies"
})
@XmlRootElement(name = "perrcpt_policies")
public class PerrcptPolicies {

    @XmlElement(name = "inbound_policies")
    protected InboundPolicies inboundPolicies;
    @XmlElement(name = "outbound_policies")
    protected OutboundPolicies outboundPolicies;

    /**
     * Gets the value of the inboundPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link InboundPolicies }
     *     
     */
    public InboundPolicies getInboundPolicies() {
        return inboundPolicies;
    }

    /**
     * Sets the value of the inboundPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link InboundPolicies }
     *     
     */
    public void setInboundPolicies(InboundPolicies value) {
        this.inboundPolicies = value;
    }

    /**
     * Gets the value of the outboundPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link OutboundPolicies }
     *     
     */
    public OutboundPolicies getOutboundPolicies() {
        return outboundPolicies;
    }

    /**
     * Sets the value of the outboundPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutboundPolicies }
     *     
     */
    public void setOutboundPolicies(OutboundPolicies value) {
        this.outboundPolicies = value;
    }

}
