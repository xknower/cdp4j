package io.webfolder.cdp.listener;

public interface AbstractListener<T> {

    void onEvent(T value);
}
