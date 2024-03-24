package io.webfolder.cdp.type.domsnapshot;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Table containing nodes
 */
@Data
public class NodeTreeSnapshot {

    /**
     * Parent node index.
     */
    private List<Integer> parentIndex = new ArrayList<>();
    /**
     * <code>Node</code>'s nodeType.
     */
    private List<Integer> nodeType = new ArrayList<>();
    /**
     * <code>Node</code>'s nodeName.
     */
    private List<Integer> nodeName = new ArrayList<>();
    /**
     * <code>Node</code>'s nodeValue.
     */
    private List<Integer> nodeValue = new ArrayList<>();
    /**
     * <code>Node</code>'s id, corresponds to DOM.Node.backendNodeId.
     */
    private List<Integer> backendNodeId = new ArrayList<>();
    /**
     * Only set for textarea elements, contains the text value.
     */
    private RareStringData textValue;
    /**
     * Only set for input elements, contains the input's associated text value.
     */
    private RareStringData inputValue;
    /**
     * Only set for radio and checkbox input elements, indicates if the element has been checked
     */
    private RareBooleanData inputChecked;
    /**
     * Only set for option elements, indicates if the element has been selected
     */
    private RareBooleanData optionSelected;
    /**
     * The index of the document in the list of the snapshot documents.
     */
    private RareIntegerData contentDocumentIndex;
    /**
     * Type of a pseudo element node.
     */
    private RareStringData pseudoType;
    /**
     * Whether this DOM node responds to mouse clicks. This includes nodes that have had click
     * event listeners attached via JavaScript as well as anchor tags that naturally navigate when
     * clicked.
     */
    private RareBooleanData isClickable;
    /**
     * The selected url for nodes with a srcset attribute.
     */
    private RareStringData currentSourceURL;
    /**
     * The url of the script (if any) that generates this node.
     */
    private RareStringData originURL;

}
