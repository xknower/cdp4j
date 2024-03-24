package io.webfolder.cdp.type.security;

import com.google.gson.annotations.SerializedName;

/**
 * The security level of a page or resource
 */
public enum SecurityState {

    @SerializedName("unknown")
    Unknown("unknown"),

    @SerializedName("neutral")
    Neutral("neutral"),

    @SerializedName("insecure")
    Insecure("insecure"),

    @SerializedName("secure")
    Secure("secure"),

    @SerializedName("info")
    Info("info");

    public final String value;

    SecurityState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
