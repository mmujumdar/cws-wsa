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
    "antivirusSquelchHeader",
    "antivirusClean",
    "antivirusDropAttachments",
    "antivirusBehaviorMsgCleaned",
    "antivirusBehaviorMsgEnc",
    "antivirusBehaviorMsgUnscan",
    "antivirusBehaviorMsgUncleaned"
})
@XmlRootElement(name = "antivirus")
public class Antivirus {

    @XmlElement(name = "antivirus_squelch_header")
    protected String antivirusSquelchHeader;
    @XmlElement(name = "antivirus_clean", required = true)
    protected String antivirusClean;
    @XmlElement(name = "antivirus_drop_attachments", required = true)
    protected String antivirusDropAttachments;
    @XmlElement(name = "antivirus_behavior_msg_cleaned")
    protected AntivirusBehaviorMsgCleaned antivirusBehaviorMsgCleaned;
    @XmlElement(name = "antivirus_behavior_msg_enc")
    protected AntivirusBehaviorMsgEnc antivirusBehaviorMsgEnc;
    @XmlElement(name = "antivirus_behavior_msg_unscan")
    protected AntivirusBehaviorMsgUnscan antivirusBehaviorMsgUnscan;
    @XmlElement(name = "antivirus_behavior_msg_uncleaned")
    protected AntivirusBehaviorMsgUncleaned antivirusBehaviorMsgUncleaned;

    /**
     * Gets the value of the antivirusSquelchHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntivirusSquelchHeader() {
        return antivirusSquelchHeader;
    }

    /**
     * Sets the value of the antivirusSquelchHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntivirusSquelchHeader(String value) {
        this.antivirusSquelchHeader = value;
    }

    /**
     * Gets the value of the antivirusClean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntivirusClean() {
        return antivirusClean;
    }

    /**
     * Sets the value of the antivirusClean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntivirusClean(String value) {
        this.antivirusClean = value;
    }

    /**
     * Gets the value of the antivirusDropAttachments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntivirusDropAttachments() {
        return antivirusDropAttachments;
    }

    /**
     * Sets the value of the antivirusDropAttachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntivirusDropAttachments(String value) {
        this.antivirusDropAttachments = value;
    }

    /**
     * Gets the value of the antivirusBehaviorMsgCleaned property.
     * 
     * @return
     *     possible object is
     *     {@link AntivirusBehaviorMsgCleaned }
     *     
     */
    public AntivirusBehaviorMsgCleaned getAntivirusBehaviorMsgCleaned() {
        return antivirusBehaviorMsgCleaned;
    }

    /**
     * Sets the value of the antivirusBehaviorMsgCleaned property.
     * 
     * @param value
     *     allowed object is
     *     {@link AntivirusBehaviorMsgCleaned }
     *     
     */
    public void setAntivirusBehaviorMsgCleaned(AntivirusBehaviorMsgCleaned value) {
        this.antivirusBehaviorMsgCleaned = value;
    }

    /**
     * Gets the value of the antivirusBehaviorMsgEnc property.
     * 
     * @return
     *     possible object is
     *     {@link AntivirusBehaviorMsgEnc }
     *     
     */
    public AntivirusBehaviorMsgEnc getAntivirusBehaviorMsgEnc() {
        return antivirusBehaviorMsgEnc;
    }

    /**
     * Sets the value of the antivirusBehaviorMsgEnc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AntivirusBehaviorMsgEnc }
     *     
     */
    public void setAntivirusBehaviorMsgEnc(AntivirusBehaviorMsgEnc value) {
        this.antivirusBehaviorMsgEnc = value;
    }

    /**
     * Gets the value of the antivirusBehaviorMsgUnscan property.
     * 
     * @return
     *     possible object is
     *     {@link AntivirusBehaviorMsgUnscan }
     *     
     */
    public AntivirusBehaviorMsgUnscan getAntivirusBehaviorMsgUnscan() {
        return antivirusBehaviorMsgUnscan;
    }

    /**
     * Sets the value of the antivirusBehaviorMsgUnscan property.
     * 
     * @param value
     *     allowed object is
     *     {@link AntivirusBehaviorMsgUnscan }
     *     
     */
    public void setAntivirusBehaviorMsgUnscan(AntivirusBehaviorMsgUnscan value) {
        this.antivirusBehaviorMsgUnscan = value;
    }

    /**
     * Gets the value of the antivirusBehaviorMsgUncleaned property.
     * 
     * @return
     *     possible object is
     *     {@link AntivirusBehaviorMsgUncleaned }
     *     
     */
    public AntivirusBehaviorMsgUncleaned getAntivirusBehaviorMsgUncleaned() {
        return antivirusBehaviorMsgUncleaned;
    }

    /**
     * Sets the value of the antivirusBehaviorMsgUncleaned property.
     * 
     * @param value
     *     allowed object is
     *     {@link AntivirusBehaviorMsgUncleaned }
     *     
     */
    public void setAntivirusBehaviorMsgUncleaned(AntivirusBehaviorMsgUncleaned value) {
        this.antivirusBehaviorMsgUncleaned = value;
    }

}