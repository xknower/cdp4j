package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum DownloadBehavior {
    @SerializedName("deny")
    Deny("deny"),

    @SerializedName("allow")
    Allow("allow"),

    @SerializedName("default")
    Default("default");

    public final String value;

    DownloadBehavior(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
