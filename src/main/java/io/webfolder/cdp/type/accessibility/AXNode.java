package io.webfolder.cdp.type.accessibility;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * A node in the accessibility tree
 */
@Data
public class AXNode {

    /**
     * Unique identifier for this node.
     */
    private String nodeId;
    /**
     * Whether this node is ignored for accessibility
     */
    private Boolean ignored;
    /**
     * Collection of reasons why this node is hidden.
     */
    private List<AXProperty> ignoredReasons = new ArrayList<>();
    /**
     * This <code>Node</code>'s role, whether explicit or implicit.
     */
    private AXValue role;
    /**
     * The accessible name for this <code>Node</code>.
     */
    private AXValue name;
    /**
     * The accessible description for this <code>Node</code>.
     */
    private AXValue description;
    /**
     * The value for this <code>Node</code>.
     */
    private AXValue value;
    /**
     * All other properties
     */
    private List<AXProperty> properties = new ArrayList<>();
    /**
     * The backend ID for the associated DOM node, if any.
     */
    private Integer backendDOMNodeId;

}
