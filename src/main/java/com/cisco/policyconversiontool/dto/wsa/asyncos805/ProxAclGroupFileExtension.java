//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.15 at 08:28:02 PM IST 
//


package com.cisco.policyconversiontool.dto.wsa.asyncos805;

import java.io.Serializable;

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
    "fileExtension",
    "fileExtensionAction"
})
@XmlRootElement(name = "prox_acl_group_file_extension")
public class ProxAclGroupFileExtension implements Serializable{

    @XmlElement(name = "file_extension", required = true)
    protected String fileExtension;
    @XmlElement(name = "file_extension_action", required = true)
    protected String fileExtensionAction;

    /**
     * Gets the value of the fileExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileExtension() {
        return fileExtension;
    }

    /**
     * Sets the value of the fileExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileExtension(String value) {
        this.fileExtension = value;
    }

    /**
     * Gets the value of the fileExtensionAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileExtensionAction() {
        return fileExtensionAction;
    }

    /**
     * Sets the value of the fileExtensionAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileExtensionAction(String value) {
        this.fileExtensionAction = value;
    }

}