package io.webfolder.cdp.exception;

public class CdpException extends RuntimeException {

    private static final long serialVersionUID = -2442450203010176063L;

    public CdpException(Throwable e) {
        super(e);
    }

    public CdpException(String message) {
        super(message);
    }
}
