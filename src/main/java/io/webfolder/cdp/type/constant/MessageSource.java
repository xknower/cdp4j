package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum MessageSource {

    @SerializedName("xml")
    Xml("xml"),

    @SerializedName("javascript")
    Javascript("javascript"),

    @SerializedName("network")
    Network("network"),

    @SerializedName("console-api")
    ConsoleApi("console-api"),

    @SerializedName("storage")
    Storage("storage"),

    @SerializedName("appcache")
    Appcache("appcache"),

    @SerializedName("rendering")
    Rendering("rendering"),

    @SerializedName("security")
    Security("security"),

    @SerializedName("other")
    Other("other"),

    @SerializedName("deprecation")
    Deprecation("deprecation"),

    @SerializedName("worker")
    Worker("worker");

    public final String value;

    MessageSource(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
