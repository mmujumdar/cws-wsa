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
    "iccmConfigBlacklist",
    "iccmClientManagedBy"
})
@XmlRootElement(name = "iccm")
public class Iccm {

    @XmlElement(name = "iccm_config_blacklist")
    protected IccmConfigBlacklist iccmConfigBlacklist;
    @XmlElement(name = "iccm_client_managed_by")
    protected String iccmClientManagedBy;

    /**
     * Gets the value of the iccmConfigBlacklist property.
     * 
     * @return
     *     possible object is
     *     {@link IccmConfigBlacklist }
     *     
     */
    public IccmConfigBlacklist getIccmConfigBlacklist() {
        return iccmConfigBlacklist;
    }

    /**
     * Sets the value of the iccmConfigBlacklist property.
     * 
     * @param value
     *     allowed object is
     *     {@link IccmConfigBlacklist }
     *     
     */
    public void setIccmConfigBlacklist(IccmConfigBlacklist value) {
        this.iccmConfigBlacklist = value;
    }

    /**
     * Gets the value of the iccmClientManagedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccmClientManagedBy() {
        return iccmClientManagedBy;
    }

    /**
     * Sets the value of the iccmClientManagedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccmClientManagedBy(String value) {
        this.iccmClientManagedBy = value;
    }

}
