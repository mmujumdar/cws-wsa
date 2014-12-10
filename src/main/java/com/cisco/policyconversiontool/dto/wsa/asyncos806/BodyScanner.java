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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "mimeSkipOrMimeScan",
    "maxDepth",
    "assumeMatch",
    "maxSize",
    "mimeparseFailAction",
    "defaultTextEncoding",
    "binScanEncodings"
})
@XmlRootElement(name = "body_scanner")
public class BodyScanner {

    @XmlElements({
        @XmlElement(name = "mime_skip", required = true, type = MimeSkip.class),
        @XmlElement(name = "mime_scan", required = true, type = MimeScan.class)
    })
    protected List<Object> mimeSkipOrMimeScan;
    @XmlElement(name = "max_depth", required = true)
    protected String maxDepth;
    @XmlElement(name = "assume_match", required = true)
    protected String assumeMatch;
    @XmlElement(name = "max_size", required = true)
    protected String maxSize;
    @XmlElement(name = "mimeparse_fail_action", required = true)
    protected String mimeparseFailAction;
    @XmlElement(name = "default_text_encoding")
    protected String defaultTextEncoding;
    @XmlElement(name = "bin_scan_encodings")
    protected BinScanEncodings binScanEncodings;

    /**
     * Gets the value of the mimeSkipOrMimeScan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mimeSkipOrMimeScan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMimeSkipOrMimeScan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MimeSkip }
     * {@link MimeScan }
     * 
     * 
     */
    public List<Object> getMimeSkipOrMimeScan() {
        if (mimeSkipOrMimeScan == null) {
            mimeSkipOrMimeScan = new ArrayList<Object>();
        }
        return this.mimeSkipOrMimeScan;
    }

    /**
     * Gets the value of the maxDepth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDepth() {
        return maxDepth;
    }

    /**
     * Sets the value of the maxDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDepth(String value) {
        this.maxDepth = value;
    }

    /**
     * Gets the value of the assumeMatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssumeMatch() {
        return assumeMatch;
    }

    /**
     * Sets the value of the assumeMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssumeMatch(String value) {
        this.assumeMatch = value;
    }

    /**
     * Gets the value of the maxSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxSize() {
        return maxSize;
    }

    /**
     * Sets the value of the maxSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxSize(String value) {
        this.maxSize = value;
    }

    /**
     * Gets the value of the mimeparseFailAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeparseFailAction() {
        return mimeparseFailAction;
    }

    /**
     * Sets the value of the mimeparseFailAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeparseFailAction(String value) {
        this.mimeparseFailAction = value;
    }

    /**
     * Gets the value of the defaultTextEncoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultTextEncoding() {
        return defaultTextEncoding;
    }

    /**
     * Sets the value of the defaultTextEncoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultTextEncoding(String value) {
        this.defaultTextEncoding = value;
    }

    /**
     * Gets the value of the binScanEncodings property.
     * 
     * @return
     *     possible object is
     *     {@link BinScanEncodings }
     *     
     */
    public BinScanEncodings getBinScanEncodings() {
        return binScanEncodings;
    }

    /**
     * Sets the value of the binScanEncodings property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinScanEncodings }
     *     
     */
    public void setBinScanEncodings(BinScanEncodings value) {
        this.binScanEncodings = value;
    }

}
