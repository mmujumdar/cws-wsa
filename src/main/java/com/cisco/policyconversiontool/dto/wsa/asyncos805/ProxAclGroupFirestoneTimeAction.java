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
    "proxAclGroupFirestoneTimeActionId",
    "proxAclGroupFirestoneTimeActionTimeDefn",
    "proxAclGroupFirestoneTimeActionInAction",
    "proxAclGroupFirestoneTimeActionInRedirect",
    "proxAclGroupFirestoneTimeActionOutAction",
    "proxAclGroupFirestoneTimeActionOutRedirect"
})
@XmlRootElement(name = "prox_acl_group_firestone_time_action")
public class ProxAclGroupFirestoneTimeAction implements Serializable{

    @XmlElement(name = "prox_acl_group_firestone_time_action_id")
    protected String proxAclGroupFirestoneTimeActionId;
    @XmlElement(name = "prox_acl_group_firestone_time_action_time_defn")
    protected String proxAclGroupFirestoneTimeActionTimeDefn;
    @XmlElement(name = "prox_acl_group_firestone_time_action_in_action")
    protected String proxAclGroupFirestoneTimeActionInAction;
    @XmlElement(name = "prox_acl_group_firestone_time_action_in_redirect")
    protected String proxAclGroupFirestoneTimeActionInRedirect;
    @XmlElement(name = "prox_acl_group_firestone_time_action_out_action")
    protected String proxAclGroupFirestoneTimeActionOutAction;
    @XmlElement(name = "prox_acl_group_firestone_time_action_out_redirect")
    protected String proxAclGroupFirestoneTimeActionOutRedirect;

    /**
     * Gets the value of the proxAclGroupFirestoneTimeActionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclGroupFirestoneTimeActionId() {
        return proxAclGroupFirestoneTimeActionId;
    }

    /**
     * Sets the value of the proxAclGroupFirestoneTimeActionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclGroupFirestoneTimeActionId(String value) {
        this.proxAclGroupFirestoneTimeActionId = value;
    }

    /**
     * Gets the value of the proxAclGroupFirestoneTimeActionTimeDefn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclGroupFirestoneTimeActionTimeDefn() {
        return proxAclGroupFirestoneTimeActionTimeDefn;
    }

    /**
     * Sets the value of the proxAclGroupFirestoneTimeActionTimeDefn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclGroupFirestoneTimeActionTimeDefn(String value) {
        this.proxAclGroupFirestoneTimeActionTimeDefn = value;
    }

    /**
     * Gets the value of the proxAclGroupFirestoneTimeActionInAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclGroupFirestoneTimeActionInAction() {
        return proxAclGroupFirestoneTimeActionInAction;
    }

    /**
     * Sets the value of the proxAclGroupFirestoneTimeActionInAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclGroupFirestoneTimeActionInAction(String value) {
        this.proxAclGroupFirestoneTimeActionInAction = value;
    }

    /**
     * Gets the value of the proxAclGroupFirestoneTimeActionInRedirect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclGroupFirestoneTimeActionInRedirect() {
        return proxAclGroupFirestoneTimeActionInRedirect;
    }

    /**
     * Sets the value of the proxAclGroupFirestoneTimeActionInRedirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclGroupFirestoneTimeActionInRedirect(String value) {
        this.proxAclGroupFirestoneTimeActionInRedirect = value;
    }

    /**
     * Gets the value of the proxAclGroupFirestoneTimeActionOutAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclGroupFirestoneTimeActionOutAction() {
        return proxAclGroupFirestoneTimeActionOutAction;
    }

    /**
     * Sets the value of the proxAclGroupFirestoneTimeActionOutAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclGroupFirestoneTimeActionOutAction(String value) {
        this.proxAclGroupFirestoneTimeActionOutAction = value;
    }

    /**
     * Gets the value of the proxAclGroupFirestoneTimeActionOutRedirect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclGroupFirestoneTimeActionOutRedirect() {
        return proxAclGroupFirestoneTimeActionOutRedirect;
    }

    /**
     * Sets the value of the proxAclGroupFirestoneTimeActionOutRedirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclGroupFirestoneTimeActionOutRedirect(String value) {
        this.proxAclGroupFirestoneTimeActionOutRedirect = value;
    }

}
