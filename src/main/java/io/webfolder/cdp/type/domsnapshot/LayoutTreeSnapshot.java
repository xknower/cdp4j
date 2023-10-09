package io.webfolder.cdp.type.domsnapshot;

import java.util.ArrayList;
import java.util.List;

/**
 * Details of an element in the DOM tree with a LayoutObject
 */
public class LayoutTreeSnapshot {
    private List<Integer> nodeIndex = new ArrayList<>();

    private List<List<Double>> bounds = new ArrayList<>();

    private List<Integer> text = new ArrayList<>();

    private RareBooleanData stackingContexts;

    /**
     * The index of the related DOM node in the <code>domNodes</code> array returned by<code>getSnapshot</code>.
     */
    public List<Integer> getNodeIndex() {
        return nodeIndex;
    }

    /**
     * The index of the related DOM node in the <code>domNodes</code> array returned by<code>getSnapshot</code>.
     */
    public void setNodeIndex(List<Integer> nodeIndex) {
        this.nodeIndex = nodeIndex;
    }

    /**
     * The absolute position bounding box.
     */
    public List<List<Double>> getBounds() {
        return bounds;
    }

    /**
     * The absolute position bounding box.
     */
    public void setBounds(List<List<Double>> bounds) {
        this.bounds = bounds;
    }

    /**
     * Contents of the LayoutText, if any.
     */
    public List<Integer> getText() {
        return text;
    }

    /**
     * Contents of the LayoutText, if any.
     */
    public void setText(List<Integer> text) {
        this.text = text;
    }

    /**
     * Stacking context information.
     */
    public RareBooleanData getStackingContexts() {
        return stackingContexts;
    }

    /**
     * Stacking context information.
     */
    public void setStackingContexts(RareBooleanData stackingContexts) {
        this.stackingContexts = stackingContexts;
    }
}
