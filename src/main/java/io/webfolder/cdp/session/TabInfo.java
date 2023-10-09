package io.webfolder.cdp.session;

class TabInfo {

    private String targetId;

    private String browserContextId;

    TabInfo(String targetId, String browserContextId) {
        this.targetId = targetId;
        this.browserContextId = browserContextId;
    }

    public String getTargetId() {
        return targetId;
    }

    public String getBrowserContextId() {
        return browserContextId;
    }
}
