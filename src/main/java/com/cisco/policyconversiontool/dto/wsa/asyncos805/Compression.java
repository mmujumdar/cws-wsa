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
    "compressionType",
    "compressionLevel"
})
@XmlRootElement(name = "compression")
public class Compression {

    @XmlElement(name = "compression-type", required = true)
    protected String compressionType;
    @XmlElement(name = "compression-level", required = true)
    protected String compressionLevel;

    /**
     * Gets the value of the compressionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressionType() {
        return compressionType;
    }

    /**
     * Sets the value of the compressionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompressionType(String value) {
        this.compressionType = value;
    }

    /**
     * Gets the value of the compressionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompressionLevel() {
        return compressionLevel;
    }

    /**
     * Sets the value of the compressionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompressionLevel(String value) {
        this.compressionLevel = value;
    }

}