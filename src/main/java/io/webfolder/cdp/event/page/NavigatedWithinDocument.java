package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;

/**
 * Fired when same-document navigation happens, eg
 * due to history API usage or anchor navigation
 */
@Experimental
@Domain("Page")
@EventName("navigatedWithinDocument")
public class NavigatedWithinDocument {
    private String frameId;

    private String url;

    /**
     * Id of the frame.
     */
    public String getFrameId() {
        return frameId;
    }

    /**
     * Id of the frame.
     */
    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }

    /**
     * Frame's new url.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Frame's new url.
     */
    public void setUrl(String url) {
        this.url = url;
    }
}
