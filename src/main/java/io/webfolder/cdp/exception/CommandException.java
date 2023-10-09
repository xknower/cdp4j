package io.webfolder.cdp.exception;

public class CommandException extends CdpException {

    private static final long serialVersionUID = -815753477843472988L;

    private final int code;

    public CommandException(final int code, final String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
