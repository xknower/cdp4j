package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;

import java.util.ArrayList;
import java.util.List;

/**
 * Fired when <code>Element</code>'s inline style is modified via a CSS property modification
 */
@Experimental
@Domain("DOM")
@EventName("inlineStyleInvalidated")
public class InlineStyleInvalidated {
    private List<Integer> nodeIds = new ArrayList<>();

    /**
     * Ids of the nodes for which the inline styles have been invalidated.
     */
    public List<Integer> getNodeIds() {
        return nodeIds;
    }

    /**
     * Ids of the nodes for which the inline styles have been invalidated.
     */
    public void setNodeIds(List<Integer> nodeIds) {
        this.nodeIds = nodeIds;
    }
}
