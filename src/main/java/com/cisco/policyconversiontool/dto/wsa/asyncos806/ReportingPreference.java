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
    "username",
    "reportSections"
})
@XmlRootElement(name = "reporting_preference")
public class ReportingPreference {

    @XmlElement(required = true)
    protected Username username;
    @XmlElement(name = "report_sections", required = true)
    protected ReportSections reportSections;

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link Username }
     *     
     */
    public Username getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link Username }
     *     
     */
    public void setUsername(Username value) {
        this.username = value;
    }

    /**
     * Gets the value of the reportSections property.
     * 
     * @return
     *     possible object is
     *     {@link ReportSections }
     *     
     */
    public ReportSections getReportSections() {
        return reportSections;
    }

    /**
     * Sets the value of the reportSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportSections }
     *     
     */
    public void setReportSections(ReportSections value) {
        this.reportSections = value;
    }

}
