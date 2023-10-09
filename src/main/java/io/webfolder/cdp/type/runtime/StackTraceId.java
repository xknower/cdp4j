package io.webfolder.cdp.type.runtime;

import io.webfolder.cdp.annotation.Experimental;

/**
 * If <code>debuggerId</code> is set stack trace comes from another debugger and can be resolved there
 * This
 * allows to track cross-debugger calls
 * See Runtime <code>StackTrace<code> and Debugger
 * paused</code>for usages
 */
@Experimental
public class StackTraceId {
    private String id;

    private String debuggerId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDebuggerId() {
        return debuggerId;
    }

    public void setDebuggerId(String debuggerId) {
        this.debuggerId = debuggerId;
    }
}
