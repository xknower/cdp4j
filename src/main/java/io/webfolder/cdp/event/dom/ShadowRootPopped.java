package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;

/**
 * Called when shadow root is popped from the element
 */
@Experimental
@Domain("DOM")
@EventName("shadowRootPopped")
public class ShadowRootPopped {
    private Integer hostId;

    private Integer rootId;

    /**
     * Host element id.
     */
    public Integer getHostId() {
        return hostId;
    }

    /**
     * Host element id.
     */
    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }

    /**
     * Shadow root id.
     */
    public Integer getRootId() {
        return rootId;
    }

    /**
     * Shadow root id.
     */
    public void setRootId(Integer rootId) {
        this.rootId = rootId;
    }
}
