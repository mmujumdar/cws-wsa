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
    "proxAclRulesCloudAuthGroupRealm",
    "proxAclRulesCloudAuthGroupUserGroup"
})
@XmlRootElement(name = "prox_acl_rules_cloud_auth_group")
public class ProxAclRulesCloudAuthGroup {

    @XmlElement(name = "prox_acl_rules_cloud_auth_group_realm", required = true)
    protected String proxAclRulesCloudAuthGroupRealm;
    @XmlElement(name = "prox_acl_rules_cloud_auth_group_user_group", required = true)
    protected String proxAclRulesCloudAuthGroupUserGroup;

    /**
     * Gets the value of the proxAclRulesCloudAuthGroupRealm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclRulesCloudAuthGroupRealm() {
        return proxAclRulesCloudAuthGroupRealm;
    }

    /**
     * Sets the value of the proxAclRulesCloudAuthGroupRealm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclRulesCloudAuthGroupRealm(String value) {
        this.proxAclRulesCloudAuthGroupRealm = value;
    }

    /**
     * Gets the value of the proxAclRulesCloudAuthGroupUserGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclRulesCloudAuthGroupUserGroup() {
        return proxAclRulesCloudAuthGroupUserGroup;
    }

    /**
     * Sets the value of the proxAclRulesCloudAuthGroupUserGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclRulesCloudAuthGroupUserGroup(String value) {
        this.proxAclRulesCloudAuthGroupUserGroup = value;
    }

}
