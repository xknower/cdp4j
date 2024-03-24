package io.webfolder.cdp.type.runtime;

import lombok.Getter;

@Getter
public class CallFunctionOnResult {

    private RemoteObject result;

    private ExceptionDetails exceptionDetails;

}
