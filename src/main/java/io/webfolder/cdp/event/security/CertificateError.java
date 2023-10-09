package io.webfolder.cdp.event.security;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * There is a certificate error
 * If overriding certificate errors is enabled, then it should be
 * handled with the <code>handleCertificateError</code> command
 * Note: this event does not fire if the
 * certificate error has been allowed internally
 * Only one client per target should override
 * certificate errors at the same time
 */
@Domain("Security")
@EventName("certificateError")
public class CertificateError {
    private Integer eventId;

    private String errorType;

    private String requestURL;

    /**
     * The ID of the event.
     */
    public Integer getEventId() {
        return eventId;
    }

    /**
     * The ID of the event.
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    /**
     * The type of the error.
     */
    public String getErrorType() {
        return errorType;
    }

    /**
     * The type of the error.
     */
    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    /**
     * The url that was requested.
     */
    public String getRequestURL() {
        return requestURL;
    }

    /**
     * The url that was requested.
     */
    public void setRequestURL(String requestURL) {
        this.requestURL = requestURL;
    }
}
