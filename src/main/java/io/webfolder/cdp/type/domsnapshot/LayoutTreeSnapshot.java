package io.webfolder.cdp.type.domsnapshot;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Details of an element in the DOM tree with a LayoutObject
 */
@Data
public class LayoutTreeSnapshot {

    /**
     * The index of the related DOM node in the <code>domNodes</code> array returned by<code>getSnapshot</code>.
     */
    private List<Integer> nodeIndex = new ArrayList<>();
    /**
     * The absolute position bounding box.
     */
    private List<List<Double>> bounds = new ArrayList<>();
    /**
     * Contents of the LayoutText, if any.
     */
    private List<Integer> text = new ArrayList<>();
    /**
     * Stacking context information.
     */
    private RareBooleanData stackingContexts;

}
