package io.webfolder.cdp.listener;

/**
 * 结束事件监听器
 */
@FunctionalInterface
public interface TerminateListener {

    void onTerminate(TerminateEvent event);

}
