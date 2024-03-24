package io.webfolder.cdp.listener;

import io.webfolder.cdp.event.Events;

/**
 * 事件监听器
 */
@FunctionalInterface
public interface EventListener {

    void onEvent(Events event, Object value);

}
