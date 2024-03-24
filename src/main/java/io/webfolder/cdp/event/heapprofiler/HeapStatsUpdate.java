package io.webfolder.cdp.event.heapprofiler;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

import java.util.List;

/**
 * If heap objects tracking has been started then backend may send update for one or more fragments
 */
@Domain("HeapProfiler")
@EventName("heapStatsUpdate")
@Data
public class HeapStatsUpdate {

    /**
     * An array of triplets. Each triplet describes a fragment. The first integer is the fragment
     * index, the second integer is a total count of objects for the fragment, the third integer is
     * a total size of the objects for the fragment.
     */
    private List<Integer> statsUpdate;

}
