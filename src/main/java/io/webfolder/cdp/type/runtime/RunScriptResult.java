package io.webfolder.cdp.type.runtime;

import lombok.Getter;

@Getter
public class RunScriptResult {

    private RemoteObject result;

    private ExceptionDetails exceptionDetails;

}
