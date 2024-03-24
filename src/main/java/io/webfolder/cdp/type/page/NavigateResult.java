package io.webfolder.cdp.type.page;

import lombok.Getter;

@Getter
public class NavigateResult {

    private String frameId;

    private String loaderId;

    private String errorText;

}
