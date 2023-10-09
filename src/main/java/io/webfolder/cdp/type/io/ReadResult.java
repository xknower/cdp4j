package io.webfolder.cdp.type.io;

public class ReadResult {
    private Boolean base64Encoded;

    private String data;

    private Boolean eof;

    public Boolean getBase64Encoded() {
        return base64Encoded;
    }

    public String getData() {
        return data;
    }

    public Boolean getEof() {
        return eof;
    }
}
