package io.webfolder.cdp.type.network;

import lombok.Getter;

@Getter
public class GetResponseBodyForInterceptionResult {

    private String body;

    private Boolean base64Encoded;

}
