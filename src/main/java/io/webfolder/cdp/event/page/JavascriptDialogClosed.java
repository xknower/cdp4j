package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been
 * closed
 */
@Domain("Page")
@EventName("javascriptDialogClosed")
@Data
public class JavascriptDialogClosed {

    /**
     * Whether dialog was confirmed.
     */
    private Boolean result;
    /**
     * User input in case of prompt.
     */
    private String userInput;

}
