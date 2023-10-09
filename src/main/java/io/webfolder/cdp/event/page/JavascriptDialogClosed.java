package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) has been
 * closed
 */
@Domain("Page")
@EventName("javascriptDialogClosed")
public class JavascriptDialogClosed {
    private Boolean result;

    private String userInput;

    /**
     * Whether dialog was confirmed.
     */
    public Boolean isResult() {
        return result;
    }

    /**
     * Whether dialog was confirmed.
     */
    public void setResult(Boolean result) {
        this.result = result;
    }

    /**
     * User input in case of prompt.
     */
    public String getUserInput() {
        return userInput;
    }

    /**
     * User input in case of prompt.
     */
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
}
