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
    "externalGroup",
    "localGroup"
})
@XmlRootElement(name = "external_group_mapping")
public class ExternalGroupMapping {

    @XmlElement(name = "external_group", required = true)
    protected String externalGroup;
    @XmlElement(name = "local_group", required = true)
    protected String localGroup;

    /**
     * Gets the value of the externalGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalGroup() {
        return externalGroup;
    }

    /**
     * Sets the value of the externalGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalGroup(String value) {
        this.externalGroup = value;
    }

    /**
     * Gets the value of the localGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalGroup() {
        return localGroup;
    }

    /**
     * Sets the value of the localGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalGroup(String value) {
        this.localGroup = value;
    }

}
