package io.webfolder.cdp.type.runtime;

import lombok.Getter;

@Getter
public class CompileScriptResult {

    private String scriptId;

    private ExceptionDetails exceptionDetails;

}
