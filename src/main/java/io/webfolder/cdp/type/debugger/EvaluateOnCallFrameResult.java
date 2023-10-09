package io.webfolder.cdp.type.debugger;

import io.webfolder.cdp.type.runtime.ExceptionDetails;
import io.webfolder.cdp.type.runtime.RemoteObject;

public class EvaluateOnCallFrameResult {
    private RemoteObject result;

    private ExceptionDetails exceptionDetails;

    public RemoteObject getResult() {
        return result;
    }

    public ExceptionDetails getExceptionDetails() {
        return exceptionDetails;
    }
}
