package io.webfolder.cdp.event.runtime;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.runtime.ExceptionDetails;
import lombok.Data;

/**
 * Issued when exception was thrown and unhandled
 */
@Domain("Runtime")
@EventName("exceptionThrown")
@Data
public class ExceptionThrown {

    /**
     * Timestamp of the exception.
     */
    private Double timestamp;

    private ExceptionDetails exceptionDetails;

}
