package io.webfolder.cdp.type.domsnapshot;

import io.webfolder.cdp.type.dom.PseudoType;
import io.webfolder.cdp.type.dom.ShadowRootType;
import io.webfolder.cdp.type.domdebugger.EventListener;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * A Node in the DOM tree
 */
@Data
public class DOMNode {

    /**
     * <code>Node</code>'s nodeType.
     */
    private Integer nodeType;
    /**
     * <code>Node</code>'s nodeName.
     */
    private String nodeName;
    /**
     * <code>Node<code>'s nodeValue.
     */
    private String nodeValue;
    /**
     * Only set for textarea elements, contains the text value.
     */
    private String textValue;
    /**
     * Only set for input elements, contains the input's associated text value.
     */
    private String inputValue;
    /**
     * Only set for radio and checkbox input elements, indicates if the element has been checked
     */
    private Boolean inputChecked;
    /**
     * Only set for option elements, indicates if the element has been selected
     */
    private Boolean optionSelected;
    /**
     * <code>Node</code>'s id, corresponds to DOM.Node.backendNodeId.
     */
    private Integer backendNodeId;
    /**
     * The indexes of the node's child nodes in the <code>domNodes</code> array returned by<code>getSnapshot</code>, if
     * any.
     */
    private List<Integer> childNodeIndexes = new ArrayList<>();
    /**
     * Attributes of an<code>Element</code> node.
     */
    private List<NameValue> attributes = new ArrayList<>();
    /**
     * Indexes of pseudo elements associated with this node in the <code>domNodes</code> array returned by
     * <code>getSnapshot</code>, if any.
     */
    private List<Integer> pseudoElementIndexes = new ArrayList<>();
    /**
     * The index of the node's related layout tree node in the <code>layoutTreeNodes</code> array returned by
     * <code>getSnapshot</code>, if any.
     */
    private Integer layoutNodeIndex;
    /**
     * Document URL that <code>Document</code> or <code>FrameOwner</code> node points to.
     */
    private String documentURL;
    /**
     * Base URL that <code>Document</code> or <code>FrameOwner</code> node uses for URL completion.
     */
    private String baseURL;
    /**
     * Only set for documents, contains the document's content language.
     */
    private String contentLanguage;
    /**
     * Only set for documents, contains the document's character set encoding.
     */
    private String documentEncoding;
    /**
     * <code>DocumentType</code> node's publicId.
     */
    private String publicId;
    /**
     * <code>DocumentType</code> node's systemId.
     */
    private String systemId;
    /**
     * Frame ID for frame owner elements and also for the document node.
     */
    private String frameId;
    /**
     * The index of a frame owner element's content document in the <code>domNodes</code> array returned by
     * <code>getSnapshot</code>, if any.
     */
    private Integer contentDocumentIndex;
    /**
     * Type of a pseudo element node.
     */
    private PseudoType pseudoType;
    /**
     * Shadow root type.
     */
    private ShadowRootType shadowRootType;
    /**
     * Whether this DOM node responds to mouse clicks. This includes nodes that have had click
     * event listeners attached via JavaScript as well as anchor tags that naturally navigate when
     * clicked.
     */
    private Boolean isClickable;
    /**
     * Details of the node's event listeners, if any.
     */
    private List<EventListener> eventListeners = new ArrayList<>();
    /**
     * The selected url for nodes with a srcset attribute.
     */
    private String currentSourceURL;
    /**
     * The url of the script (if any) that generates this node.
     */
    private String originURL;
    /**
     * Scroll offsets, set when this node is a Document.
     */
    private Double scrollOffsetX;

    private Double scrollOffsetY;

}
