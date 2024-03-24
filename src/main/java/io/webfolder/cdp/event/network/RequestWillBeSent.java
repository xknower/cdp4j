package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.network.Initiator;
import io.webfolder.cdp.type.network.Request;
import io.webfolder.cdp.type.network.ResourceType;
import io.webfolder.cdp.type.network.Response;
import lombok.Data;

/**
 * Fired when page is about to send HTTP request
 */
@Domain("Network")
@EventName("requestWillBeSent")
@Data
public class RequestWillBeSent {

    /**
     * Request identifier.
     */
    private String requestId;
    /**
     * Loader identifier. Empty string if the request is fetched from worker.
     */
    private String loaderId;
    /**
     * URL of the document this request is loaded for.
     */
    private String documentURL;
    /**
     * Request data.
     */
    private Request request;
    /**
     * Timestamp.
     */
    private Double timestamp;
    /**
     * Timestamp.
     */
    private Double wallTime;
    /**
     * Request initiator.
     */
    private Initiator initiator;
    /**
     * Redirect response data.
     */
    private Response redirectResponse;
    /**
     * Type of this resource.
     */
    private ResourceType type;
    /**
     * Frame identifier.
     */
    private String frameId;
    /**
     * Whether the request is initiated by a user gesture. Defaults to false.
     */
    private Boolean hasUserGesture;

}
