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
    "name",
    "filename",
    "retrieval",
    "domain",
    "smtpSessions"
})
@XmlRootElement(name = "log_domain_debug")
public class LogDomainDebug {

    @XmlElement(required = true)
    protected String name;
    protected String filename;
    @XmlElement(required = true)
    protected Retrieval retrieval;
    @XmlElement(required = true)
    protected String domain;
    @XmlElement(name = "smtp_sessions", required = true)
    protected String smtpSessions;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the retrieval property.
     * 
     * @return
     *     possible object is
     *     {@link Retrieval }
     *     
     */
    public Retrieval getRetrieval() {
        return retrieval;
    }

    /**
     * Sets the value of the retrieval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Retrieval }
     *     
     */
    public void setRetrieval(Retrieval value) {
        this.retrieval = value;
    }

    /**
     * Gets the value of the domain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Sets the value of the domain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Gets the value of the smtpSessions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmtpSessions() {
        return smtpSessions;
    }

    /**
     * Sets the value of the smtpSessions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmtpSessions(String value) {
        this.smtpSessions = value;
    }

}
