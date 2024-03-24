package io.webfolder.cdp.type.network;

import com.google.gson.annotations.SerializedName;

/**
 * Stages of the interception to begin intercepting
 * Request will intercept before the request is
 * sent
 * Response will intercept after the response is received
 */
public enum InterceptionStage {

    @SerializedName("Request")
    Request("Request"),

    @SerializedName("HeadersReceived")
    HeadersReceived("HeadersReceived");

    public final String value;

    InterceptionStage(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
