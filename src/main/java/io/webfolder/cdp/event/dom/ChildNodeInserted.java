package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.dom.Node;

/**
 * Mirrors <code>DOMNodeInserted</code> event
 */
@Domain("DOM")
@EventName("childNodeInserted")
public class ChildNodeInserted {
    private Integer parentNodeId;

    private Integer previousNodeId;

    private Node node;

    /**
     * Id of the node that has changed.
     */
    public Integer getParentNodeId() {
        return parentNodeId;
    }

    /**
     * Id of the node that has changed.
     */
    public void setParentNodeId(Integer parentNodeId) {
        this.parentNodeId = parentNodeId;
    }

    /**
     * If of the previous siblint.
     */
    public Integer getPreviousNodeId() {
        return previousNodeId;
    }

    /**
     * If of the previous siblint.
     */
    public void setPreviousNodeId(Integer previousNodeId) {
        this.previousNodeId = previousNodeId;
    }

    /**
     * Inserted node data.
     */
    public Node getNode() {
        return node;
    }

    /**
     * Inserted node data.
     */
    public void setNode(Node node) {
        this.node = node;
    }
}
