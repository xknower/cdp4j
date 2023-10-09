package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Optional;
import io.webfolder.cdp.annotation.Returns;
import io.webfolder.cdp.type.constant.TransferMode;
import io.webfolder.cdp.type.tracing.RequestMemoryDumpResult;
import io.webfolder.cdp.type.tracing.StreamCompression;
import io.webfolder.cdp.type.tracing.TraceConfig;

import java.util.List;

@Experimental
@Domain("Tracing")
public interface Tracing {
    /**
     * Stop trace events collection.
     */
    void end();

    /**
     * Gets supported tracing categories.
     *
     * @return A list of supported tracing categories.
     */
    @Returns("categories")
    List<String> getCategories();

    /**
     * Record a clock sync marker in the trace.
     *
     * @param syncId The ID of this clock sync marker
     */
    void recordClockSyncMarker(String syncId);

    /**
     * Request a global memory dump.
     *
     * @return RequestMemoryDumpResult
     */
    RequestMemoryDumpResult requestMemoryDump();

    /**
     * Start trace events collection.
     *
     * @param categories                   Category/tag filter
     * @param options                      Tracing options
     * @param bufferUsageReportingInterval If set, the agent will issue bufferUsage events at this interval, specified in milliseconds
     * @param transferMode                 Whether to report trace events as series of dataCollected events or to save trace to a
     *                                     stream (defaults to <code>ReportEvents</code>).
     * @param streamCompression            Compression format to use. This only applies when using <code>ReturnAsStream</code>
     *                                     transfer mode (defaults to <code>none</code>)
     */
    void start(@Optional String categories, @Optional String options,
               @Optional Double bufferUsageReportingInterval, @Optional TransferMode transferMode,
               @Optional StreamCompression streamCompression, @Optional TraceConfig traceConfig);

    /**
     * Start trace events collection.
     */
    void start();
}
