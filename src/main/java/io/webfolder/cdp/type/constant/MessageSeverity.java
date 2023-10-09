package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum MessageSeverity {
    @SerializedName("log")
    Log("log"),

    @SerializedName("warning")
    Warning("warning"),

    @SerializedName("error")
    Error("error"),

    @SerializedName("debug")
    Debug("debug"),

    @SerializedName("info")
    Info("info");

    public final String value;

    MessageSeverity(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
