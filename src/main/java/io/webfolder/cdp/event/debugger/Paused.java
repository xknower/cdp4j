package io.webfolder.cdp.event.debugger;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.constant.PauseReason;
import io.webfolder.cdp.type.debugger.CallFrame;
import io.webfolder.cdp.type.runtime.StackTrace;
import io.webfolder.cdp.type.runtime.StackTraceId;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Fired when the virtual machine stopped on breakpoint or exception or any other stop criteria
 */
@Domain("Debugger")
@EventName("paused")
@Data
public class Paused {

    /**
     * Call stack the virtual machine stopped on.
     */
    private List<CallFrame> callFrames = new ArrayList<>();
    /**
     * Pause reason.
     */
    private PauseReason reason;
    /**
     * Object containing break-specific auxiliary properties.
     */
    private Object data;
    /**
     * Hit breakpoints IDs
     */
    private List<String> hitBreakpoints;
    /**
     * Async stack trace, if any.
     */
    private StackTrace asyncStackTrace;
    /**
     * Async stack trace, if any.
     */
    private StackTraceId asyncStackTraceId;
    /**
     * Just scheduled async call will have this stack trace as parent stack during async execution.
     * This field is available only after <code>Debugger.stepInto</code>call with<code>breakOnAsynCall</code> flag.
     */
    private StackTraceId asyncCallStackTraceId;

}
