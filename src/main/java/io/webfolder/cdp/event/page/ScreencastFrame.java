package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.page.ScreencastFrameMetadata;

/**
 * Compressed image data requested by the <code>startScreencast</code>
 */
@Experimental
@Domain("Page")
@EventName("screencastFrame")
public class ScreencastFrame {
    private String data;

    private ScreencastFrameMetadata metadata;

    private Integer sessionId;

    /**
     * Base64-encoded compressed image.
     */
    public String getData() {
        return data;
    }

    /**
     * Base64-encoded compressed image.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Screencast frame metadata.
     */
    public ScreencastFrameMetadata getMetadata() {
        return metadata;
    }

    /**
     * Screencast frame metadata.
     */
    public void setMetadata(ScreencastFrameMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Frame number.
     */
    public Integer getSessionId() {
        return sessionId;
    }

    /**
     * Frame number.
     */
    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }
}
