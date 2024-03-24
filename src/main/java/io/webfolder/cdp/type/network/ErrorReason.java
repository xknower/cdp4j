package io.webfolder.cdp.type.network;

import com.google.gson.annotations.SerializedName;

/**
 * Network level fetch failure reason
 */
public enum ErrorReason {

    @SerializedName("Failed")
    Failed("Failed"),

    @SerializedName("Aborted")
    Aborted("Aborted"),

    @SerializedName("TimedOut")
    TimedOut("TimedOut"),

    @SerializedName("AccessDenied")
    AccessDenied("AccessDenied"),

    @SerializedName("ConnectionClosed")
    ConnectionClosed("ConnectionClosed"),

    @SerializedName("ConnectionReset")
    ConnectionReset("ConnectionReset"),

    @SerializedName("ConnectionRefused")
    ConnectionRefused("ConnectionRefused"),

    @SerializedName("ConnectionAborted")
    ConnectionAborted("ConnectionAborted"),

    @SerializedName("ConnectionFailed")
    ConnectionFailed("ConnectionFailed"),

    @SerializedName("NameNotResolved")
    NameNotResolved("NameNotResolved"),

    @SerializedName("InternetDisconnected")
    InternetDisconnected("InternetDisconnected"),

    @SerializedName("AddressUnreachable")
    AddressUnreachable("AddressUnreachable"),

    @SerializedName("BlockedByClient")
    BlockedByClient("BlockedByClient"),

    @SerializedName("BlockedByResponse")
    BlockedByResponse("BlockedByResponse");

    public final String value;

    ErrorReason(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
