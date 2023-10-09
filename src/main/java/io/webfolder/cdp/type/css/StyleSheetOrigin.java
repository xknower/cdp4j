package io.webfolder.cdp.type.css;

import com.google.gson.annotations.SerializedName;

/**
 * Stylesheet type: "injected" for stylesheets injected via extension, "user-agent" for user-agent
 * stylesheets, "inspector" for stylesheets created by the inspector (i
 * e
 * those holding the "via
 * inspector" rules), "regular" for regular stylesheets
 */
public enum StyleSheetOrigin {
    @SerializedName("injected")
    Injected("injected"),

    @SerializedName("user-agent")
    UserAgent("user-agent"),

    @SerializedName("inspector")
    Inspector("inspector"),

    @SerializedName("regular")
    Regular("regular");

    public final String value;

    StyleSheetOrigin(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
