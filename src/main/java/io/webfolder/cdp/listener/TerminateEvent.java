package io.webfolder.cdp.listener;

public class TerminateEvent {

    private final String message;

    public TerminateEvent(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "TerminateEvent [message=" + message + "]";
    }
}
