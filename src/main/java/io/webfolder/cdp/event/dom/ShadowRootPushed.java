package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.dom.Node;

/**
 * Called when shadow root is pushed into the element
 */
@Experimental
@Domain("DOM")
@EventName("shadowRootPushed")
public class ShadowRootPushed {
    private Integer hostId;

    private Node root;

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
     * Shadow root.
     */
    public Node getRoot() {
        return root;
    }

    /**
     * Shadow root.
     */
    public void setRoot(Node root) {
        this.root = root;
    }
}
