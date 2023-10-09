package io.webfolder.cdp.type.accessibility;

import java.util.ArrayList;
import java.util.List;

/**
 * A single computed AX property
 */
public class AXValue {
    private AXValueType type;

    private Object value;

    private List<AXRelatedNode> relatedNodes = new ArrayList<>();

    private List<AXValueSource> sources = new ArrayList<>();

    /**
     * The type of this value.
     */
    public AXValueType getType() {
        return type;
    }

    /**
     * The type of this value.
     */
    public void setType(AXValueType type) {
        this.type = type;
    }

    /**
     * The computed value of this property.
     */
    public Object getValue() {
        return value;
    }

    /**
     * The computed value of this property.
     */
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * One or more related nodes, if applicable.
     */
    public List<AXRelatedNode> getRelatedNodes() {
        return relatedNodes;
    }

    /**
     * One or more related nodes, if applicable.
     */
    public void setRelatedNodes(List<AXRelatedNode> relatedNodes) {
        this.relatedNodes = relatedNodes;
    }

    /**
     * The sources which contributed to the computation of this property.
     */
    public List<AXValueSource> getSources() {
        return sources;
    }

    /**
     * The sources which contributed to the computation of this property.
     */
    public void setSources(List<AXValueSource> sources) {
        this.sources = sources;
    }
}
