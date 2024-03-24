package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired when data chunk was received over the network
 */
@Domain("Network")
@EventName("dataReceived")
@Data
public class DataReceived {

    /**
     * Request identifier.
     */
    private String requestId;
    /**
     * Timestamp.
     */
    private Double timestamp;
    /**
     * Data chunk length.
     */
    private Integer dataLength;
    /**
     * Actual bytes received (might be less than dataLength for compressed encodings).
     */
    private Integer encodedDataLength;

}
