package io.webfolder.cdp.type.heapprofiler;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Sampling profile
 */
@Data
public class SamplingHeapProfile {

    private SamplingHeapProfileNode head;

    private List<SamplingHeapProfileSample> samples = new ArrayList<>();

}
