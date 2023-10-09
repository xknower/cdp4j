package io.webfolder.cdp.type.network;

public class GetResponseBodyForInterceptionResult {
    private String body;

    private Boolean base64Encoded;

    public String getBody() {
        return body;
    }

    public Boolean getBase64Encoded() {
        return base64Encoded;
    }
}
