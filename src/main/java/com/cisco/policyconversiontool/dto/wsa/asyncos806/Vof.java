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
    "policyStatus",
    "bypassExt"
})
@XmlRootElement(name = "vof")
public class Vof {

    @XmlElement(name = "policy_status", required = true)
    protected String policyStatus;
    @XmlElement(name = "bypass_ext")
    protected List<BypassExt> bypassExt;

    /**
     * Gets the value of the policyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyStatus() {
        return policyStatus;
    }

    /**
     * Sets the value of the policyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyStatus(String value) {
        this.policyStatus = value;
    }

    /**
     * Gets the value of the bypassExt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bypassExt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBypassExt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BypassExt }
     * 
     * 
     */
    public List<BypassExt> getBypassExt() {
        if (bypassExt == null) {
            bypassExt = new ArrayList<BypassExt>();
        }
        return this.bypassExt;
    }

}
