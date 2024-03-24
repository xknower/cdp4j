package io.webfolder.cdp.event.tracing;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.tracing.StreamCompression;
import lombok.Data;

/**
 * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
 * delivered via dataCollected events
 */
@Domain("Tracing")
@EventName("tracingComplete")
@Data
public class TracingComplete {

    /**
     * A handle of the stream that holds resulting trace data.
     */
    private String stream;
    /**
     * Compression format of returned stream.
     */
    private StreamCompression streamCompression;

}
