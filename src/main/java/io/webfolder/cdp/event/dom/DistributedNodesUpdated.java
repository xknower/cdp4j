package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.dom.BackendNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Called when distrubution is changed
 */
@Experimental
@Domain("DOM")
@EventName("distributedNodesUpdated")
public class DistributedNodesUpdated {
    private Integer insertionPointId;

    private List<BackendNode> distributedNodes = new ArrayList<>();

    /**
     * Insertion point where distrubuted nodes were updated.
     */
    public Integer getInsertionPointId() {
        return insertionPointId;
    }

    /**
     * Insertion point where distrubuted nodes were updated.
     */
    public void setInsertionPointId(Integer insertionPointId) {
        this.insertionPointId = insertionPointId;
    }

    /**
     * Distributed nodes for given insertion point.
     */
    public List<BackendNode> getDistributedNodes() {
        return distributedNodes;
    }

    /**
     * Distributed nodes for given insertion point.
     */
    public void setDistributedNodes(List<BackendNode> distributedNodes) {
        this.distributedNodes = distributedNodes;
    }
}
