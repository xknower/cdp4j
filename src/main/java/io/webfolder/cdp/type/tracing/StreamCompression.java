package io.webfolder.cdp.type.tracing;

import com.google.gson.annotations.SerializedName;

/**
 * Compression type to use for traces returned via streams
 */
public enum StreamCompression {
    @SerializedName("none")
    None("none"),

    @SerializedName("gzip")
    Gzip("gzip");

    public final String value;

    StreamCompression(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
