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
    "reportingEnabled",
    "reportingHideWebUserName",
    "reportingSlave",
    "reportingHaystack",
    "reportdDb",
    "reportingFromAddress",
    "reportingTimespent",
    "reportingBucketingEnabled",
    "categoryTimeValues",
    "periodicReports",
    "userReports"
})
@XmlRootElement(name = "reporting")
public class Reporting {

    @XmlElement(name = "reporting_enabled", required = true)
    protected String reportingEnabled;
    @XmlElement(name = "reporting_hide_web_user_name")
    protected String reportingHideWebUserName;
    @XmlElement(name = "reporting_slave")
    protected ReportingSlave reportingSlave;
    @XmlElement(name = "reporting_haystack")
    protected ReportingHaystack reportingHaystack;
    @XmlElement(name = "reportd_db")
    protected ReportdDb reportdDb;
    @XmlElement(name = "reporting_from_address")
    protected ReportingFromAddress reportingFromAddress;
    @XmlElement(name = "reporting_timespent")
    protected String reportingTimespent;
    @XmlElement(name = "reporting_bucketing_enabled")
    protected String reportingBucketingEnabled;
    @XmlElement(name = "category_time_values")
    protected CategoryTimeValues categoryTimeValues;
    @XmlElement(name = "periodic_reports")
    protected PeriodicReports periodicReports;
    @XmlElement(name = "user_reports")
    protected UserReports userReports;

    /**
     * Gets the value of the reportingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingEnabled() {
        return reportingEnabled;
    }

    /**
     * Sets the value of the reportingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingEnabled(String value) {
        this.reportingEnabled = value;
    }

    /**
     * Gets the value of the reportingHideWebUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingHideWebUserName() {
        return reportingHideWebUserName;
    }

    /**
     * Sets the value of the reportingHideWebUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingHideWebUserName(String value) {
        this.reportingHideWebUserName = value;
    }

    /**
     * Gets the value of the reportingSlave property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingSlave }
     *     
     */
    public ReportingSlave getReportingSlave() {
        return reportingSlave;
    }

    /**
     * Sets the value of the reportingSlave property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingSlave }
     *     
     */
    public void setReportingSlave(ReportingSlave value) {
        this.reportingSlave = value;
    }

    /**
     * Gets the value of the reportingHaystack property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingHaystack }
     *     
     */
    public ReportingHaystack getReportingHaystack() {
        return reportingHaystack;
    }

    /**
     * Sets the value of the reportingHaystack property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingHaystack }
     *     
     */
    public void setReportingHaystack(ReportingHaystack value) {
        this.reportingHaystack = value;
    }

    /**
     * Gets the value of the reportdDb property.
     * 
     * @return
     *     possible object is
     *     {@link ReportdDb }
     *     
     */
    public ReportdDb getReportdDb() {
        return reportdDb;
    }

    /**
     * Sets the value of the reportdDb property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportdDb }
     *     
     */
    public void setReportdDb(ReportdDb value) {
        this.reportdDb = value;
    }

    /**
     * Gets the value of the reportingFromAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ReportingFromAddress }
     *     
     */
    public ReportingFromAddress getReportingFromAddress() {
        return reportingFromAddress;
    }

    /**
     * Sets the value of the reportingFromAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportingFromAddress }
     *     
     */
    public void setReportingFromAddress(ReportingFromAddress value) {
        this.reportingFromAddress = value;
    }

    /**
     * Gets the value of the reportingTimespent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingTimespent() {
        return reportingTimespent;
    }

    /**
     * Sets the value of the reportingTimespent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingTimespent(String value) {
        this.reportingTimespent = value;
    }

    /**
     * Gets the value of the reportingBucketingEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingBucketingEnabled() {
        return reportingBucketingEnabled;
    }

    /**
     * Sets the value of the reportingBucketingEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingBucketingEnabled(String value) {
        this.reportingBucketingEnabled = value;
    }

    /**
     * Gets the value of the categoryTimeValues property.
     * 
     * @return
     *     possible object is
     *     {@link CategoryTimeValues }
     *     
     */
    public CategoryTimeValues getCategoryTimeValues() {
        return categoryTimeValues;
    }

    /**
     * Sets the value of the categoryTimeValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryTimeValues }
     *     
     */
    public void setCategoryTimeValues(CategoryTimeValues value) {
        this.categoryTimeValues = value;
    }

    /**
     * Gets the value of the periodicReports property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodicReports }
     *     
     */
    public PeriodicReports getPeriodicReports() {
        return periodicReports;
    }

    /**
     * Sets the value of the periodicReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodicReports }
     *     
     */
    public void setPeriodicReports(PeriodicReports value) {
        this.periodicReports = value;
    }

    /**
     * Gets the value of the userReports property.
     * 
     * @return
     *     possible object is
     *     {@link UserReports }
     *     
     */
    public UserReports getUserReports() {
        return userReports;
    }

    /**
     * Sets the value of the userReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserReports }
     *     
     */
    public void setUserReports(UserReports value) {
        this.userReports = value;
    }

}