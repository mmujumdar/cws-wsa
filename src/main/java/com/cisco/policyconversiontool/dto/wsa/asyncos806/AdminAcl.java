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
    "adminAclAction",
    "adminAclAllowList"
})
@XmlRootElement(name = "admin_acl")
public class AdminAcl {

    @XmlElement(name = "admin_acl_action", required = true)
    protected String adminAclAction;
    @XmlElement(name = "admin_acl_allow_list")
    protected AdminAclAllowList adminAclAllowList;

    /**
     * Gets the value of the adminAclAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminAclAction() {
        return adminAclAction;
    }

    /**
     * Sets the value of the adminAclAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminAclAction(String value) {
        this.adminAclAction = value;
    }

    /**
     * Gets the value of the adminAclAllowList property.
     * 
     * @return
     *     possible object is
     *     {@link AdminAclAllowList }
     *     
     */
    public AdminAclAllowList getAdminAclAllowList() {
        return adminAclAllowList;
    }

    /**
     * Sets the value of the adminAclAllowList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminAclAllowList }
     *     
     */
    public void setAdminAclAllowList(AdminAclAllowList value) {
        this.adminAclAllowList = value;
    }

}
