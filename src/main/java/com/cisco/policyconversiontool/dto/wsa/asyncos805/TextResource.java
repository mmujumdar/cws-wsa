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
    "textResourceName",
    "textResourceType",
    "textResourceData",
    "textResourceEncoding"
})
@XmlRootElement(name = "text_resource")
public class TextResource {

    @XmlElement(name = "text_resource_name", required = true)
    protected String textResourceName;
    @XmlElement(name = "text_resource_type", required = true)
    protected String textResourceType;
    @XmlElement(name = "text_resource_data", required = true)
    protected String textResourceData;
    @XmlElement(name = "text_resource_encoding")
    protected String textResourceEncoding;

    /**
     * Gets the value of the textResourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextResourceName() {
        return textResourceName;
    }

    /**
     * Sets the value of the textResourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextResourceName(String value) {
        this.textResourceName = value;
    }

    /**
     * Gets the value of the textResourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextResourceType() {
        return textResourceType;
    }

    /**
     * Sets the value of the textResourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextResourceType(String value) {
        this.textResourceType = value;
    }

    /**
     * Gets the value of the textResourceData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextResourceData() {
        return textResourceData;
    }

    /**
     * Sets the value of the textResourceData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextResourceData(String value) {
        this.textResourceData = value;
    }

    /**
     * Gets the value of the textResourceEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextResourceEncoding() {
        return textResourceEncoding;
    }

    /**
     * Sets the value of the textResourceEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextResourceEncoding(String value) {
        this.textResourceEncoding = value;
    }

}
