package io.webfolder.cdp.session;

import lombok.Getter;

/**
 * 标签页
 */
class TabInfo {

    /**
     * 目标ID
     */
    @Getter
    private final String targetId;

    /**
     * 浏览器上下文ID
     */
    @Getter
    private final String browserContextId;

    TabInfo(String targetId, String browserContextId) {
        this.targetId = targetId;
        this.browserContextId = browserContextId;
    }

}
