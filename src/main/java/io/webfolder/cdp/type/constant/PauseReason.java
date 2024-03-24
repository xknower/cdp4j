package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum PauseReason {

    @SerializedName("XHR")
    XHR("XHR"),

    @SerializedName("DOM")
    DOM("DOM"),

    @SerializedName("EventListener")
    EventListener("EventListener"),

    @SerializedName("exception")
    Exception("exception"),

    @SerializedName("assert")
    Assert("assert"),

    @SerializedName("debugCommand")
    DebugCommand("debugCommand"),

    @SerializedName("promiseRejection")
    PromiseRejection("promiseRejection"),

    @SerializedName("OOM")
    OOM("OOM"),

    @SerializedName("other")
    Other("other"),

    @SerializedName("ambiguous")
    Ambiguous("ambiguous");

    public final String value;

    PauseReason(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
