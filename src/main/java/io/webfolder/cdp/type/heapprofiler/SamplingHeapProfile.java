package io.webfolder.cdp.type.heapprofiler;

import java.util.ArrayList;
import java.util.List;

/**
 * Sampling profile
 */
public class SamplingHeapProfile {
    private SamplingHeapProfileNode head;

    private List<SamplingHeapProfileSample> samples = new ArrayList<>();

    public SamplingHeapProfileNode getHead() {
        return head;
    }

    public void setHead(SamplingHeapProfileNode head) {
        this.head = head;
    }

    public List<SamplingHeapProfileSample> getSamples() {
        return samples;
    }

    public void setSamples(List<SamplingHeapProfileSample> samples) {
        this.samples = samples;
    }
}
