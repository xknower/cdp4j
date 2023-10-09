package io.webfolder.cdp.type.serviceworker;

import com.google.gson.annotations.SerializedName;

public enum ServiceWorkerVersionStatus {
    @SerializedName("new")
    New("new"),

    @SerializedName("installing")
    Installing("installing"),

    @SerializedName("installed")
    Installed("installed"),

    @SerializedName("activating")
    Activating("activating"),

    @SerializedName("activated")
    Activated("activated"),

    @SerializedName("redundant")
    Redundant("redundant");

    public final String value;

    ServiceWorkerVersionStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
