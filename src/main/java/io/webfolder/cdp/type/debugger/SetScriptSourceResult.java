package io.webfolder.cdp.type.debugger;

import io.webfolder.cdp.type.runtime.ExceptionDetails;
import io.webfolder.cdp.type.runtime.StackTrace;
import io.webfolder.cdp.type.runtime.StackTraceId;
import lombok.Getter;

import java.util.List;

@Getter
public class SetScriptSourceResult {

    private List<CallFrame> callFrames;

    private Boolean stackChanged;

    private StackTrace asyncStackTrace;

    private StackTraceId asyncStackTraceId;

    private ExceptionDetails exceptionDetails;

}
