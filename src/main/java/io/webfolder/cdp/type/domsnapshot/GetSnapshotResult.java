package io.webfolder.cdp.type.domsnapshot;

import java.util.List;

public class GetSnapshotResult {
    private List<DOMNode> domNodes;

    private List<LayoutTreeNode> layoutTreeNodes;

    private List<ComputedStyle> computedStyles;

    public List<DOMNode> getDomNodes() {
        return domNodes;
    }

    public List<LayoutTreeNode> getLayoutTreeNodes() {
        return layoutTreeNodes;
    }

    public List<ComputedStyle> getComputedStyles() {
        return computedStyles;
    }
}
