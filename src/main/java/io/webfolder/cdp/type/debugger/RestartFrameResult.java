package io.webfolder.cdp.type.debugger;

import io.webfolder.cdp.type.runtime.StackTrace;
import io.webfolder.cdp.type.runtime.StackTraceId;
import lombok.Getter;

import java.util.List;

@Getter
public class RestartFrameResult {

    private List<CallFrame> callFrames;

    private StackTrace asyncStackTrace;

    private StackTraceId asyncStackTraceId;

}
