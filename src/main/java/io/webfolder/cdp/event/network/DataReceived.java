package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired when data chunk was received over the network
 */
@Domain("Network")
@EventName("dataReceived")
public class DataReceived {

    /**
     * Request identifier.
     */
    private String requestId;

    private Double timestamp;

    private Integer dataLength;

    private Integer encodedDataLength;

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
     * Data chunk length.
     */
    public Integer getDataLength() {
        return dataLength;
    }

    /**
     * Data chunk length.
     */
    public void setDataLength(Integer dataLength) {
        this.dataLength = dataLength;
    }

    /**
     * Actual bytes received (might be less than dataLength for compressed encodings).
     */
    public Integer getEncodedDataLength() {
        return encodedDataLength;
    }

    /**
     * Actual bytes received (might be less than dataLength for compressed encodings).
     */
    public void setEncodedDataLength(Integer encodedDataLength) {
        this.encodedDataLength = encodedDataLength;
    }
}
