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
    "smadGlobal"
})
@XmlRootElement(name = "smad")
public class Smad {

    @XmlElement(name = "smad_global", required = true)
    protected SmadGlobal smadGlobal;

    /**
     * Gets the value of the smadGlobal property.
     * 
     * @return
     *     possible object is
     *     {@link SmadGlobal }
     *     
     */
    public SmadGlobal getSmadGlobal() {
        return smadGlobal;
    }

    /**
     * Sets the value of the smadGlobal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SmadGlobal }
     *     
     */
    public void setSmadGlobal(SmadGlobal value) {
        this.smadGlobal = value;
    }

}
