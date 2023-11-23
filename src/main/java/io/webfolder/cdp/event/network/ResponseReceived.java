package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.network.ResourceType;
import io.webfolder.cdp.type.network.Response;

/**
 * Fired when HTTP response is available
 */
@Domain("Network")
@EventName("responseReceived")
public class ResponseReceived {

    /**
     * Request identifier.
     */
    private String requestId;

    /**
     * Loader identifier. Empty string if the request is fetched from worker.
     */
    private String loaderId;

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
     * Loader identifier. Empty string if the request is fetched from worker.
     */
    public String getLoaderId() {
        return loaderId;
    }

    /**
     * Loader identifier. Empty string if the request is fetched from worker.
     */
    public void setLoaderId(String loaderId) {
        this.loaderId = loaderId;
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
     * Resource type.
     */
    public ResourceType getType() {
        return type;
    }

    /**
     * Resource type.
     */
    public void setType(ResourceType type) {
        this.type = type;
    }

    /**
     * Response data.
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Response data.
     */
    public void setResponse(Response response) {
        this.response = response;
    }

    /**
     * Frame identifier.
     */
    public String getFrameId() {
        return frameId;
    }

    /**
     * Frame identifier.
     */
    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }
}
