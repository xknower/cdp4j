package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.dom.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * Fired when backend wants to provide client with the missing DOM structure
 * This happens upon
 * most of the calls requesting node ids
 */
@Domain("DOM")
@EventName("setChildNodes")
public class SetChildNodes {
    private Integer parentId;

    private List<Node> nodes = new ArrayList<>();

    /**
     * Parent node id to populate with children.
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * Parent node id to populate with children.
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * Child nodes array.
     */
    public List<Node> getNodes() {
        return nodes;
    }

    /**
     * Child nodes array.
     */
    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }
}
