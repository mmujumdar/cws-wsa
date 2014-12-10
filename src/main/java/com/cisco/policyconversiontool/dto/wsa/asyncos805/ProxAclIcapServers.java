//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.15 at 08:28:02 PM IST 
//


package com.cisco.policyconversiontool.dto.wsa.asyncos805;

import java.util.ArrayList;
import java.util.List;
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
    "proxAclIcapServersLoadBalancing",
    "proxAclIcapServersFailureHandling",
    "proxAclIcapServer"
})
@XmlRootElement(name = "prox_acl_icap_servers")
public class ProxAclIcapServers {

    @XmlElement(name = "prox_acl_icap_servers_load_balancing")
    protected String proxAclIcapServersLoadBalancing;
    @XmlElement(name = "prox_acl_icap_servers_failure_handling")
    protected String proxAclIcapServersFailureHandling;
    @XmlElement(name = "prox_acl_icap_server")
    protected List<ProxAclIcapServer> proxAclIcapServer;

    /**
     * Gets the value of the proxAclIcapServersLoadBalancing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclIcapServersLoadBalancing() {
        return proxAclIcapServersLoadBalancing;
    }

    /**
     * Sets the value of the proxAclIcapServersLoadBalancing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclIcapServersLoadBalancing(String value) {
        this.proxAclIcapServersLoadBalancing = value;
    }

    /**
     * Gets the value of the proxAclIcapServersFailureHandling property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProxAclIcapServersFailureHandling() {
        return proxAclIcapServersFailureHandling;
    }

    /**
     * Sets the value of the proxAclIcapServersFailureHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProxAclIcapServersFailureHandling(String value) {
        this.proxAclIcapServersFailureHandling = value;
    }

    /**
     * Gets the value of the proxAclIcapServer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proxAclIcapServer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProxAclIcapServer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProxAclIcapServer }
     * 
     * 
     */
    public List<ProxAclIcapServer> getProxAclIcapServer() {
        if (proxAclIcapServer == null) {
            proxAclIcapServer = new ArrayList<ProxAclIcapServer>();
        }
        return this.proxAclIcapServer;
    }

}
