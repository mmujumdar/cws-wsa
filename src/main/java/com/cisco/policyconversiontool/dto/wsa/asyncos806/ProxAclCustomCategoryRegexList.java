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
    "proxAclCustomCategoryRegex"
})
@XmlRootElement(name = "prox_acl_custom_category_regex_list")
public class ProxAclCustomCategoryRegexList {

    @XmlElement(name = "prox_acl_custom_category_regex")
    protected List<ProxAclCustomCategoryRegex> proxAclCustomCategoryRegex;

    /**
     * Gets the value of the proxAclCustomCategoryRegex property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proxAclCustomCategoryRegex property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProxAclCustomCategoryRegex().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProxAclCustomCategoryRegex }
     * 
     * 
     */
    public List<ProxAclCustomCategoryRegex> getProxAclCustomCategoryRegex() {
        if (proxAclCustomCategoryRegex == null) {
            proxAclCustomCategoryRegex = new ArrayList<ProxAclCustomCategoryRegex>();
        }
        return this.proxAclCustomCategoryRegex;
    }

}
