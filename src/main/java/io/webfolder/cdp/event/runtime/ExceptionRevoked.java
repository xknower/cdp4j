package io.webfolder.cdp.event.runtime;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Issued when unhandled exception was revoked
 */
@Domain("Runtime")
@EventName("exceptionRevoked")
public class ExceptionRevoked {
    private String reason;

    private Integer exceptionId;

    /**
     * Reason describing why exception was revoked.
     */
    public String getReason() {
        return reason;
    }

    /**
     * Reason describing why exception was revoked.
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * The id of revoked exception, as reported in <code>exceptionThrown</code>.
     */
    public Integer getExceptionId() {
        return exceptionId;
    }

    /**
     * The id of revoked exception, as reported in <code>exceptionThrown</code>.
     */
    public void setExceptionId(Integer exceptionId) {
        this.exceptionId = exceptionId;
    }
}
