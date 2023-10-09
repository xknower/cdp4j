package io.webfolder.cdp.event.runtime;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.runtime.ExecutionContextDescription;

/**
 * Issued when new execution context is created
 */
@Domain("Runtime")
@EventName("executionContextCreated")
public class ExecutionContextCreated {
    private ExecutionContextDescription context;

    /**
     * A newly created execution context.
     */
    public ExecutionContextDescription getContext() {
        return context;
    }

    /**
     * A newly created execution context.
     */
    public void setContext(ExecutionContextDescription context) {
        this.context = context;
    }
}
