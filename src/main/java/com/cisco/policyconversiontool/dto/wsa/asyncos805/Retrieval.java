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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "scpPushOrFtpPushOrFtpPollOrSyslogPush"
})
@XmlRootElement(name = "retrieval")
public class Retrieval {

    @XmlElements({
        @XmlElement(name = "scp_push", required = true, type = ScpPush.class),
        @XmlElement(name = "ftp_push", required = true, type = FtpPush.class),
        @XmlElement(name = "ftp_poll", required = true, type = FtpPoll.class),
        @XmlElement(name = "syslog_push", required = true, type = SyslogPush.class)
    })
    protected List<Object> scpPushOrFtpPushOrFtpPollOrSyslogPush;

    /**
     * Gets the value of the scpPushOrFtpPushOrFtpPollOrSyslogPush property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scpPushOrFtpPushOrFtpPollOrSyslogPush property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScpPushOrFtpPushOrFtpPollOrSyslogPush().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScpPush }
     * {@link FtpPush }
     * {@link FtpPoll }
     * {@link SyslogPush }
     * 
     * 
     */
    public List<Object> getScpPushOrFtpPushOrFtpPollOrSyslogPush() {
        if (scpPushOrFtpPushOrFtpPollOrSyslogPush == null) {
            scpPushOrFtpPushOrFtpPollOrSyslogPush = new ArrayList<Object>();
        }
        return this.scpPushOrFtpPushOrFtpPollOrSyslogPush;
    }

}
