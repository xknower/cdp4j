package io.webfolder.cdp.type.audits;

public class GetEncodedResponseResult {
    private String body;

    private Integer originalSize;

    private Integer encodedSize;

    public String getBody() {
        return body;
    }

    public Integer getOriginalSize() {
        return originalSize;
    }

    public Integer getEncodedSize() {
        return encodedSize;
    }
}
