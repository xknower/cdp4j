package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Fired when same-document navigation happens, eg
 * due to history API usage or anchor navigation
 */
@Experimental
@Domain("Page")
@EventName("navigatedWithinDocument")
@Data
public class NavigatedWithinDocument {

    /**
     * Id of the frame.
     */
    private String frameId;
    /**
     * Frame's new url.
     */
    private String url;

}
