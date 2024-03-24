package io.webfolder.cdp.event.applicationcache;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

@Domain("ApplicationCache")
@EventName("applicationCacheStatusUpdated")
@Data
public class ApplicationCacheStatusUpdated {

    /**
     * Identifier of the frame containing document whose application cache updated status.
     */
    private String frameId;
    /**
     * Manifest URL.
     */
    private String manifestURL;
    /**
     * Updated application cache status.
     */
    private Integer status;

}
