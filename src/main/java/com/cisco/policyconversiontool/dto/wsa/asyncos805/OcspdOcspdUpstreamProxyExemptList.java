//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.15 at 08:28:02 PM IST 
//


package com.cisco.policyconversiontool.dto.wsa.asyncos805;

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
    "ocspdOcspdUpstreamProxyExemptListValue"
})
@XmlRootElement(name = "ocspd_ocspd_upstream_proxy_exempt_list")
public class OcspdOcspdUpstreamProxyExemptList {

    @XmlElement(name = "ocspd_ocspd_upstream_proxy_exempt_list_value")
    protected List<OcspdOcspdUpstreamProxyExemptListValue> ocspdOcspdUpstreamProxyExemptListValue;

    /**
     * Gets the value of the ocspdOcspdUpstreamProxyExemptListValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ocspdOcspdUpstreamProxyExemptListValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOcspdOcspdUpstreamProxyExemptListValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OcspdOcspdUpstreamProxyExemptListValue }
     * 
     * 
     */
    public List<OcspdOcspdUpstreamProxyExemptListValue> getOcspdOcspdUpstreamProxyExemptListValue() {
        if (ocspdOcspdUpstreamProxyExemptListValue == null) {
            ocspdOcspdUpstreamProxyExemptListValue = new ArrayList<OcspdOcspdUpstreamProxyExemptListValue>();
        }
        return this.ocspdOcspdUpstreamProxyExemptListValue;
    }

}
