package io.webfolder.cdp.type.page;

import lombok.Getter;

@Getter
public class GetResourceContentResult {

    private String content;

    private Boolean base64Encoded;

}
