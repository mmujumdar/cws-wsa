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
    "routingTableName",
    "routingTableIpVersion",
    "routingTableInterface",
    "routingTableDefaultrouter",
    "routes"
})
@XmlRootElement(name = "routing_table")
public class RoutingTable {

    @XmlElement(name = "routing_table_name", required = true)
    protected String routingTableName;
    @XmlElement(name = "routing_table_ip_version", required = true)
    protected String routingTableIpVersion;
    @XmlElement(name = "routing_table_interface", required = true)
    protected String routingTableInterface;
    @XmlElement(name = "routing_table_defaultrouter")
    protected String routingTableDefaultrouter;
    protected Routes routes;

    /**
     * Gets the value of the routingTableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingTableName() {
        return routingTableName;
    }

    /**
     * Sets the value of the routingTableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingTableName(String value) {
        this.routingTableName = value;
    }

    /**
     * Gets the value of the routingTableIpVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingTableIpVersion() {
        return routingTableIpVersion;
    }

    /**
     * Sets the value of the routingTableIpVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingTableIpVersion(String value) {
        this.routingTableIpVersion = value;
    }

    /**
     * Gets the value of the routingTableInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingTableInterface() {
        return routingTableInterface;
    }

    /**
     * Sets the value of the routingTableInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingTableInterface(String value) {
        this.routingTableInterface = value;
    }

    /**
     * Gets the value of the routingTableDefaultrouter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingTableDefaultrouter() {
        return routingTableDefaultrouter;
    }

    /**
     * Sets the value of the routingTableDefaultrouter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingTableDefaultrouter(String value) {
        this.routingTableDefaultrouter = value;
    }

    /**
     * Gets the value of the routes property.
     * 
     * @return
     *     possible object is
     *     {@link Routes }
     *     
     */
    public Routes getRoutes() {
        return routes;
    }

    /**
     * Sets the value of the routes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Routes }
     *     
     */
    public void setRoutes(Routes value) {
        this.routes = value;
    }

}
