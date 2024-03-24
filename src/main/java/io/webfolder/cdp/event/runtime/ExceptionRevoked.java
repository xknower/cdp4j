package io.webfolder.cdp.event.runtime;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Issued when unhandled exception was revoked
 */
@Domain("Runtime")
@EventName("exceptionRevoked")
@Data
public class ExceptionRevoked {

    /**
     * Reason describing why exception was revoked.
     */
    private String reason;
    /**
     * The id of revoked exception, as reported in <code>exceptionThrown</code>.
     */
    private Integer exceptionId;

}
