package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.page.DialogType;
import lombok.Data;

/**
 * Fired when a JavaScript initiated dialog (alert, confirm, prompt, or onbeforeunload) is about to
 * open
 */
@Domain("Page")
@EventName("javascriptDialogOpening")
@Data
public class JavascriptDialogOpening {

    /**
     * Frame url.
     */
    private String url;
    /**
     * Message that will be displayed by the dialog.
     */
    private String message;
    /**
     * Dialog type.
     */
    private DialogType type;
    /**
     * True iff browser is capable showing or acting on the given dialog. When browser has no
     * dialog handler for given target, calling alert while Page domain is engaged will stall
     * the page execution. Execution can be resumed via calling Page.handleJavaScriptDialog.
     */
    private Boolean hasBrowserHandler;
    /**
     * Default dialog prompt.
     */
    private String defaultPrompt;

}
