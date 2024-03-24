package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum ConsoleApiCallType {

    @SerializedName("log")
    Log("log"),

    @SerializedName("debug")
    Debug("debug"),

    @SerializedName("info")
    Info("info"),

    @SerializedName("error")
    Error("error"),

    @SerializedName("warning")
    Warning("warning"),

    @SerializedName("dir")
    Dir("dir"),

    @SerializedName("dirxml")
    Dirxml("dirxml"),

    @SerializedName("table")
    Table("table"),

    @SerializedName("trace")
    Trace("trace"),

    @SerializedName("clear")
    Clear("clear"),

    @SerializedName("startGroup")
    StartGroup("startGroup"),

    @SerializedName("startGroupCollapsed")
    StartGroupCollapsed("startGroupCollapsed"),

    @SerializedName("endGroup")
    EndGroup("endGroup"),

    @SerializedName("assert")
    Assert("assert"),

    @SerializedName("profile")
    Profile("profile"),

    @SerializedName("profileEnd")
    ProfileEnd("profileEnd"),

    @SerializedName("count")
    Count("count"),

    @SerializedName("timeEnd")
    TimeEnd("timeEnd");

    public final String value;

    ConsoleApiCallType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
