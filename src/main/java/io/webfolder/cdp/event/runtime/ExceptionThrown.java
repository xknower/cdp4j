package io.webfolder.cdp.event.runtime;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.runtime.ExceptionDetails;

/**
 * Issued when exception was thrown and unhandled
 */
@Domain("Runtime")
@EventName("exceptionThrown")
public class ExceptionThrown {
    private Double timestamp;

    private ExceptionDetails exceptionDetails;

    /**
     * Timestamp of the exception.
     */
    public Double getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp of the exception.
     */
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    public ExceptionDetails getExceptionDetails() {
        return exceptionDetails;
    }

    public void setExceptionDetails(ExceptionDetails exceptionDetails) {
        this.exceptionDetails = exceptionDetails;
    }
}
