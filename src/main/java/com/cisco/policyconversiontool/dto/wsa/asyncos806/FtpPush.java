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
    "filename",
    "hostname",
    "loginUsername",
    "password",
    "directory",
    "rollovertime",
    "rolloversize",
    "rollover",
    "compression"
})
@XmlRootElement(name = "ftp_push")
public class FtpPush {

    protected String filename;
    @XmlElement(required = true)
    protected String hostname;
    @XmlElement(name = "login_username", required = true)
    protected String loginUsername;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected String directory;
    protected String rollovertime;
    protected String rolloversize;
    protected Rollover rollover;
    protected Compression compression;

    /**
     * Gets the value of the filename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Sets the value of the filename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Gets the value of the hostname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostname() {
        return hostname;
    }

    /**
     * Sets the value of the hostname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostname(String value) {
        this.hostname = value;
    }

    /**
     * Gets the value of the loginUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginUsername() {
        return loginUsername;
    }

    /**
     * Sets the value of the loginUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginUsername(String value) {
        this.loginUsername = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
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
     * Gets the value of the rollover property.
     * 
     * @return
     *     possible object is
     *     {@link Rollover }
     *     
     */
    public Rollover getRollover() {
        return rollover;
    }

    /**
     * Sets the value of the rollover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rollover }
     *     
     */
    public void setRollover(Rollover value) {
        this.rollover = value;
    }

    /**
     * Gets the value of the compression property.
     * 
     * @return
     *     possible object is
     *     {@link Compression }
     *     
     */
    public Compression getCompression() {
        return compression;
    }

    /**
     * Sets the value of the compression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Compression }
     *     
     */
    public void setCompression(Compression value) {
        this.compression = value;
    }

}
