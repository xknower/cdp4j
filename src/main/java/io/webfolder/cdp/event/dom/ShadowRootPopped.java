package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Called when shadow root is popped from the element
 */
@Experimental
@Domain("DOM")
@EventName("shadowRootPopped")
@Data
public class ShadowRootPopped {

    /**
     * Host element id.
     */
    private Integer hostId;
    /**
     * Shadow root id.
     */
    private Integer rootId;

}
