package io.webfolder.cdp.type.browser;

public class GetVersionResult {
    private String protocolVersion;

    private String product;

    private String revision;

    private String userAgent;

    private String jsVersion;

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public String getProduct() {
        return product;
    }

    public String getRevision() {
        return revision;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public String getJsVersion() {
        return jsVersion;
    }
}
