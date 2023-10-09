package io.webfolder.cdp.type.runtime;

public class CompileScriptResult {
    private String scriptId;

    private ExceptionDetails exceptionDetails;

    public String getScriptId() {
        return scriptId;
    }

    public ExceptionDetails getExceptionDetails() {
        return exceptionDetails;
    }
}
