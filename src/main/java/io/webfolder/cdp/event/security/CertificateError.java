package io.webfolder.cdp.event.security;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

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
@Data
public class CertificateError {

    /**
     * The ID of the event.
     */
    private Integer eventId;
    /**
     * The type of the error.
     */
    private String errorType;
    /**
     * The url that was requested.
     */
    private String requestURL;

}
