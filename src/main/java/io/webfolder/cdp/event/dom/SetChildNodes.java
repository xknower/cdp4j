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

    /**
     * Parent node id to populate with children.
     */
    private Integer parentId;
    /**
     * Child nodes array.
     */
    private List<Node> nodes = new ArrayList<>();

}
