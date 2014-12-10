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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "smtpauthForwardHostnameOrSmtpauthForwardIp",
    "smtpauthForwardPort",
    "smtpauthForwardInterface",
    "smtpauthForwardUseSsl",
    "smtpauthForwardMaxConcurrency",
    "smtpauthForwardUsePlain",
    "smtpauthForwardUseLogin"
})
@XmlRootElement(name = "smtpauth_forward_server")
public class SmtpauthForwardServer {

    @XmlElements({
        @XmlElement(name = "smtpauth_forward_hostname", required = true, type = SmtpauthForwardHostname.class),
        @XmlElement(name = "smtpauth_forward_ip", required = true, type = SmtpauthForwardIp.class)
    })
    protected List<Object> smtpauthForwardHostnameOrSmtpauthForwardIp;
    @XmlElement(name = "smtpauth_forward_port", required = true)
    protected String smtpauthForwardPort;
    @XmlElement(name = "smtpauth_forward_interface", required = true)
    protected String smtpauthForwardInterface;
    @XmlElement(name = "smtpauth_forward_use_ssl", required = true)
    protected String smtpauthForwardUseSsl;
    @XmlElement(name = "smtpauth_forward_max_concurrency", required = true)
    protected String smtpauthForwardMaxConcurrency;
    @XmlElement(name = "smtpauth_forward_use_plain")
    protected String smtpauthForwardUsePlain;
    @XmlElement(name = "smtpauth_forward_use_login")
    protected String smtpauthForwardUseLogin;

    /**
     * Gets the value of the smtpauthForwardHostnameOrSmtpauthForwardIp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smtpauthForwardHostnameOrSmtpauthForwardIp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmtpauthForwardHostnameOrSmtpauthForwardIp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmtpauthForwardHostname }
     * {@link SmtpauthForwardIp }
     * 
     * 
     */
    public List<Object> getSmtpauthForwardHostnameOrSmtpauthForwardIp() {
        if (smtpauthForwardHostnameOrSmtpauthForwardIp == null) {
            smtpauthForwardHostnameOrSmtpauthForwardIp = new ArrayList<Object>();
        }
        return this.smtpauthForwardHostnameOrSmtpauthForwardIp;
    }

    /**
     * Gets the value of the smtpauthForwardPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpauthForwardPort() {
        return smtpauthForwardPort;
    }

    /**
     * Sets the value of the smtpauthForwardPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpauthForwardPort(String value) {
        this.smtpauthForwardPort = value;
    }

    /**
     * Gets the value of the smtpauthForwardInterface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpauthForwardInterface() {
        return smtpauthForwardInterface;
    }

    /**
     * Sets the value of the smtpauthForwardInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpauthForwardInterface(String value) {
        this.smtpauthForwardInterface = value;
    }

    /**
     * Gets the value of the smtpauthForwardUseSsl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpauthForwardUseSsl() {
        return smtpauthForwardUseSsl;
    }

    /**
     * Sets the value of the smtpauthForwardUseSsl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpauthForwardUseSsl(String value) {
        this.smtpauthForwardUseSsl = value;
    }

    /**
     * Gets the value of the smtpauthForwardMaxConcurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpauthForwardMaxConcurrency() {
        return smtpauthForwardMaxConcurrency;
    }

    /**
     * Sets the value of the smtpauthForwardMaxConcurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpauthForwardMaxConcurrency(String value) {
        this.smtpauthForwardMaxConcurrency = value;
    }

    /**
     * Gets the value of the smtpauthForwardUsePlain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpauthForwardUsePlain() {
        return smtpauthForwardUsePlain;
    }

    /**
     * Sets the value of the smtpauthForwardUsePlain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpauthForwardUsePlain(String value) {
        this.smtpauthForwardUsePlain = value;
    }

    /**
     * Gets the value of the smtpauthForwardUseLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpauthForwardUseLogin() {
        return smtpauthForwardUseLogin;
    }

    /**
     * Sets the value of the smtpauthForwardUseLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpauthForwardUseLogin(String value) {
        this.smtpauthForwardUseLogin = value;
    }

}
