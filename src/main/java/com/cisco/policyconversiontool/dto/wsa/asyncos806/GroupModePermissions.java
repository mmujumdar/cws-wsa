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
    "group",
    "modePermissions"
})
@XmlRootElement(name = "group_mode_permissions")
public class GroupModePermissions {

    @XmlElement(required = true)
    protected String group;
    @XmlElement(name = "mode_permissions", required = true)
    protected ModePermissions modePermissions;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * Gets the value of the modePermissions property.
     * 
     * @return
     *     possible object is
     *     {@link ModePermissions }
     *     
     */
    public ModePermissions getModePermissions() {
        return modePermissions;
    }

    /**
     * Sets the value of the modePermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModePermissions }
     *     
     */
    public void setModePermissions(ModePermissions value) {
        this.modePermissions = value;
    }

}
