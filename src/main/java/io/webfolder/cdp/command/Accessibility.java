package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Optional;
import io.webfolder.cdp.annotation.Returns;
import io.webfolder.cdp.type.accessibility.AXNode;

import java.util.List;

@Experimental
@Domain("Accessibility")
public interface Accessibility {
    /**
     * Disables the accessibility domain.
     */
    void disable();

    /**
     * Enables the accessibility domain which causes <code>AXNodeId</code>s to remain consistent between method calls.
     * This turns on accessibility for the page, which can impact performance until accessibility is disabled.
     */
    void enable();

    /**
     * Fetches the accessibility node and partial accessibility tree for this DOM node, if it exists.
     *
     * @param nodeId         Identifier of the node to get the partial accessibility tree for.
     * @param backendNodeId  Identifier of the backend node to get the partial accessibility tree for.
     * @param objectId       JavaScript object id of the node wrapper to get the partial accessibility tree for.
     * @param fetchRelatives Whether to fetch this nodes ancestors, siblings and children. Defaults to true.
     * @return The <code>Accessibility.AXNode</code> for this DOM node, if it exists, plus its ancestors, siblings and
     * children, if requested.
     */
    @Experimental
    @Returns("nodes")
    List<AXNode> getPartialAXTree(
            @Optional Integer nodeId, @Optional Integer backendNodeId,
            @Optional String objectId, @Optional Boolean fetchRelatives);

    /**
     * Fetches the entire accessibility tree
     */
    @Experimental
    @Returns("nodes")
    List<AXNode> getFullAXTree();

    /**
     * Fetches the accessibility node and partial accessibility tree for this DOM node, if it exists.
     *
     * @return The <code>Accessibility.AXNode</code> for this DOM node, if it exists, plus its ancestors, siblings and
     * children, if requested.
     */
    @Experimental
    @Returns("nodes")
    List<AXNode> getPartialAXTree();
}
