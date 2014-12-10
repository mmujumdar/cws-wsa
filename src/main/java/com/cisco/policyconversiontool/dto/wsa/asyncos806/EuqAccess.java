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
    "euqMethod",
    "euqAuthServer",
    "euqAuthPort",
    "euqTransport",
    "euqTestUser",
    "euqLdapServerType",
    "euqLdapWinsName",
    "euqLdapCredentials",
    "euqLdapQueryBase",
    "euqLdapQueryFilter",
    "euqLdapAliasEmailAttr",
    "euqLdapEmailAttr",
    "euqBaseUrl",
    "euqDefaultDomain",
    "euqAdminusers"
})
@XmlRootElement(name = "euq_access")
public class EuqAccess {

    @XmlElement(name = "euq_method", required = true)
    protected String euqMethod;
    @XmlElement(name = "euq_auth_server")
    protected String euqAuthServer;
    @XmlElement(name = "euq_auth_port", required = true)
    protected String euqAuthPort;
    @XmlElement(name = "euq_transport", required = true)
    protected String euqTransport;
    @XmlElement(name = "euq_test_user", required = true)
    protected String euqTestUser;
    @XmlElement(name = "euq_ldap_server_type", required = true)
    protected String euqLdapServerType;
    @XmlElement(name = "euq_ldap_wins_name", required = true)
    protected String euqLdapWinsName;
    @XmlElement(name = "euq_ldap_credentials", required = true)
    protected EuqLdapCredentials euqLdapCredentials;
    @XmlElement(name = "euq_ldap_query_base", required = true)
    protected String euqLdapQueryBase;
    @XmlElement(name = "euq_ldap_query_filter", required = true)
    protected String euqLdapQueryFilter;
    @XmlElement(name = "euq_ldap_alias_email_attr", required = true)
    protected String euqLdapAliasEmailAttr;
    @XmlElement(name = "euq_ldap_email_attr", required = true)
    protected String euqLdapEmailAttr;
    @XmlElement(name = "euq_base_url", required = true)
    protected String euqBaseUrl;
    @XmlElement(name = "euq_default_domain", required = true)
    protected String euqDefaultDomain;
    @XmlElement(name = "euq_adminusers", required = true)
    protected EuqAdminusers euqAdminusers;

    /**
     * Gets the value of the euqMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqMethod() {
        return euqMethod;
    }

    /**
     * Sets the value of the euqMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqMethod(String value) {
        this.euqMethod = value;
    }

    /**
     * Gets the value of the euqAuthServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqAuthServer() {
        return euqAuthServer;
    }

    /**
     * Sets the value of the euqAuthServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqAuthServer(String value) {
        this.euqAuthServer = value;
    }

    /**
     * Gets the value of the euqAuthPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqAuthPort() {
        return euqAuthPort;
    }

    /**
     * Sets the value of the euqAuthPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqAuthPort(String value) {
        this.euqAuthPort = value;
    }

    /**
     * Gets the value of the euqTransport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqTransport() {
        return euqTransport;
    }

    /**
     * Sets the value of the euqTransport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqTransport(String value) {
        this.euqTransport = value;
    }

    /**
     * Gets the value of the euqTestUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqTestUser() {
        return euqTestUser;
    }

    /**
     * Sets the value of the euqTestUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqTestUser(String value) {
        this.euqTestUser = value;
    }

    /**
     * Gets the value of the euqLdapServerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqLdapServerType() {
        return euqLdapServerType;
    }

    /**
     * Sets the value of the euqLdapServerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqLdapServerType(String value) {
        this.euqLdapServerType = value;
    }

    /**
     * Gets the value of the euqLdapWinsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqLdapWinsName() {
        return euqLdapWinsName;
    }

    /**
     * Sets the value of the euqLdapWinsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqLdapWinsName(String value) {
        this.euqLdapWinsName = value;
    }

    /**
     * Gets the value of the euqLdapCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link EuqLdapCredentials }
     *     
     */
    public EuqLdapCredentials getEuqLdapCredentials() {
        return euqLdapCredentials;
    }

    /**
     * Sets the value of the euqLdapCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link EuqLdapCredentials }
     *     
     */
    public void setEuqLdapCredentials(EuqLdapCredentials value) {
        this.euqLdapCredentials = value;
    }

    /**
     * Gets the value of the euqLdapQueryBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqLdapQueryBase() {
        return euqLdapQueryBase;
    }

    /**
     * Sets the value of the euqLdapQueryBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqLdapQueryBase(String value) {
        this.euqLdapQueryBase = value;
    }

    /**
     * Gets the value of the euqLdapQueryFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqLdapQueryFilter() {
        return euqLdapQueryFilter;
    }

    /**
     * Sets the value of the euqLdapQueryFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqLdapQueryFilter(String value) {
        this.euqLdapQueryFilter = value;
    }

    /**
     * Gets the value of the euqLdapAliasEmailAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqLdapAliasEmailAttr() {
        return euqLdapAliasEmailAttr;
    }

    /**
     * Sets the value of the euqLdapAliasEmailAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqLdapAliasEmailAttr(String value) {
        this.euqLdapAliasEmailAttr = value;
    }

    /**
     * Gets the value of the euqLdapEmailAttr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqLdapEmailAttr() {
        return euqLdapEmailAttr;
    }

    /**
     * Sets the value of the euqLdapEmailAttr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqLdapEmailAttr(String value) {
        this.euqLdapEmailAttr = value;
    }

    /**
     * Gets the value of the euqBaseUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqBaseUrl() {
        return euqBaseUrl;
    }

    /**
     * Sets the value of the euqBaseUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqBaseUrl(String value) {
        this.euqBaseUrl = value;
    }

    /**
     * Gets the value of the euqDefaultDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqDefaultDomain() {
        return euqDefaultDomain;
    }

    /**
     * Sets the value of the euqDefaultDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqDefaultDomain(String value) {
        this.euqDefaultDomain = value;
    }

    /**
     * Gets the value of the euqAdminusers property.
     * 
     * @return
     *     possible object is
     *     {@link EuqAdminusers }
     *     
     */
    public EuqAdminusers getEuqAdminusers() {
        return euqAdminusers;
    }

    /**
     * Sets the value of the euqAdminusers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EuqAdminusers }
     *     
     */
    public void setEuqAdminusers(EuqAdminusers value) {
        this.euqAdminusers = value;
    }

}
