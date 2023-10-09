package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum FrameNavigationReason {
    @SerializedName("formSubmissionGet")
    FormSubmissionGet("formSubmissionGet"),

    @SerializedName("formSubmissionPost")
    FormSubmissionPost("formSubmissionPost"),

    @SerializedName("httpHeaderRefresh")
    HttpHeaderRefresh("httpHeaderRefresh"),

    @SerializedName("scriptInitiated")
    ScriptInitiated("scriptInitiated"),

    @SerializedName("metaTagRefresh")
    MetaTagRefresh("metaTagRefresh"),

    @SerializedName("pageBlockInterstitial")
    PageBlockInterstitial("pageBlockInterstitial"),

    @SerializedName("reload")
    Reload("reload");

    public final String value;

    FrameNavigationReason(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
