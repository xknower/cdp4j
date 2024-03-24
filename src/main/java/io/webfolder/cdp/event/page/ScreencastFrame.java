package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.page.ScreencastFrameMetadata;
import lombok.Data;

/**
 * Compressed image data requested by the <code>startScreencast</code>
 */
@Experimental
@Domain("Page")
@EventName("screencastFrame")
@Data
public class ScreencastFrame {

    /**
     * Base64-encoded compressed image.
     */
    private String data;
    /**
     * Screencast frame metadata.
     */
    private ScreencastFrameMetadata metadata;
    /**
     * Frame number.
     */
    private Integer sessionId;

}
