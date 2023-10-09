package io.webfolder.cdp.type.accessibility;

public class AXRelatedNode {
    private Integer backendDOMNodeId;

    private String idref;

    private String text;

    /**
     * The BackendNodeId of the related DOM node.
     */
    public Integer getBackendDOMNodeId() {
        return backendDOMNodeId;
    }

    /**
     * The BackendNodeId of the related DOM node.
     */
    public void setBackendDOMNodeId(Integer backendDOMNodeId) {
        this.backendDOMNodeId = backendDOMNodeId;
    }

    /**
     * The IDRef value provided, if any.
     */
    public String getIdref() {
        return idref;
    }

    /**
     * The IDRef value provided, if any.
     */
    public void setIdref(String idref) {
        this.idref = idref;
    }

    /**
     * The text alternative of this node in the current context.
     */
    public String getText() {
        return text;
    }

    /**
     * The text alternative of this node in the current context.
     */
    public void setText(String text) {
        this.text = text;
    }
}
