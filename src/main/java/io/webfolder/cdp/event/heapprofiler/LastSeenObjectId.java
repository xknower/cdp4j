package io.webfolder.cdp.event.heapprofiler;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * If heap objects tracking has been started then backend regularly sends a current value for last
 * seen object id and corresponding timestamp
 * If the were changes in the heap since last event
 * then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event
 */
@Domain("HeapProfiler")
@EventName("lastSeenObjectId")
@Data
public class LastSeenObjectId {

    private Integer lastSeenObjectId;

    private Double timestamp;

}
