package io.webfolder.cdp.listener;

@FunctionalInterface
public interface TerminateListener {

    void onTerminate(TerminateEvent event);
}
