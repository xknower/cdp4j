package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum LogEntrySeverity {

    @SerializedName("verbose")
    Verbose("verbose"),

    @SerializedName("info")
    Info("info"),

    @SerializedName("warning")
    Warning("warning"),

    @SerializedName("error")
    Error("error");

    public final String value;

    LogEntrySeverity(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
