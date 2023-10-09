package io.webfolder.cdp.exception;

public class UndefinedVariableException extends CdpException {

    private static final long serialVersionUID = 5847179621426074493L;

    private final String variableName;

    public UndefinedVariableException(String message, String variableName) {
        super(message);
        this.variableName = variableName;
    }

    public String getVariableName() {
        return variableName;
    }
}
