package io.webfolder.cdp.type.heapprofiler;

import lombok.Data;

/**
 * A single sample from a sampling profile
 */
@Data
public class SamplingHeapProfileSample {

    /**
     * Allocation size in bytes attributed to the sample.
     */
    private Double size;
    /**
     * Id of the corresponding profile tree node.
     */
    private Integer nodeId;
    /**
     * Time-ordered sample ordinal number. It is unique across all profiles retrieved
     * between startSampling and stopSampling.
     */
    private Double ordinal;

}
