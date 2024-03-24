package io.webfolder.cdp.type.debugger;

import io.webfolder.cdp.type.runtime.ExceptionDetails;
import io.webfolder.cdp.type.runtime.RemoteObject;
import lombok.Getter;

@Getter
public class EvaluateOnCallFrameResult {

    private RemoteObject result;

    private ExceptionDetails exceptionDetails;

}
