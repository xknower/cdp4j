package io.webfolder.cdp.session;

/**
 * 标签页
 */
class TabInfo {

    /**
     * 目标ID
     */
    private final String targetId;

    /**
     * 浏览器上下文ID
     */
    private final String browserContextId;

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
