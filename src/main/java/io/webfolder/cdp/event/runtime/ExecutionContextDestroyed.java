package io.webfolder.cdp.event.runtime;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Issued when execution context is destroyed
 */
@Domain("Runtime")
@EventName("executionContextDestroyed")
public class ExecutionContextDestroyed {
    private Integer executionContextId;

    /**
     * Id of the destroyed context
     */
    public Integer getExecutionContextId() {
        return executionContextId;
    }

    /**
     * Id of the destroyed context
     */
    public void setExecutionContextId(Integer executionContextId) {
        this.executionContextId = executionContextId;
    }
}
