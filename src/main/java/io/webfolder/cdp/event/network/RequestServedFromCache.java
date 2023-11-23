package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired if request ended up loading from cache
 */
@Domain("Network")
@EventName("requestServedFromCache")
public class RequestServedFromCache {

    /**
     * Request identifier.
     */
    private String requestId;

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
}
