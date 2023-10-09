package io.webfolder.cdp.event.overlay;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired when the node should be highlighted
 * This happens after call to <code>setInspectMode</code>
 */
@Domain("Overlay")
@EventName("nodeHighlightRequested")
public class NodeHighlightRequested {
    private Integer nodeId;

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }
}
