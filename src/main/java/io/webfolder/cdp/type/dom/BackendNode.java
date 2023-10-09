package io.webfolder.cdp.type.dom;

/**
 * Backend node with a friendly name
 */
public class BackendNode {
    private Integer nodeType;

    private String nodeName;

    private Integer backendNodeId;

    /**
     * <code>Node</code>'s nodeType.
     */
    public Integer getNodeType() {
        return nodeType;
    }

    /**
     * <code>Node</code>'s nodeType.
     */
    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <code>Node</code>'s nodeName.
     */
    public String getNodeName() {
        return nodeName;
    }

    /**
     * <code>Node</code>'s nodeName.
     */
    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Integer getBackendNodeId() {
        return backendNodeId;
    }

    public void setBackendNodeId(Integer backendNodeId) {
        this.backendNodeId = backendNodeId;
    }
}
