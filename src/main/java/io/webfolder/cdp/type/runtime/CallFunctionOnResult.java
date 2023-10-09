package io.webfolder.cdp.type.runtime;

public class CallFunctionOnResult {
    private RemoteObject result;

    private ExceptionDetails exceptionDetails;

    public RemoteObject getResult() {
        return result;
    }

    public ExceptionDetails getExceptionDetails() {
        return exceptionDetails;
    }
}
