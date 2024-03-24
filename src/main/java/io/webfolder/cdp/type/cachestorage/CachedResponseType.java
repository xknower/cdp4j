package io.webfolder.cdp.type.cachestorage;

import com.google.gson.annotations.SerializedName;

/**
 * type of HTTP response cached
 */
public enum CachedResponseType {

    @SerializedName("basic")
    Basic("basic"),

    @SerializedName("cors")
    Cors("cors"),

    @SerializedName("default")
    Default("default"),

    @SerializedName("error")
    Error("error"),

    @SerializedName("opaqueResponse")
    OpaqueResponse("opaqueResponse"),

    @SerializedName("opaqueRedirect")
    OpaqueRedirect("opaqueRedirect");

    public final String value;

    CachedResponseType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
