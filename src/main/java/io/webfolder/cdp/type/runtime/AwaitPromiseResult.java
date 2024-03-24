package io.webfolder.cdp.type.runtime;

import lombok.Getter;

@Getter
public class AwaitPromiseResult {

    private RemoteObject result;

    private ExceptionDetails exceptionDetails;

}
