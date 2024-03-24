package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.dom.BackendNode;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Called when distribution is changed
 */
@Experimental
@Domain("DOM")
@EventName("distributedNodesUpdated")
@Data
public class DistributedNodesUpdated {

    /**
     * Insertion point where distributed nodes were updated.
     */
    private Integer insertionPointId;
    /**
     * Distributed nodes for given insertion point.
     */
    private List<BackendNode> distributedNodes = new ArrayList<>();

}
