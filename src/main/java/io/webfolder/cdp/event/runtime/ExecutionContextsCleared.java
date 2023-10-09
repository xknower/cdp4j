package io.webfolder.cdp.event.runtime;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Issued when all executionContexts were cleared in browser
 */
@Domain("Runtime")
@EventName("executionContextsCleared")
public class ExecutionContextsCleared {
}
