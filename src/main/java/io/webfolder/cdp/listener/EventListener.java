package io.webfolder.cdp.listener;

import io.webfolder.cdp.event.Events;

@FunctionalInterface
public interface EventListener {

    void onEvent(Events event, Object value);
}
