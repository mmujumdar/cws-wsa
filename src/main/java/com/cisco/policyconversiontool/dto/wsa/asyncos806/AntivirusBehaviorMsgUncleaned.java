//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.26 at 05:46:49 PM IST 
//


package com.cisco.policyconversiontool.dto.wsa.asyncos806;

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
    "antivirusAction",
    "antivirusAltRcptTo",
    "antivirusAltMailhost",
    "antivirusArchive",
    "antivirusHeaderName",
    "antivirusHeaderText",
    "antivirusMessageTextTemplate",
    "antivirusNotifySender",
    "antivirusNotifyRcpt",
    "antivirusNotifyOther",
    "antivirusSubjectAction",
    "antivirusSubjectText"
})
@XmlRootElement(name = "antivirus_behavior_msg_uncleaned")
public class AntivirusBehaviorMsgUncleaned {

    @XmlElement(name = "antivirus_action", required = true)
    protected String antivirusAction;
    @XmlElement(name = "antivirus_alt_rcpt_to")
    protected String antivirusAltRcptTo;
    @XmlElement(name = "antivirus_alt_mailhost")
    protected String antivirusAltMailhost;
    @XmlElement(name = "antivirus_archive", required = true)
    protected String antivirusArchive;
    @XmlElement(name = "antivirus_header_name")
    protected String antivirusHeaderName;
    @XmlElement(name = "antivirus_header_text")
    protected String antivirusHeaderText;
    @XmlElement(name = "antivirus_message_text_template")
    protected String antivirusMessageTextTemplate;
    @XmlElement(name = "antivirus_notify_sender", required = true)
    protected String antivirusNotifySender;
    @XmlElement(name = "antivirus_notify_rcpt", required = true)
    protected String antivirusNotifyRcpt;
    @XmlElement(name = "antivirus_notify_other")
    protected List<AntivirusNotifyOther> antivirusNotifyOther;
    @XmlElement(name = "antivirus_subject_action")
    protected String antivirusSubjectAction;
    @XmlElement(name = "antivirus_subject_text")
    protected String antivirusSubjectText;

    /**
     * Gets the value of the antivirusAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntivirusAction() {
        return antivirusAction;
    }

    /**
     * Sets the value of the antivirusAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntivirusAction(String value) {
        this.antivirusAction = value;
    }

    /**
     * Gets the value of the antivirusAltRcptTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntivirusAltRcptTo() {
        return antivirusAltRcptTo;
    }

    /**
     * Sets the value of the antivirusAltRcptTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntivirusAltRcptTo(String value) {
        this.antivirusAltRcptTo = value;
    }

    /**
     * Gets the value of the antivirusAltMailhost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntivirusAltMailhost() {
        return antivirusAltMailhost;
    }

    /**
     * Sets the value of the antivirusAltMailhost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntivirusAltMailhost(String value) {
        this.antivirusAltMailhost = value;
    }

    /**
     * Gets the value of the antivirusArchive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntivirusArchive() {
        return antivirusArchive;
    }

    /**
     * Sets the value of the antivirusArchive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntivirusArchive(String value) {
        this.antivirusArchive = value;
    }

    /**
     * Gets the value of the antivirusHeaderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntivirusHeaderName() {
        return antivirusHeaderName;
    }

    /**
     * Sets the value of the antivirusHeaderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntivirusHeaderName(String value) {
        this.antivirusHeaderName = value;
    }

    /**
     * Gets the value of the antivirusHeaderText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntivirusHeaderText() {
        return antivirusHeaderText;
    }

    /**
     * Sets the value of the antivirusHeaderText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntivirusHeaderText(String value) {
        this.antivirusHeaderText = value;
    }

    /**
     * Gets the value of the antivirusMessageTextTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntivirusMessageTextTemplate() {
        return antivirusMessageTextTemplate;
    }

    /**
     * Sets the value of the antivirusMessageTextTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntivirusMessageTextTemplate(String value) {
        this.antivirusMessageTextTemplate = value;
    }

    /**
     * Gets the value of the antivirusNotifySender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntivirusNotifySender() {
        return antivirusNotifySender;
    }

    /**
     * Sets the value of the antivirusNotifySender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntivirusNotifySender(String value) {
        this.antivirusNotifySender = value;
    }

    /**
     * Gets the value of the antivirusNotifyRcpt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntivirusNotifyRcpt() {
        return antivirusNotifyRcpt;
    }

    /**
     * Sets the value of the antivirusNotifyRcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntivirusNotifyRcpt(String value) {
        this.antivirusNotifyRcpt = value;
    }

    /**
     * Gets the value of the antivirusNotifyOther property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the antivirusNotifyOther property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAntivirusNotifyOther().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AntivirusNotifyOther }
     * 
     * 
     */
    public List<AntivirusNotifyOther> getAntivirusNotifyOther() {
        if (antivirusNotifyOther == null) {
            antivirusNotifyOther = new ArrayList<AntivirusNotifyOther>();
        }
        return this.antivirusNotifyOther;
    }

    /**
     * Gets the value of the antivirusSubjectAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntivirusSubjectAction() {
        return antivirusSubjectAction;
    }

    /**
     * Sets the value of the antivirusSubjectAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntivirusSubjectAction(String value) {
        this.antivirusSubjectAction = value;
    }

    /**
     * Gets the value of the antivirusSubjectText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntivirusSubjectText() {
        return antivirusSubjectText;
    }

    /**
     * Sets the value of the antivirusSubjectText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntivirusSubjectText(String value) {
        this.antivirusSubjectText = value;
    }

}
