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
    "euqDbApi",
    "euqDbHost",
    "euqDbPort",
    "euqDbUser",
    "euqDbName",
    "euqDbPools",
    "euqDbTotalConnections",
    "euqDbBodyLocation",
    "euqDbCheckDelay"
})
@XmlRootElement(name = "euq_db")
public class EuqDb {

    @XmlElement(name = "euq_db_api", required = true)
    protected String euqDbApi;
    @XmlElement(name = "euq_db_host", required = true)
    protected String euqDbHost;
    @XmlElement(name = "euq_db_port", required = true)
    protected String euqDbPort;
    @XmlElement(name = "euq_db_user", required = true)
    protected String euqDbUser;
    @XmlElement(name = "euq_db_name", required = true)
    protected String euqDbName;
    @XmlElement(name = "euq_db_pools", required = true)
    protected EuqDbPools euqDbPools;
    @XmlElement(name = "euq_db_total_connections", required = true)
    protected String euqDbTotalConnections;
    @XmlElement(name = "euq_db_body_location", required = true)
    protected String euqDbBodyLocation;
    @XmlElement(name = "euq_db_check_delay", required = true)
    protected String euqDbCheckDelay;

    /**
     * Gets the value of the euqDbApi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqDbApi() {
        return euqDbApi;
    }

    /**
     * Sets the value of the euqDbApi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqDbApi(String value) {
        this.euqDbApi = value;
    }

    /**
     * Gets the value of the euqDbHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqDbHost() {
        return euqDbHost;
    }

    /**
     * Sets the value of the euqDbHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqDbHost(String value) {
        this.euqDbHost = value;
    }

    /**
     * Gets the value of the euqDbPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqDbPort() {
        return euqDbPort;
    }

    /**
     * Sets the value of the euqDbPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqDbPort(String value) {
        this.euqDbPort = value;
    }

    /**
     * Gets the value of the euqDbUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqDbUser() {
        return euqDbUser;
    }

    /**
     * Sets the value of the euqDbUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqDbUser(String value) {
        this.euqDbUser = value;
    }

    /**
     * Gets the value of the euqDbName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqDbName() {
        return euqDbName;
    }

    /**
     * Sets the value of the euqDbName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqDbName(String value) {
        this.euqDbName = value;
    }

    /**
     * Gets the value of the euqDbPools property.
     * 
     * @return
     *     possible object is
     *     {@link EuqDbPools }
     *     
     */
    public EuqDbPools getEuqDbPools() {
        return euqDbPools;
    }

    /**
     * Sets the value of the euqDbPools property.
     * 
     * @param value
     *     allowed object is
     *     {@link EuqDbPools }
     *     
     */
    public void setEuqDbPools(EuqDbPools value) {
        this.euqDbPools = value;
    }

    /**
     * Gets the value of the euqDbTotalConnections property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqDbTotalConnections() {
        return euqDbTotalConnections;
    }

    /**
     * Sets the value of the euqDbTotalConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqDbTotalConnections(String value) {
        this.euqDbTotalConnections = value;
    }

    /**
     * Gets the value of the euqDbBodyLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqDbBodyLocation() {
        return euqDbBodyLocation;
    }

    /**
     * Sets the value of the euqDbBodyLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqDbBodyLocation(String value) {
        this.euqDbBodyLocation = value;
    }

    /**
     * Gets the value of the euqDbCheckDelay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEuqDbCheckDelay() {
        return euqDbCheckDelay;
    }

    /**
     * Sets the value of the euqDbCheckDelay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEuqDbCheckDelay(String value) {
        this.euqDbCheckDelay = value;
    }

}
