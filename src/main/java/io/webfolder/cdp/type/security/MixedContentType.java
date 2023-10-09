package io.webfolder.cdp.type.security;

import com.google.gson.annotations.SerializedName;

/**
 * A description of mixed content (HTTP resources on HTTPS pages), as defined by
 * https://www.w3.org/TR/mixed-content/#categories
 */
public enum MixedContentType {
    @SerializedName("blockable")
    Blockable("blockable"),

    @SerializedName("optionally-blockable")
    OptionallyBlockable("optionally-blockable"),

    @SerializedName("none")
    None("none");

    public final String value;

    MixedContentType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
