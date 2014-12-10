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
    "antispamAction",
    "antispamAltMailhost",
    "antispamAltRcptTo",
    "antispamArchive",
    "antispamAltMailport",
    "antispamHeaderName",
    "antispamHeaderText",
    "antispamSubjectAction",
    "antispamSubjectText"
})
@XmlRootElement(name = "antispam")
public class Antispam {

    @XmlElement(name = "antispam_action", required = true)
    protected String antispamAction;
    @XmlElement(name = "antispam_alt_mailhost", required = true)
    protected String antispamAltMailhost;
    @XmlElement(name = "antispam_alt_rcpt_to", required = true)
    protected String antispamAltRcptTo;
    @XmlElement(name = "antispam_archive", required = true)
    protected String antispamArchive;
    @XmlElement(name = "antispam_alt_mailport", required = true)
    protected String antispamAltMailport;
    @XmlElement(name = "antispam_header_name", required = true)
    protected String antispamHeaderName;
    @XmlElement(name = "antispam_header_text", required = true)
    protected String antispamHeaderText;
    @XmlElement(name = "antispam_subject_action", required = true)
    protected String antispamSubjectAction;
    @XmlElement(name = "antispam_subject_text", required = true)
    protected String antispamSubjectText;

    /**
     * Gets the value of the antispamAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntispamAction() {
        return antispamAction;
    }

    /**
     * Sets the value of the antispamAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntispamAction(String value) {
        this.antispamAction = value;
    }

    /**
     * Gets the value of the antispamAltMailhost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntispamAltMailhost() {
        return antispamAltMailhost;
    }

    /**
     * Sets the value of the antispamAltMailhost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntispamAltMailhost(String value) {
        this.antispamAltMailhost = value;
    }

    /**
     * Gets the value of the antispamAltRcptTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntispamAltRcptTo() {
        return antispamAltRcptTo;
    }

    /**
     * Sets the value of the antispamAltRcptTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntispamAltRcptTo(String value) {
        this.antispamAltRcptTo = value;
    }

    /**
     * Gets the value of the antispamArchive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntispamArchive() {
        return antispamArchive;
    }

    /**
     * Sets the value of the antispamArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntispamArchive(String value) {
        this.antispamArchive = value;
    }

    /**
     * Gets the value of the antispamAltMailport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntispamAltMailport() {
        return antispamAltMailport;
    }

    /**
     * Sets the value of the antispamAltMailport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntispamAltMailport(String value) {
        this.antispamAltMailport = value;
    }

    /**
     * Gets the value of the antispamHeaderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntispamHeaderName() {
        return antispamHeaderName;
    }

    /**
     * Sets the value of the antispamHeaderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntispamHeaderName(String value) {
        this.antispamHeaderName = value;
    }

    /**
     * Gets the value of the antispamHeaderText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntispamHeaderText() {
        return antispamHeaderText;
    }

    /**
     * Sets the value of the antispamHeaderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntispamHeaderText(String value) {
        this.antispamHeaderText = value;
    }

    /**
     * Gets the value of the antispamSubjectAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntispamSubjectAction() {
        return antispamSubjectAction;
    }

    /**
     * Sets the value of the antispamSubjectAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntispamSubjectAction(String value) {
        this.antispamSubjectAction = value;
    }

    /**
     * Gets the value of the antispamSubjectText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntispamSubjectText() {
        return antispamSubjectText;
    }

    /**
     * Sets the value of the antispamSubjectText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntispamSubjectText(String value) {
        this.antispamSubjectText = value;
    }

}
