package io.webfolder.cdp.type.heapprofiler;

import io.webfolder.cdp.type.runtime.CallFrame;

import java.util.ArrayList;
import java.util.List;

/**
 * Sampling Heap Profile node
 * Holds callsite information, allocation statistics and child nodes
 */
public class SamplingHeapProfileNode {
    private CallFrame callFrame;

    private Double selfSize;

    private Integer id;

    private List<SamplingHeapProfileNode> children = new ArrayList<>();

    /**
     * Function location.
     */
    public CallFrame getCallFrame() {
        return callFrame;
    }

    /**
     * Function location.
     */
    public void setCallFrame(CallFrame callFrame) {
        this.callFrame = callFrame;
    }

    /**
     * Allocations size in bytes for the node excluding children.
     */
    public Double getSelfSize() {
        return selfSize;
    }

    /**
     * Allocations size in bytes for the node excluding children.
     */
    public void setSelfSize(Double selfSize) {
        this.selfSize = selfSize;
    }

    /**
     * Node id. Ids are unique across all profiles collected between startSampling and stopSampling.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Node id. Ids are unique across all profiles collected between startSampling and stopSampling.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Child nodes.
     */
    public List<SamplingHeapProfileNode> getChildren() {
        return children;
    }

    /**
     * Child nodes.
     */
    public void setChildren(List<SamplingHeapProfileNode> children) {
        this.children = children;
    }
}
