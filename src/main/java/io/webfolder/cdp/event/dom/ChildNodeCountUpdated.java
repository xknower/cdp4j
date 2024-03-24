package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired when <code>Container</code>'s child node count has changed
 */
@Domain("DOM")
@EventName("childNodeCountUpdated")
@Data
public class ChildNodeCountUpdated {

    /**
     * Id of the node that has changed.
     */
    private Integer nodeId;
    /**
     * New node count.
     */
    private Integer childNodeCount;

}
