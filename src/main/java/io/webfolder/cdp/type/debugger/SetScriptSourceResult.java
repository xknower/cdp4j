package io.webfolder.cdp.type.debugger;

import io.webfolder.cdp.type.runtime.ExceptionDetails;
import io.webfolder.cdp.type.runtime.StackTrace;
import io.webfolder.cdp.type.runtime.StackTraceId;

import java.util.List;

public class SetScriptSourceResult {
    private List<CallFrame> callFrames;

    private Boolean stackChanged;

    private StackTrace asyncStackTrace;

    private StackTraceId asyncStackTraceId;

    private ExceptionDetails exceptionDetails;

    public List<CallFrame> getCallFrames() {
        return callFrames;
    }

    public Boolean getStackChanged() {
        return stackChanged;
    }

    public StackTrace getAsyncStackTrace() {
        return asyncStackTrace;
    }

    public StackTraceId getAsyncStackTraceId() {
        return asyncStackTraceId;
    }

    public ExceptionDetails getExceptionDetails() {
        return exceptionDetails;
    }
}
