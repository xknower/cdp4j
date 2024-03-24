package io.webfolder.cdp.event.tracing;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

@Domain("Tracing")
@EventName("bufferUsage")
@Data
public class BufferUsage {

    /**
     * A number in range [0..1] that indicates the used size of event buffer as a fraction of its
     * total size.
     */
    private Double percentFull;
    /**
     * An approximate number of events in the trace log.
     */
    private Double eventCount;
    /**
     * A number in range [0..1] that indicates the used size of event buffer as a fraction of its
     * total size.
     */
    private Double value;

}
