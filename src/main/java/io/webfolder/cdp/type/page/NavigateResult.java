package io.webfolder.cdp.type.page;

public class NavigateResult {
    private String frameId;

    private String loaderId;

    private String errorText;

    public String getFrameId() {
        return frameId;
    }

    public String getLoaderId() {
        return loaderId;
    }

    public String getErrorText() {
        return errorText;
    }
}
