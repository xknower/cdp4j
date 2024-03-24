package io.webfolder.cdp.type.fetch;

import com.google.gson.annotations.SerializedName;

/**
 * Stages of the request to handle
 * Request will intercept before the request is
 * sent
 * Response will intercept after the response is received (but before response
 * body is received
 */
public enum RequestStage {

    @SerializedName("Request")
    Request("Request"),

    @SerializedName("Response")
    Response("Response");

    public final String value;

    RequestStage(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
