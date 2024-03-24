package io.webfolder.cdp.listener;

/**
 * 结束事件，会话关闭时触发
 */
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
