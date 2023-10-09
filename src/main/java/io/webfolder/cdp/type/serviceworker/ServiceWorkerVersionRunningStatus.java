package io.webfolder.cdp.type.serviceworker;

import com.google.gson.annotations.SerializedName;

public enum ServiceWorkerVersionRunningStatus {
    @SerializedName("stopped")
    Stopped("stopped"),

    @SerializedName("starting")
    Starting("starting"),

    @SerializedName("running")
    Running("running"),

    @SerializedName("stopping")
    Stopping("stopping");

    public final String value;

    ServiceWorkerVersionRunningStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
