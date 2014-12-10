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
    "quarantineSize",
    "quarantineRetention",
    "quarantineAction",
    "quarantineSubjectAction",
    "quarantineSubjectText",
    "quarantineNormalActions",
    "quarantineOverflowActions",
    "quarantineUsers"
})
@XmlRootElement(name = "vof_quarantine")
public class VofQuarantine {

    @XmlElement(name = "quarantine_size", required = true)
    protected String quarantineSize;
    @XmlElement(name = "quarantine_retention", required = true)
    protected String quarantineRetention;
    @XmlElement(name = "quarantine_action")
    protected String quarantineAction;
    @XmlElement(name = "quarantine_subject_action")
    protected String quarantineSubjectAction;
    @XmlElement(name = "quarantine_subject_text")
    protected String quarantineSubjectText;
    @XmlElement(name = "quarantine_normal_actions")
    protected QuarantineNormalActions quarantineNormalActions;
    @XmlElement(name = "quarantine_overflow_actions")
    protected QuarantineOverflowActions quarantineOverflowActions;
    @XmlElement(name = "quarantine_users")
    protected QuarantineUsers quarantineUsers;

    /**
     * Gets the value of the quarantineSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarantineSize() {
        return quarantineSize;
    }

    /**
     * Sets the value of the quarantineSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarantineSize(String value) {
        this.quarantineSize = value;
    }

    /**
     * Gets the value of the quarantineRetention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarantineRetention() {
        return quarantineRetention;
    }

    /**
     * Sets the value of the quarantineRetention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarantineRetention(String value) {
        this.quarantineRetention = value;
    }

    /**
     * Gets the value of the quarantineAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarantineAction() {
        return quarantineAction;
    }

    /**
     * Sets the value of the quarantineAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarantineAction(String value) {
        this.quarantineAction = value;
    }

    /**
     * Gets the value of the quarantineSubjectAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarantineSubjectAction() {
        return quarantineSubjectAction;
    }

    /**
     * Sets the value of the quarantineSubjectAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarantineSubjectAction(String value) {
        this.quarantineSubjectAction = value;
    }

    /**
     * Gets the value of the quarantineSubjectText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuarantineSubjectText() {
        return quarantineSubjectText;
    }

    /**
     * Sets the value of the quarantineSubjectText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuarantineSubjectText(String value) {
        this.quarantineSubjectText = value;
    }

    /**
     * Gets the value of the quarantineNormalActions property.
     * 
     * @return
     *     possible object is
     *     {@link QuarantineNormalActions }
     *     
     */
    public QuarantineNormalActions getQuarantineNormalActions() {
        return quarantineNormalActions;
    }

    /**
     * Sets the value of the quarantineNormalActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuarantineNormalActions }
     *     
     */
    public void setQuarantineNormalActions(QuarantineNormalActions value) {
        this.quarantineNormalActions = value;
    }

    /**
     * Gets the value of the quarantineOverflowActions property.
     * 
     * @return
     *     possible object is
     *     {@link QuarantineOverflowActions }
     *     
     */
    public QuarantineOverflowActions getQuarantineOverflowActions() {
        return quarantineOverflowActions;
    }

    /**
     * Sets the value of the quarantineOverflowActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuarantineOverflowActions }
     *     
     */
    public void setQuarantineOverflowActions(QuarantineOverflowActions value) {
        this.quarantineOverflowActions = value;
    }

    /**
     * Gets the value of the quarantineUsers property.
     * 
     * @return
     *     possible object is
     *     {@link QuarantineUsers }
     *     
     */
    public QuarantineUsers getQuarantineUsers() {
        return quarantineUsers;
    }

    /**
     * Sets the value of the quarantineUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuarantineUsers }
     *     
     */
    public void setQuarantineUsers(QuarantineUsers value) {
        this.quarantineUsers = value;
    }

}
