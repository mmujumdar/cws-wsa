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
    "modePermissionMode",
    "modePermissionAccess"
})
@XmlRootElement(name = "mode_permission")
public class ModePermission {

    @XmlElement(name = "mode_permission_mode", required = true)
    protected String modePermissionMode;
    @XmlElement(name = "mode_permission_access", required = true)
    protected String modePermissionAccess;

    /**
     * Gets the value of the modePermissionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModePermissionMode() {
        return modePermissionMode;
    }

    /**
     * Sets the value of the modePermissionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModePermissionMode(String value) {
        this.modePermissionMode = value;
    }

    /**
     * Gets the value of the modePermissionAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModePermissionAccess() {
        return modePermissionAccess;
    }

    /**
     * Sets the value of the modePermissionAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModePermissionAccess(String value) {
        this.modePermissionAccess = value;
    }

}
