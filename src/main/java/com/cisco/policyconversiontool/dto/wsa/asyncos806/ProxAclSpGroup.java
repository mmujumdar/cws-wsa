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
    "proxAclSpGroupId",
    "proxAclSpGroupDescription",
    "proxAclSpGroupEnabled",
    "proxAclSpGroupMetadataUploaded",
    "proxAclSpGroupAttributeMappings",
    "proxAclSpGroupAuthSequence",
    "proxAclSpGroupAuthnContext",
    "proxAclSpGroupAuthUsers",
    "proxAclSpGroupAuthGroups",
    "proxAclSpGroupMetadata",
    "proxAclSpGroupNeedSaasAuth",
    "proxAclSpGroupNameIdMapping",
    "proxAclSpGroupEntityId",
    "proxAclSpGroupAcsLocation",
    "proxAclSpGroupNameidFormat",
    "proxAclSpGroupMetadataFile"
})
@XmlRootElement(name = "prox_acl_sp_group")
public class ProxAclSpGroup {

    @XmlElement(name = "prox_acl_sp_group_id", required = true)
    protected String proxAclSpGroupId;
    @XmlElement(name = "prox_acl_sp_group_description")
    protected String proxAclSpGroupDescription;
    @XmlElement(name = "prox_acl_sp_group_enabled", required = true)
    protected String proxAclSpGroupEnabled;
    @XmlElement(name = "prox_acl_sp_group_metadata_uploaded")
    protected String proxAclSpGroupMetadataUploaded;
    @XmlElement(name = "prox_acl_sp_group_attribute_mappings")
    protected ProxAclSpGroupAttributeMappings proxAclSpGroupAttributeMappings;
    @XmlElement(name = "prox_acl_sp_group_auth_sequence")
    protected String proxAclSpGroupAuthSequence;
    @XmlElement(name = "prox_acl_sp_group_authn_context")
    protected String proxAclSpGroupAuthnContext;
    @XmlElement(name = "prox_acl_sp_group_auth_users")
    protected ProxAclSpGroupAuthUsers proxAclSpGroupAuthUsers;
    @XmlElement(name = "prox_acl_sp_group_auth_groups")
    protected ProxAclSpGroupAuthGroups proxAclSpGroupAuthGroups;
    @XmlElement(name = "prox_acl_sp_group_metadata")
    protected String proxAclSpGroupMetadata;
    @XmlElement(name = "prox_acl_sp_group_need_saas_auth")
    protected String proxAclSpGroupNeedSaasAuth;
    @XmlElement(name = "prox_acl_sp_group_name_id_mapping")
    protected ProxAclSpGroupNameIdMapping proxAclSpGroupNameIdMapping;
    @XmlElement(name = "prox_acl_sp_group_entity_id", required = true)
    protected String proxAclSpGroupEntityId;
    @XmlElement(name = "prox_acl_sp_group_acs_location", required = true)
    protected String proxAclSpGroupAcsLocation;
    @XmlElement(name = "prox_acl_sp_group_nameid_format", required = true)
    protected String proxAclSpGroupNameidFormat;
    @XmlElement(name = "prox_acl_sp_group_metadata_file", required = true)
    protected String proxAclSpGroupMetadataFile;

    /**
     * Gets the value of the proxAclSpGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclSpGroupId() {
        return proxAclSpGroupId;
    }

    /**
     * Sets the value of the proxAclSpGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclSpGroupId(String value) {
        this.proxAclSpGroupId = value;
    }

    /**
     * Gets the value of the proxAclSpGroupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclSpGroupDescription() {
        return proxAclSpGroupDescription;
    }

    /**
     * Sets the value of the proxAclSpGroupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclSpGroupDescription(String value) {
        this.proxAclSpGroupDescription = value;
    }

    /**
     * Gets the value of the proxAclSpGroupEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclSpGroupEnabled() {
        return proxAclSpGroupEnabled;
    }

    /**
     * Sets the value of the proxAclSpGroupEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclSpGroupEnabled(String value) {
        this.proxAclSpGroupEnabled = value;
    }

    /**
     * Gets the value of the proxAclSpGroupMetadataUploaded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclSpGroupMetadataUploaded() {
        return proxAclSpGroupMetadataUploaded;
    }

    /**
     * Sets the value of the proxAclSpGroupMetadataUploaded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclSpGroupMetadataUploaded(String value) {
        this.proxAclSpGroupMetadataUploaded = value;
    }

    /**
     * Gets the value of the proxAclSpGroupAttributeMappings property.
     * 
     * @return
     *     possible object is
     *     {@link ProxAclSpGroupAttributeMappings }
     *     
     */
    public ProxAclSpGroupAttributeMappings getProxAclSpGroupAttributeMappings() {
        return proxAclSpGroupAttributeMappings;
    }

    /**
     * Sets the value of the proxAclSpGroupAttributeMappings property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxAclSpGroupAttributeMappings }
     *     
     */
    public void setProxAclSpGroupAttributeMappings(ProxAclSpGroupAttributeMappings value) {
        this.proxAclSpGroupAttributeMappings = value;
    }

    /**
     * Gets the value of the proxAclSpGroupAuthSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclSpGroupAuthSequence() {
        return proxAclSpGroupAuthSequence;
    }

    /**
     * Sets the value of the proxAclSpGroupAuthSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclSpGroupAuthSequence(String value) {
        this.proxAclSpGroupAuthSequence = value;
    }

    /**
     * Gets the value of the proxAclSpGroupAuthnContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclSpGroupAuthnContext() {
        return proxAclSpGroupAuthnContext;
    }

    /**
     * Sets the value of the proxAclSpGroupAuthnContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclSpGroupAuthnContext(String value) {
        this.proxAclSpGroupAuthnContext = value;
    }

    /**
     * Gets the value of the proxAclSpGroupAuthUsers property.
     * 
     * @return
     *     possible object is
     *     {@link ProxAclSpGroupAuthUsers }
     *     
     */
    public ProxAclSpGroupAuthUsers getProxAclSpGroupAuthUsers() {
        return proxAclSpGroupAuthUsers;
    }

    /**
     * Sets the value of the proxAclSpGroupAuthUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxAclSpGroupAuthUsers }
     *     
     */
    public void setProxAclSpGroupAuthUsers(ProxAclSpGroupAuthUsers value) {
        this.proxAclSpGroupAuthUsers = value;
    }

    /**
     * Gets the value of the proxAclSpGroupAuthGroups property.
     * 
     * @return
     *     possible object is
     *     {@link ProxAclSpGroupAuthGroups }
     *     
     */
    public ProxAclSpGroupAuthGroups getProxAclSpGroupAuthGroups() {
        return proxAclSpGroupAuthGroups;
    }

    /**
     * Sets the value of the proxAclSpGroupAuthGroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxAclSpGroupAuthGroups }
     *     
     */
    public void setProxAclSpGroupAuthGroups(ProxAclSpGroupAuthGroups value) {
        this.proxAclSpGroupAuthGroups = value;
    }

    /**
     * Gets the value of the proxAclSpGroupMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclSpGroupMetadata() {
        return proxAclSpGroupMetadata;
    }

    /**
     * Sets the value of the proxAclSpGroupMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclSpGroupMetadata(String value) {
        this.proxAclSpGroupMetadata = value;
    }

    /**
     * Gets the value of the proxAclSpGroupNeedSaasAuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclSpGroupNeedSaasAuth() {
        return proxAclSpGroupNeedSaasAuth;
    }

    /**
     * Sets the value of the proxAclSpGroupNeedSaasAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclSpGroupNeedSaasAuth(String value) {
        this.proxAclSpGroupNeedSaasAuth = value;
    }

    /**
     * Gets the value of the proxAclSpGroupNameIdMapping property.
     * 
     * @return
     *     possible object is
     *     {@link ProxAclSpGroupNameIdMapping }
     *     
     */
    public ProxAclSpGroupNameIdMapping getProxAclSpGroupNameIdMapping() {
        return proxAclSpGroupNameIdMapping;
    }

    /**
     * Sets the value of the proxAclSpGroupNameIdMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxAclSpGroupNameIdMapping }
     *     
     */
    public void setProxAclSpGroupNameIdMapping(ProxAclSpGroupNameIdMapping value) {
        this.proxAclSpGroupNameIdMapping = value;
    }

    /**
     * Gets the value of the proxAclSpGroupEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclSpGroupEntityId() {
        return proxAclSpGroupEntityId;
    }

    /**
     * Sets the value of the proxAclSpGroupEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclSpGroupEntityId(String value) {
        this.proxAclSpGroupEntityId = value;
    }

    /**
     * Gets the value of the proxAclSpGroupAcsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclSpGroupAcsLocation() {
        return proxAclSpGroupAcsLocation;
    }

    /**
     * Sets the value of the proxAclSpGroupAcsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclSpGroupAcsLocation(String value) {
        this.proxAclSpGroupAcsLocation = value;
    }

    /**
     * Gets the value of the proxAclSpGroupNameidFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclSpGroupNameidFormat() {
        return proxAclSpGroupNameidFormat;
    }

    /**
     * Sets the value of the proxAclSpGroupNameidFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclSpGroupNameidFormat(String value) {
        this.proxAclSpGroupNameidFormat = value;
    }

    /**
     * Gets the value of the proxAclSpGroupMetadataFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclSpGroupMetadataFile() {
        return proxAclSpGroupMetadataFile;
    }

    /**
     * Sets the value of the proxAclSpGroupMetadataFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclSpGroupMetadataFile(String value) {
        this.proxAclSpGroupMetadataFile = value;
    }

}
