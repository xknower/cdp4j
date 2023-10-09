package io.webfolder.cdp.event.tracing;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.tracing.StreamCompression;

/**
 * Signals that tracing is stopped and there is no trace buffers pending flush, all data were
 * delivered via dataCollected events
 */
@Domain("Tracing")
@EventName("tracingComplete")
public class TracingComplete {
    private String stream;

    private StreamCompression streamCompression;

    /**
     * A handle of the stream that holds resulting trace data.
     */
    public String getStream() {
        return stream;
    }

    /**
     * A handle of the stream that holds resulting trace data.
     */
    public void setStream(String stream) {
        this.stream = stream;
    }

    /**
     * Compression format of returned stream.
     */
    public StreamCompression getStreamCompression() {
        return streamCompression;
    }

    /**
     * Compression format of returned stream.
     */
    public void setStreamCompression(StreamCompression streamCompression) {
        this.streamCompression = streamCompression;
    }
}
