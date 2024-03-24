package io.webfolder.cdp.type.console;

import io.webfolder.cdp.type.constant.MessageSeverity;
import io.webfolder.cdp.type.constant.MessageSource;
import lombok.Data;

/**
 * Console message
 */
@Data
public class ConsoleMessage {

    /**
     * Message source.
     */
    private MessageSource source;
    /**
     * Message severity.
     */
    private MessageSeverity level;
    /**
     * Message text.
     */
    private String text;
    /**
     * URL of the message origin.
     */
    private String url;
    /**
     * Line number in the resource that generated this message (1-based).
     */
    private Integer line;
    /**
     * Column number in the resource that generated this message (1-based).
     */
    private Integer column;

}
