package io.webfolder.cdp.event.network;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Fired if request ended up loading from cache
 */
@Domain("Network")
@EventName("requestServedFromCache")
@Data
public class RequestServedFromCache {

    /**
     * Request identifier.
     */
    private String requestId;

}
