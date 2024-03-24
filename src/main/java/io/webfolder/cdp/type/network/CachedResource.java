package io.webfolder.cdp.type.network;

import lombok.Data;

/**
 * Information about the cached resource
 */
@Data
public class CachedResource {

    /**
     * Resource URL. This is the url of the original network request.
     */
    private String url;
    /**
     * Type of this resource.
     */
    private ResourceType type;
    /**
     * Cached response data.
     */
    private Response response;
    /**
     * Cached response body size.
     */
    private Double bodySize;

}
