package io.webfolder.cdp.type.cachestorage;

import lombok.Data;

/**
 * Cached response
 */
@Data
public class CachedResponse {

    /**
     * Entry content, base64-encoded.
     */
    private String body;

}
