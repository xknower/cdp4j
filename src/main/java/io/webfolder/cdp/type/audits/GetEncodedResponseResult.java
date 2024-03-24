package io.webfolder.cdp.type.audits;

import lombok.Getter;

@Getter
public class GetEncodedResponseResult {

    private String body;

    private Integer originalSize;

    private Integer encodedSize;

}
