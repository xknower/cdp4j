package io.webfolder.cdp.type.applicationcache;

import lombok.Data;

/**
 * Detailed application cache resource information
 */
@Data
public class ApplicationCacheResource {

    /**
     * Resource url.
     */
    private String url;
    /**
     * Resource size.
     */
    private Integer size;
    /**
     * Resource type.
     */
    private String type;

}
