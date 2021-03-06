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
    "repEnabled",
    "repCloudServerPool",
    "repCloudDomain",
    "repQueryVersion",
    "repQueryTimeout",
    "useCloudRepThreshold",
    "repThreshold",
    "repHeartbeatInterval",
    "analysisEnabled",
    "analysisServerUrl",
    "repSslEnabled",
    "repTunnelProxyServer",
    "repTunnelProxyPort",
    "repProxyUsername",
    "repProxyPassword",
    "repTunnelRelaxCertVerification"
})
@XmlRootElement(name = "fireamp")
public class Fireamp {

    @XmlElement(name = "rep_enabled")
    protected String repEnabled;
    @XmlElement(name = "rep_cloud_server_pool")
    protected String repCloudServerPool;
    @XmlElement(name = "rep_cloud_domain")
    protected String repCloudDomain;
    @XmlElement(name = "rep_query_version")
    protected String repQueryVersion;
    @XmlElement(name = "rep_query_timeout")
    protected String repQueryTimeout;
    @XmlElement(name = "use_cloud_rep_threshold")
    protected String useCloudRepThreshold;
    @XmlElement(name = "rep_threshold")
    protected String repThreshold;
    @XmlElement(name = "rep_heartbeat_interval")
    protected String repHeartbeatInterval;
    @XmlElement(name = "analysis_enabled")
    protected String analysisEnabled;
    @XmlElement(name = "analysis_server_url")
    protected String analysisServerUrl;
    @XmlElement(name = "rep_ssl_enabled")
    protected String repSslEnabled;
    @XmlElement(name = "rep_tunnel_proxy_server")
    protected String repTunnelProxyServer;
    @XmlElement(name = "rep_tunnel_proxy_port")
    protected String repTunnelProxyPort;
    @XmlElement(name = "rep_proxy_username")
    protected String repProxyUsername;
    @XmlElement(name = "rep_proxy_password")
    protected String repProxyPassword;
    @XmlElement(name = "rep_tunnel_relax_cert_verification")
    protected String repTunnelRelaxCertVerification;

    /**
     * Gets the value of the repEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepEnabled() {
        return repEnabled;
    }

    /**
     * Sets the value of the repEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepEnabled(String value) {
        this.repEnabled = value;
    }

    /**
     * Gets the value of the repCloudServerPool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepCloudServerPool() {
        return repCloudServerPool;
    }

    /**
     * Sets the value of the repCloudServerPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepCloudServerPool(String value) {
        this.repCloudServerPool = value;
    }

    /**
     * Gets the value of the repCloudDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepCloudDomain() {
        return repCloudDomain;
    }

    /**
     * Sets the value of the repCloudDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepCloudDomain(String value) {
        this.repCloudDomain = value;
    }

    /**
     * Gets the value of the repQueryVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepQueryVersion() {
        return repQueryVersion;
    }

    /**
     * Sets the value of the repQueryVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepQueryVersion(String value) {
        this.repQueryVersion = value;
    }

    /**
     * Gets the value of the repQueryTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepQueryTimeout() {
        return repQueryTimeout;
    }

    /**
     * Sets the value of the repQueryTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepQueryTimeout(String value) {
        this.repQueryTimeout = value;
    }

    /**
     * Gets the value of the useCloudRepThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseCloudRepThreshold() {
        return useCloudRepThreshold;
    }

    /**
     * Sets the value of the useCloudRepThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseCloudRepThreshold(String value) {
        this.useCloudRepThreshold = value;
    }

    /**
     * Gets the value of the repThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepThreshold() {
        return repThreshold;
    }

    /**
     * Sets the value of the repThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepThreshold(String value) {
        this.repThreshold = value;
    }

    /**
     * Gets the value of the repHeartbeatInterval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepHeartbeatInterval() {
        return repHeartbeatInterval;
    }

    /**
     * Sets the value of the repHeartbeatInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepHeartbeatInterval(String value) {
        this.repHeartbeatInterval = value;
    }

    /**
     * Gets the value of the analysisEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisEnabled() {
        return analysisEnabled;
    }

    /**
     * Sets the value of the analysisEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisEnabled(String value) {
        this.analysisEnabled = value;
    }

    /**
     * Gets the value of the analysisServerUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnalysisServerUrl() {
        return analysisServerUrl;
    }

    /**
     * Sets the value of the analysisServerUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnalysisServerUrl(String value) {
        this.analysisServerUrl = value;
    }

    /**
     * Gets the value of the repSslEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepSslEnabled() {
        return repSslEnabled;
    }

    /**
     * Sets the value of the repSslEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepSslEnabled(String value) {
        this.repSslEnabled = value;
    }

    /**
     * Gets the value of the repTunnelProxyServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepTunnelProxyServer() {
        return repTunnelProxyServer;
    }

    /**
     * Sets the value of the repTunnelProxyServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepTunnelProxyServer(String value) {
        this.repTunnelProxyServer = value;
    }

    /**
     * Gets the value of the repTunnelProxyPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepTunnelProxyPort() {
        return repTunnelProxyPort;
    }

    /**
     * Sets the value of the repTunnelProxyPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepTunnelProxyPort(String value) {
        this.repTunnelProxyPort = value;
    }

    /**
     * Gets the value of the repProxyUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepProxyUsername() {
        return repProxyUsername;
    }

    /**
     * Sets the value of the repProxyUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepProxyUsername(String value) {
        this.repProxyUsername = value;
    }

    /**
     * Gets the value of the repProxyPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepProxyPassword() {
        return repProxyPassword;
    }

    /**
     * Sets the value of the repProxyPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepProxyPassword(String value) {
        this.repProxyPassword = value;
    }

    /**
     * Gets the value of the repTunnelRelaxCertVerification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepTunnelRelaxCertVerification() {
        return repTunnelRelaxCertVerification;
    }

    /**
     * Sets the value of the repTunnelRelaxCertVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepTunnelRelaxCertVerification(String value) {
        this.repTunnelRelaxCertVerification = value;
    }

}
