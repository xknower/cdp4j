package io.webfolder.cdp.type.io;

import lombok.Getter;

@Getter
public class ReadResult {

    private Boolean base64Encoded;

    private String data;

    private Boolean eof;

}
