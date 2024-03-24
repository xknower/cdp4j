package io.webfolder.cdp.type.domsnapshot;

import io.webfolder.cdp.type.dom.Rect;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Details of an element in the DOM tree with a LayoutObject
 */
@Data
public class LayoutTreeNode {

    /**
     * The index of the related DOM node in the <code>domNodes</code> array returned by<code>getSnapshot</code>.
     */
    private Integer domNodeIndex;
    /**
     * The bounding box in document coordinates. Note that scroll offset of the document is ignored.
     */
    private Rect boundingBox;
    /**
     * Contents of the LayoutText, if any.
     */
    private String layoutText;
    /**
     * The post-layout inline text nodes, if any.
     */
    private List<InlineTextBox> inlineTextNodes = new ArrayList<>();
    /**
     * Index into the <code>computedStyles</code> array returned by <code>getSnapshot</code>.
     */
    private Integer styleIndex;
    /**
     * Global paint order index, which is determined by the stacking order of the nodes. Nodes
     * that are painted together will have the same index. Only provided if includePaintOrder in
     * getSnapshot was true.
     */
    private Integer paintOrder;
    /**
     * Set to true to indicate the element begins a new stacking context.
     */
    private Boolean isStackingContext;

}
