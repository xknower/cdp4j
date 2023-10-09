package io.webfolder.cdp.event.console;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.console.ConsoleMessage;

/**
 * Issued when new console message is added
 */
@Domain("Console")
@EventName("messageAdded")
public class MessageAdded {
    private ConsoleMessage message;

    /**
     * Console message that has been added.
     */
    public ConsoleMessage getMessage() {
        return message;
    }

    /**
     * Console message that has been added.
     */
    public void setMessage(ConsoleMessage message) {
        this.message = message;
    }
}
