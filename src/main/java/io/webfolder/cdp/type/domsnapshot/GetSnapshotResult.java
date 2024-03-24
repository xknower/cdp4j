package io.webfolder.cdp.type.domsnapshot;

import lombok.Getter;

import java.util.List;

@Getter
public class GetSnapshotResult {

    private List<DOMNode> domNodes;

    private List<LayoutTreeNode> layoutTreeNodes;

    private List<ComputedStyle> computedStyles;

}
