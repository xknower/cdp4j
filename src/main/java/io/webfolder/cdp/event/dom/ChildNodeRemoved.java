package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Mirrors <code>DOMNodeRemoved</code> event
 */
@Domain("DOM")
@EventName("childNodeRemoved")
public class ChildNodeRemoved {
    private Integer parentNodeId;

    private Integer nodeId;

    /**
     * Parent id.
     */
    public Integer getParentNodeId() {
        return parentNodeId;
    }

    /**
     * Parent id.
     */
    public void setParentNodeId(Integer parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    /**
     * Id of the node that has been removed.
     */
    public Integer getNodeId() {
        return nodeId;
    }

    /**
     * Id of the node that has been removed.
     */
    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }
}
