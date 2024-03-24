package io.webfolder.cdp.event.heapprofiler;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

@Domain("HeapProfiler")
@EventName("addHeapSnapshotChunk")
@Data
public class AddHeapSnapshotChunk {

    private String chunk;

}
