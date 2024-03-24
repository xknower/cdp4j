package io.webfolder.cdp.type.browser;

import lombok.Getter;

@Getter
public class GetVersionResult {

    private String protocolVersion;

    private String product;

    private String revision;

    private String userAgent;

    private String jsVersion;

}
