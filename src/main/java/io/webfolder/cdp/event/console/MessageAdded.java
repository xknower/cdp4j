package io.webfolder.cdp.event.console;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.console.ConsoleMessage;
import lombok.Data;

/**
 * Issued when new console message is added
 */
@Domain("Console")
@EventName("messageAdded")
@Data
public class MessageAdded {

    /**
     * Console message that has been added.
     */
    private ConsoleMessage message;

}
