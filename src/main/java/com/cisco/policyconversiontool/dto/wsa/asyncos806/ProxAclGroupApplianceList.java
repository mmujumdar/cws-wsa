//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.26 at 05:46:49 PM IST 
//


package com.cisco.policyconversiontool.dto.wsa.asyncos806;

import java.io.Serializable;
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
    "proxAclGroupApplianceIp"
})
@XmlRootElement(name = "prox_acl_group_appliance_list")
public class ProxAclGroupApplianceList  implements Serializable {
    @XmlElement(name = "prox_acl_group_appliance_ip")
    protected List<ProxAclGroupApplianceIp> proxAclGroupApplianceIp;

    /**
     * Gets the value of the proxAclGroupApplianceIp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proxAclGroupApplianceIp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProxAclGroupApplianceIp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProxAclGroupApplianceIp }
     * 
     * 
     */
    public List<ProxAclGroupApplianceIp> getProxAclGroupApplianceIp() {
        if (proxAclGroupApplianceIp == null) {
            proxAclGroupApplianceIp = new ArrayList<ProxAclGroupApplianceIp>();
        }
        return this.proxAclGroupApplianceIp;
    }

}
