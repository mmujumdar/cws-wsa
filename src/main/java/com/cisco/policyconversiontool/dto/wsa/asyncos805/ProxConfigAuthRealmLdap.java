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
    "proxConfigAuthRealmLdapBaseDn",
    "proxConfigAuthRealmLdapBindDn",
    "proxConfigAuthRealmLdapBindPassword",
    "proxConfigAuthRealmLdapEnableGroupAuth",
    "proxConfigAuthRealmLdapGroupLookup",
    "proxConfigAuthRealmLdapGroupFilterQuery",
    "proxConfigAuthRealmLdapGroupMembershipAttribute",
    "proxConfigAuthRealmLdapGroupNameAttribute",
    "proxConfigAuthRealmLdapUserGroupMembershipAttribute",
    "proxConfigAuthRealmLdapIsUserGroupMemattrDN",
    "proxConfigAuthRealmLdapInterface",
    "proxConfigAuthRealmLdapPersistentConnectionCount",
    "proxConfigAuthRealmLdapPersistentConnectionEnabled",
    "proxConfigAuthRealmLdapServers",
    "proxConfigAuthRealmLdapUseBindForSearch",
    "proxConfigAuthRealmLdapUseSecureLdap",
    "proxConfigAuthRealmLdapEnableSsoEdir",
    "proxConfigAuthRealmLdapUserFilterQuery",
    "proxConfigAuthRealmLdapUserNameAttribute",
    "proxConfigAuthRealmLdapVersion",
    "proxConfigAuthRealmLdapPageSize"
})
@XmlRootElement(name = "prox_config_auth_realm_ldap")
public class ProxConfigAuthRealmLdap {

    @XmlElement(name = "prox_config_auth_realm_ldap_base_dn")
    protected String proxConfigAuthRealmLdapBaseDn;
    @XmlElement(name = "prox_config_auth_realm_ldap_bind_dn", required = true)
    protected String proxConfigAuthRealmLdapBindDn;
    @XmlElement(name = "prox_config_auth_realm_ldap_bind_password", required = true)
    protected String proxConfigAuthRealmLdapBindPassword;
    @XmlElement(name = "prox_config_auth_realm_ldap_enable_group_auth", required = true)
    protected String proxConfigAuthRealmLdapEnableGroupAuth;
    @XmlElement(name = "prox_config_auth_realm_ldap_group_lookup", required = true)
    protected String proxConfigAuthRealmLdapGroupLookup;
    @XmlElement(name = "prox_config_auth_realm_ldap_group_filter_query", required = true)
    protected String proxConfigAuthRealmLdapGroupFilterQuery;
    @XmlElement(name = "prox_config_auth_realm_ldap_group_membership_attribute", required = true)
    protected String proxConfigAuthRealmLdapGroupMembershipAttribute;
    @XmlElement(name = "prox_config_auth_realm_ldap_group_name_attribute", required = true)
    protected String proxConfigAuthRealmLdapGroupNameAttribute;
    @XmlElement(name = "prox_config_auth_realm_ldap_user_group_membership_attribute", required = true)
    protected String proxConfigAuthRealmLdapUserGroupMembershipAttribute;
    @XmlElement(name = "prox_config_auth_realm_ldap_is_user_group_memattr_DN", required = true)
    protected String proxConfigAuthRealmLdapIsUserGroupMemattrDN;
    @XmlElement(name = "prox_config_auth_realm_ldap_interface", required = true)
    protected String proxConfigAuthRealmLdapInterface;
    @XmlElement(name = "prox_config_auth_realm_ldap_persistent_connection_count", required = true)
    protected String proxConfigAuthRealmLdapPersistentConnectionCount;
    @XmlElement(name = "prox_config_auth_realm_ldap_persistent_connection_enabled", required = true)
    protected String proxConfigAuthRealmLdapPersistentConnectionEnabled;
    @XmlElement(name = "prox_config_auth_realm_ldap_servers", required = true)
    protected ProxConfigAuthRealmLdapServers proxConfigAuthRealmLdapServers;
    @XmlElement(name = "prox_config_auth_realm_ldap_use_bind_for_search", required = true)
    protected String proxConfigAuthRealmLdapUseBindForSearch;
    @XmlElement(name = "prox_config_auth_realm_ldap_use_secure_ldap", required = true)
    protected String proxConfigAuthRealmLdapUseSecureLdap;
    @XmlElement(name = "prox_config_auth_realm_ldap_enable_sso_edir", required = true)
    protected String proxConfigAuthRealmLdapEnableSsoEdir;
    @XmlElement(name = "prox_config_auth_realm_ldap_user_filter_query", required = true)
    protected String proxConfigAuthRealmLdapUserFilterQuery;
    @XmlElement(name = "prox_config_auth_realm_ldap_user_name_attribute", required = true)
    protected String proxConfigAuthRealmLdapUserNameAttribute;
    @XmlElement(name = "prox_config_auth_realm_ldap_version", required = true)
    protected String proxConfigAuthRealmLdapVersion;
    @XmlElement(name = "prox_config_auth_realm_ldap_page_size", required = true)
    protected String proxConfigAuthRealmLdapPageSize;

    /**
     * Gets the value of the proxConfigAuthRealmLdapBaseDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapBaseDn() {
        return proxConfigAuthRealmLdapBaseDn;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapBaseDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapBaseDn(String value) {
        this.proxConfigAuthRealmLdapBaseDn = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapBindDn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapBindDn() {
        return proxConfigAuthRealmLdapBindDn;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapBindDn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapBindDn(String value) {
        this.proxConfigAuthRealmLdapBindDn = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapBindPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapBindPassword() {
        return proxConfigAuthRealmLdapBindPassword;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapBindPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapBindPassword(String value) {
        this.proxConfigAuthRealmLdapBindPassword = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapEnableGroupAuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapEnableGroupAuth() {
        return proxConfigAuthRealmLdapEnableGroupAuth;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapEnableGroupAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapEnableGroupAuth(String value) {
        this.proxConfigAuthRealmLdapEnableGroupAuth = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapGroupLookup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapGroupLookup() {
        return proxConfigAuthRealmLdapGroupLookup;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapGroupLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapGroupLookup(String value) {
        this.proxConfigAuthRealmLdapGroupLookup = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapGroupFilterQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapGroupFilterQuery() {
        return proxConfigAuthRealmLdapGroupFilterQuery;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapGroupFilterQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapGroupFilterQuery(String value) {
        this.proxConfigAuthRealmLdapGroupFilterQuery = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapGroupMembershipAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapGroupMembershipAttribute() {
        return proxConfigAuthRealmLdapGroupMembershipAttribute;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapGroupMembershipAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapGroupMembershipAttribute(String value) {
        this.proxConfigAuthRealmLdapGroupMembershipAttribute = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapGroupNameAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapGroupNameAttribute() {
        return proxConfigAuthRealmLdapGroupNameAttribute;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapGroupNameAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapGroupNameAttribute(String value) {
        this.proxConfigAuthRealmLdapGroupNameAttribute = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapUserGroupMembershipAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapUserGroupMembershipAttribute() {
        return proxConfigAuthRealmLdapUserGroupMembershipAttribute;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapUserGroupMembershipAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapUserGroupMembershipAttribute(String value) {
        this.proxConfigAuthRealmLdapUserGroupMembershipAttribute = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapIsUserGroupMemattrDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapIsUserGroupMemattrDN() {
        return proxConfigAuthRealmLdapIsUserGroupMemattrDN;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapIsUserGroupMemattrDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapIsUserGroupMemattrDN(String value) {
        this.proxConfigAuthRealmLdapIsUserGroupMemattrDN = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapInterface() {
        return proxConfigAuthRealmLdapInterface;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapInterface(String value) {
        this.proxConfigAuthRealmLdapInterface = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapPersistentConnectionCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapPersistentConnectionCount() {
        return proxConfigAuthRealmLdapPersistentConnectionCount;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapPersistentConnectionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapPersistentConnectionCount(String value) {
        this.proxConfigAuthRealmLdapPersistentConnectionCount = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapPersistentConnectionEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapPersistentConnectionEnabled() {
        return proxConfigAuthRealmLdapPersistentConnectionEnabled;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapPersistentConnectionEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapPersistentConnectionEnabled(String value) {
        this.proxConfigAuthRealmLdapPersistentConnectionEnabled = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapServers property.
     * 
     * @return
     *     possible object is
     *     {@link ProxConfigAuthRealmLdapServers }
     *     
     */
    public ProxConfigAuthRealmLdapServers getProxConfigAuthRealmLdapServers() {
        return proxConfigAuthRealmLdapServers;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapServers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProxConfigAuthRealmLdapServers }
     *     
     */
    public void setProxConfigAuthRealmLdapServers(ProxConfigAuthRealmLdapServers value) {
        this.proxConfigAuthRealmLdapServers = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapUseBindForSearch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapUseBindForSearch() {
        return proxConfigAuthRealmLdapUseBindForSearch;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapUseBindForSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapUseBindForSearch(String value) {
        this.proxConfigAuthRealmLdapUseBindForSearch = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapUseSecureLdap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapUseSecureLdap() {
        return proxConfigAuthRealmLdapUseSecureLdap;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapUseSecureLdap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapUseSecureLdap(String value) {
        this.proxConfigAuthRealmLdapUseSecureLdap = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapEnableSsoEdir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapEnableSsoEdir() {
        return proxConfigAuthRealmLdapEnableSsoEdir;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapEnableSsoEdir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapEnableSsoEdir(String value) {
        this.proxConfigAuthRealmLdapEnableSsoEdir = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapUserFilterQuery property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapUserFilterQuery() {
        return proxConfigAuthRealmLdapUserFilterQuery;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapUserFilterQuery property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapUserFilterQuery(String value) {
        this.proxConfigAuthRealmLdapUserFilterQuery = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapUserNameAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapUserNameAttribute() {
        return proxConfigAuthRealmLdapUserNameAttribute;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapUserNameAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapUserNameAttribute(String value) {
        this.proxConfigAuthRealmLdapUserNameAttribute = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapVersion() {
        return proxConfigAuthRealmLdapVersion;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapVersion(String value) {
        this.proxConfigAuthRealmLdapVersion = value;
    }

    /**
     * Gets the value of the proxConfigAuthRealmLdapPageSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxConfigAuthRealmLdapPageSize() {
        return proxConfigAuthRealmLdapPageSize;
    }

    /**
     * Sets the value of the proxConfigAuthRealmLdapPageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxConfigAuthRealmLdapPageSize(String value) {
        this.proxConfigAuthRealmLdapPageSize = value;
    }

}
