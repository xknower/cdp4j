package io.webfolder.cdp.type.dom;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * DOM interaction is implemented in terms of mirror objects that represent the actual DOM nodes
 * DOMNode is a base node mirror type
 */
@Data
public class Node {

    /**
     * Node identifier that is passed into the rest of the DOM messages as the <code>nodeId</code>. Backend
     * will only push node with given <code>id</code> once. It is aware of all requested nodes and will only
     * fire DOM events for nodes known to the client.
     */
    private Integer nodeId;
    /**
     * The id of the parent node if any.
     */
    private Integer parentId;
    /**
     * The BackendNodeId for this node.
     */
    private Integer backendNodeId;
    /**
     * <code>Node</code>'s nodeType.
     */
    private Integer nodeType;
    /**
     * <code>Node</code>'s nodeName.
     */
    private String nodeName;
    /**
     * <code>Node</code>'s localName.
     */
    private String localName;
    /**
     * <code>Node</code>'s nodeValue.
     */
    private String nodeValue;
    /**
     * Child count for <code>Container</code> nodes.
     */
    private Integer childNodeCount;
    /**
     * Child nodes of this node when requested with children.
     */
    private List<Node> children = new ArrayList<>();
    /**
     * Attributes of the <code>Element</code>node in the form of flat array<code>[name1, value1, name2, value2]</code>.
     */
    private List<String> attributes = new ArrayList<>();
    /**
     * Document URL that <code>Document</code>or<code>FrameOwner</code> node points to.
     */
    private String documentURL;
    /**
     * Base URL that <code>Document</code>or<code>FrameOwner</code> node uses for URL completion.
     */
    private String baseURL;
    /**
     * <code>DocumentType</code>'s publicId.
     */
    private String publicId;
    /**
     * <code>DocumentType</code>'s systemId.
     */
    private String systemId;
    /**
     * <code>DocumentType</code>'s internalSubset.
     */
    private String internalSubset;
    /**
     * <code>Document</code>'s XML version in case of XML documents.
     */
    private String xmlVersion;
    /**
     * <code>Attr</code>'s name.
     */
    private String name;
    /**
     * <code>Attr</code>'s value.
     */
    private String value;
    /**
     * Pseudo element type for this node.
     */
    private PseudoType pseudoType;
    /**
     * Shadow root type.
     */
    private ShadowRootType shadowRootType;
    /**
     * Frame ID for frame owner elements.
     */
    private String frameId;
    /**
     * Content document for frame owner elements.
     */
    private Node contentDocument;
    /**
     * Shadow root list for given element host.
     */
    private List<Node> shadowRoots = new ArrayList<>();
    /**
     * Content document fragment for template elements.
     */
    private Node templateContent;
    /**
     * Pseudo elements associated with this node.
     */
    private List<Node> pseudoElements = new ArrayList<>();
    /**
     * Import document for the HTMLImport links.
     */
    private Node importedDocument;
    /**
     * Distributed nodes for given insertion point.
     */
    private List<BackendNode> distributedNodes = new ArrayList<>();
    /**
     * Whether the node is SVG.
     */
    private Boolean isSVG;

}
