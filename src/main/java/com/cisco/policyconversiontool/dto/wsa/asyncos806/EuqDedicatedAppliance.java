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
    "euqName",
    "euqHost",
    "euqPort"
})
@XmlRootElement(name = "euq_dedicated_appliance")
public class EuqDedicatedAppliance {

    @XmlElement(name = "euq_name", required = true)
    protected String euqName;
    @XmlElement(name = "euq_host", required = true)
    protected String euqHost;
    @XmlElement(name = "euq_port", required = true)
    protected String euqPort;

    /**
     * Gets the value of the euqName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqName() {
        return euqName;
    }

    /**
     * Sets the value of the euqName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqName(String value) {
        this.euqName = value;
    }

    /**
     * Gets the value of the euqHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqHost() {
        return euqHost;
    }

    /**
     * Sets the value of the euqHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqHost(String value) {
        this.euqHost = value;
    }

    /**
     * Gets the value of the euqPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqPort() {
        return euqPort;
    }

    /**
     * Sets the value of the euqPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqPort(String value) {
        this.euqPort = value;
    }

}
