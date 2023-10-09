package io.webfolder.cdp.exception;

public class LoadTimeoutException extends CdpException {

    private static final long serialVersionUID = 2319366102554237916L;

    public LoadTimeoutException(String message) {
        super(message);
    }

    public LoadTimeoutException(Throwable e) {
        super(e);
    }
}
