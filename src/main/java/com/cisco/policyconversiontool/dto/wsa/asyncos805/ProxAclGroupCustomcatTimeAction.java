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
    "proxAclGroupCustomcatTimeActionId",
    "proxAclGroupCustomcatTimeActionTimeDefn",
    "proxAclGroupCustomcatTimeActionInAction",
    "proxAclGroupCustomcatTimeActionInRedirect",
    "proxAclGroupCustomcatTimeActionOutAction",
    "proxAclGroupCustomcatTimeActionOutRedirect"
})
@XmlRootElement(name = "prox_acl_group_customcat_time_action")
public class ProxAclGroupCustomcatTimeAction implements Serializable{

    @XmlElement(name = "prox_acl_group_customcat_time_action_id")
    protected String proxAclGroupCustomcatTimeActionId;
    @XmlElement(name = "prox_acl_group_customcat_time_action_time_defn")
    protected String proxAclGroupCustomcatTimeActionTimeDefn;
    @XmlElement(name = "prox_acl_group_customcat_time_action_in_action")
    protected String proxAclGroupCustomcatTimeActionInAction;
    @XmlElement(name = "prox_acl_group_customcat_time_action_in_redirect")
    protected String proxAclGroupCustomcatTimeActionInRedirect;
    @XmlElement(name = "prox_acl_group_customcat_time_action_out_action")
    protected String proxAclGroupCustomcatTimeActionOutAction;
    @XmlElement(name = "prox_acl_group_customcat_time_action_out_redirect")
    protected String proxAclGroupCustomcatTimeActionOutRedirect;

    /**
     * Gets the value of the proxAclGroupCustomcatTimeActionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclGroupCustomcatTimeActionId() {
        return proxAclGroupCustomcatTimeActionId;
    }

    /**
     * Sets the value of the proxAclGroupCustomcatTimeActionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclGroupCustomcatTimeActionId(String value) {
        this.proxAclGroupCustomcatTimeActionId = value;
    }

    /**
     * Gets the value of the proxAclGroupCustomcatTimeActionTimeDefn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclGroupCustomcatTimeActionTimeDefn() {
        return proxAclGroupCustomcatTimeActionTimeDefn;
    }

    /**
     * Sets the value of the proxAclGroupCustomcatTimeActionTimeDefn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclGroupCustomcatTimeActionTimeDefn(String value) {
        this.proxAclGroupCustomcatTimeActionTimeDefn = value;
    }

    /**
     * Gets the value of the proxAclGroupCustomcatTimeActionInAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclGroupCustomcatTimeActionInAction() {
        return proxAclGroupCustomcatTimeActionInAction;
    }

    /**
     * Sets the value of the proxAclGroupCustomcatTimeActionInAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclGroupCustomcatTimeActionInAction(String value) {
        this.proxAclGroupCustomcatTimeActionInAction = value;
    }

    /**
     * Gets the value of the proxAclGroupCustomcatTimeActionInRedirect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclGroupCustomcatTimeActionInRedirect() {
        return proxAclGroupCustomcatTimeActionInRedirect;
    }

    /**
     * Sets the value of the proxAclGroupCustomcatTimeActionInRedirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclGroupCustomcatTimeActionInRedirect(String value) {
        this.proxAclGroupCustomcatTimeActionInRedirect = value;
    }

    /**
     * Gets the value of the proxAclGroupCustomcatTimeActionOutAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclGroupCustomcatTimeActionOutAction() {
        return proxAclGroupCustomcatTimeActionOutAction;
    }

    /**
     * Sets the value of the proxAclGroupCustomcatTimeActionOutAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclGroupCustomcatTimeActionOutAction(String value) {
        this.proxAclGroupCustomcatTimeActionOutAction = value;
    }

    /**
     * Gets the value of the proxAclGroupCustomcatTimeActionOutRedirect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclGroupCustomcatTimeActionOutRedirect() {
        return proxAclGroupCustomcatTimeActionOutRedirect;
    }

    /**
     * Sets the value of the proxAclGroupCustomcatTimeActionOutRedirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclGroupCustomcatTimeActionOutRedirect(String value) {
        this.proxAclGroupCustomcatTimeActionOutRedirect = value;
    }

}
