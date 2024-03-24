package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum LogEntrySource {

    @SerializedName("xml")
    Xml("xml"),

    @SerializedName("javascript")
    Javascript("javascript"),

    @SerializedName("network")
    Network("network"),

    @SerializedName("storage")
    Storage("storage"),

    @SerializedName("appcache")
    Appcache("appcache"),

    @SerializedName("rendering")
    Rendering("rendering"),

    @SerializedName("security")
    Security("security"),

    @SerializedName("deprecation")
    Deprecation("deprecation"),

    @SerializedName("worker")
    Worker("worker"),

    @SerializedName("violation")
    Violation("violation"),

    @SerializedName("intervention")
    Intervention("intervention"),

    @SerializedName("recommendation")
    Recommendation("recommendation"),

    @SerializedName("other")
    Other("other");

    public final String value;

    LogEntrySource(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
