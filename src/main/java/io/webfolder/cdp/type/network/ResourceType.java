package io.webfolder.cdp.type.network;

import com.google.gson.annotations.SerializedName;

/**
 * Resource type as it was perceived by the rendering engine
 */
public enum ResourceType {
    @SerializedName("Document")
    Document("Document"),

    @SerializedName("Stylesheet")
    Stylesheet("Stylesheet"),

    @SerializedName("Image")
    Image("Image"),

    @SerializedName("Media")
    Media("Media"),

    @SerializedName("Font")
    Font("Font"),

    @SerializedName("Script")
    Script("Script"),

    @SerializedName("TextTrack")
    TextTrack("TextTrack"),

    @SerializedName("XHR")
    XHR("XHR"),

    @SerializedName("Fetch")
    Fetch("Fetch"),

    @SerializedName("EventSource")
    EventSource("EventSource"),

    @SerializedName("WebSocket")
    WebSocket("WebSocket"),

    @SerializedName("Manifest")
    Manifest("Manifest"),

    @SerializedName("SignedExchange")
    SignedExchange("SignedExchange"),

    @SerializedName("Ping")
    Ping("Ping"),

    @SerializedName("CSPViolationReport")
    CSPViolationReport("CSPViolationReport"),

    @SerializedName("Other")
    Other("Other");

    public final String value;

    ResourceType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    public boolean isFile() {
        return this == Document || this == Stylesheet || this == Image || this == Font || this == Script;
    }

    public boolean isHTTPRequest() {
        return this == XHR || this == Fetch;
    }

}
