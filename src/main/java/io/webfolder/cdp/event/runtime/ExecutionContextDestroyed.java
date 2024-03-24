package io.webfolder.cdp.event.runtime;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Issued when execution context is destroyed
 */
@Domain("Runtime")
@EventName("executionContextDestroyed")
@Data
public class ExecutionContextDestroyed {

    /**
     * Id of the destroyed context
     */
    private Integer executionContextId;

}
