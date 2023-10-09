package io.webfolder.cdp.type.network;

import com.google.gson.annotations.SerializedName;

/**
 * The underlying connection technology that the browser is supposedly using
 */
public enum ConnectionType {
    @SerializedName("none")
    None("none"),

    @SerializedName("cellular2g")
    Cellular2g("cellular2g"),

    @SerializedName("cellular3g")
    Cellular3g("cellular3g"),

    @SerializedName("cellular4g")
    Cellular4g("cellular4g"),

    @SerializedName("bluetooth")
    Bluetooth("bluetooth"),

    @SerializedName("ethernet")
    Ethernet("ethernet"),

    @SerializedName("wifi")
    Wifi("wifi"),

    @SerializedName("wimax")
    Wimax("wimax"),

    @SerializedName("other")
    Other("other");

    public final String value;

    ConnectionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
