package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired when HTTP request has finished loading
 */
@Domain("Network")
@EventName("loadingFinished")
public class LoadingFinished {

    /**
     * Request identifier.
     */
    private String requestId;

    private Double timestamp;

    private Double encodedDataLength;

    private Boolean shouldReportCorbBlocking;

    /**
     * Request identifier.
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Request identifier.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Timestamp.
     */
    public Double getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp.
     */
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Total number of bytes received for this request.
     */
    public Double getEncodedDataLength() {
        return encodedDataLength;
    }

    /**
     * Total number of bytes received for this request.
     */
    public void setEncodedDataLength(Double encodedDataLength) {
        this.encodedDataLength = encodedDataLength;
    }

    /**
     * Set when 1) response was blocked by Cross-Origin Read Blocking and also
     * 2) this needs to be reported to the DevTools console.
     */
    public Boolean isShouldReportCorbBlocking() {
        return shouldReportCorbBlocking;
    }

    /**
     * Set when 1) response was blocked by Cross-Origin Read Blocking and also
     * 2) this needs to be reported to the DevTools console.
     */
    public void setShouldReportCorbBlocking(Boolean shouldReportCorbBlocking) {
        this.shouldReportCorbBlocking = shouldReportCorbBlocking;
    }
}
