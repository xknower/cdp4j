package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.network.ResourceType;
import io.webfolder.cdp.type.network.Response;
import lombok.Data;

/**
 * Fired when HTTP response is available
 */
@Domain("Network")
@EventName("responseReceived")
@Data
public class ResponseReceived {

    /**
     * Request identifier.
     */
    private String requestId;

    /**
     * Loader identifier. Empty string if the request is fetched from worker.
     */
    private String loaderId;
    /**
     * Timestamp.
     */
    private Double timestamp;

    /**
     * Resource type as it was perceived by the rendering engine
     */
    private ResourceType type;

    /**
     * HTTP response data
     */
    private Response response;

    /**
     * Frame identifier.
     */
    private String frameId;

}
