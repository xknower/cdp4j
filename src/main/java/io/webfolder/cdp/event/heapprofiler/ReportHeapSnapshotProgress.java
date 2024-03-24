package io.webfolder.cdp.event.heapprofiler;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

@Domain("HeapProfiler")
@EventName("reportHeapSnapshotProgress")
@Data
public class ReportHeapSnapshotProgress {

    private Integer done;

    private Integer total;

    private Boolean finished;

}
