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
    "proxAclRulesWebcatUnreachableSetting"
})
@XmlRootElement(name = "prox_acl_rules_webcat_unreachable")
public class ProxAclRulesWebcatUnreachable {

    @XmlElement(name = "prox_acl_rules_webcat_unreachable_setting")
    protected List<ProxAclRulesWebcatUnreachableSetting> proxAclRulesWebcatUnreachableSetting;

    /**
     * Gets the value of the proxAclRulesWebcatUnreachableSetting property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proxAclRulesWebcatUnreachableSetting property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProxAclRulesWebcatUnreachableSetting().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProxAclRulesWebcatUnreachableSetting }
     * 
     * 
     */
    public List<ProxAclRulesWebcatUnreachableSetting> getProxAclRulesWebcatUnreachableSetting() {
        if (proxAclRulesWebcatUnreachableSetting == null) {
            proxAclRulesWebcatUnreachableSetting = new ArrayList<ProxAclRulesWebcatUnreachableSetting>();
        }
        return this.proxAclRulesWebcatUnreachableSetting;
    }

}
