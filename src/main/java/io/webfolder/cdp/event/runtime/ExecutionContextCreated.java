package io.webfolder.cdp.event.runtime;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.runtime.ExecutionContextDescription;
import lombok.Data;

/**
 * Issued when new execution context is created
 */
@Domain("Runtime")
@EventName("executionContextCreated")
@Data
public class ExecutionContextCreated {

    /**
     * A newly created execution context.
     */
    private ExecutionContextDescription context;

}
