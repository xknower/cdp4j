package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired when HTTP request has finished loading
 */
@Domain("Network")
@EventName("loadingFinished")
@Data
public class LoadingFinished {

    /**
     * Request identifier.
     */
    private String requestId;
    /**
     * Timestamp.
     */
    private Double timestamp;
    /**
     * Total number of bytes received for this request.
     */
    private Double encodedDataLength;
    /**
     * Set when 1) response was blocked by Cross-Origin Read Blocking and also
     * 2) this needs to be reported to the DevTools console.
     */
    private Boolean shouldReportCorbBlocking;

}
