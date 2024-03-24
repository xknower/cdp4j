package io.webfolder.cdp.type.runtime;

import lombok.Getter;

@Getter
public class EvaluateResult {

    private RemoteObject result;

    private ExceptionDetails exceptionDetails;

}
