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
    "rolloverMaxFiles",
    "rolloversize",
    "rollovertime",
    "rolloverSchedule"
})
@XmlRootElement(name = "rollover")
public class Rollover {

    @XmlElement(name = "rollover_max_files")
    protected String rolloverMaxFiles;
    protected String rolloversize;
    protected String rollovertime;
    @XmlElement(name = "rollover_schedule")
    protected RolloverSchedule rolloverSchedule;

    /**
     * Gets the value of the rolloverMaxFiles property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolloverMaxFiles() {
        return rolloverMaxFiles;
    }

    /**
     * Sets the value of the rolloverMaxFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolloverMaxFiles(String value) {
        this.rolloverMaxFiles = value;
    }

    /**
     * Gets the value of the rolloversize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRolloversize() {
        return rolloversize;
    }

    /**
     * Sets the value of the rolloversize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRolloversize(String value) {
        this.rolloversize = value;
    }

    /**
     * Gets the value of the rollovertime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRollovertime() {
        return rollovertime;
    }

    /**
     * Sets the value of the rollovertime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRollovertime(String value) {
        this.rollovertime = value;
    }

    /**
     * Gets the value of the rolloverSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link RolloverSchedule }
     *     
     */
    public RolloverSchedule getRolloverSchedule() {
        return rolloverSchedule;
    }

    /**
     * Sets the value of the rolloverSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link RolloverSchedule }
     *     
     */
    public void setRolloverSchedule(RolloverSchedule value) {
        this.rolloverSchedule = value;
    }

}
