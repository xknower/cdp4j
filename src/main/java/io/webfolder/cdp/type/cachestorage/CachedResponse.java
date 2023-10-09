package io.webfolder.cdp.type.cachestorage;

/**
 * Cached response
 */
public class CachedResponse {
    private String body;

    /**
     * Entry content, base64-encoded.
     */
    public String getBody() {
        return body;
    }

    /**
     * Entry content, base64-encoded.
     */
    public void setBody(String body) {
        this.body = body;
    }
}
