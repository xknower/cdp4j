package io.webfolder.cdp.type.debugger;

import io.webfolder.cdp.type.runtime.StackTrace;
import io.webfolder.cdp.type.runtime.StackTraceId;

import java.util.List;

public class RestartFrameResult {
    private List<CallFrame> callFrames;

    private StackTrace asyncStackTrace;

    private StackTraceId asyncStackTraceId;

    public List<CallFrame> getCallFrames() {
        return callFrames;
    }

    public StackTrace getAsyncStackTrace() {
        return asyncStackTrace;
    }

    public StackTraceId getAsyncStackTraceId() {
        return asyncStackTraceId;
    }
}
