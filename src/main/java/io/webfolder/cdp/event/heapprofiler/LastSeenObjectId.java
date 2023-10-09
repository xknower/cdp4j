package io.webfolder.cdp.event.heapprofiler;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * If heap objects tracking has been started then backend regularly sends a current value for last
 * seen object id and corresponding timestamp
 * If the were changes in the heap since last event
 * then one or more heapStatsUpdate events will be sent before a new lastSeenObjectId event
 */
@Domain("HeapProfiler")
@EventName("lastSeenObjectId")
public class LastSeenObjectId {
    private Integer lastSeenObjectId;

    private Double timestamp;

    public Integer getLastSeenObjectId() {
        return lastSeenObjectId;
    }

    public void setLastSeenObjectId(Integer lastSeenObjectId) {
        this.lastSeenObjectId = lastSeenObjectId;
    }

    public Double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }
}
