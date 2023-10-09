package io.webfolder.cdp.type.heapprofiler;

/**
 * A single sample from a sampling profile
 */
public class SamplingHeapProfileSample {
    private Double size;

    private Integer nodeId;

    private Double ordinal;

    /**
     * Allocation size in bytes attributed to the sample.
     */
    public Double getSize() {
        return size;
    }

    /**
     * Allocation size in bytes attributed to the sample.
     */
    public void setSize(Double size) {
        this.size = size;
    }

    /**
     * Id of the corresponding profile tree node.
     */
    public Integer getNodeId() {
        return nodeId;
    }

    /**
     * Id of the corresponding profile tree node.
     */
    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * Time-ordered sample ordinal number. It is unique across all profiles retrieved
     * between startSampling and stopSampling.
     */
    public Double getOrdinal() {
        return ordinal;
    }

    /**
     * Time-ordered sample ordinal number. It is unique across all profiles retrieved
     * between startSampling and stopSampling.
     */
    public void setOrdinal(Double ordinal) {
        this.ordinal = ordinal;
    }
}
