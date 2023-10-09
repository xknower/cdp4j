package io.webfolder.cdp.type.browser;

import com.google.gson.annotations.SerializedName;

public enum PermissionType {
    @SerializedName("accessibilityEvents")
    AccessibilityEvents("accessibilityEvents"),

    @SerializedName("audioCapture")
    AudioCapture("audioCapture"),

    @SerializedName("backgroundSync")
    BackgroundSync("backgroundSync"),

    @SerializedName("backgroundFetch")
    BackgroundFetch("backgroundFetch"),

    @SerializedName("clipboardRead")
    ClipboardRead("clipboardRead"),

    @SerializedName("clipboardWrite")
    ClipboardWrite("clipboardWrite"),

    @SerializedName("durableStorage")
    DurableStorage("durableStorage"),

    @SerializedName("flash")
    Flash("flash"),

    @SerializedName("geolocation")
    Geolocation("geolocation"),

    @SerializedName("midi")
    Midi("midi"),

    @SerializedName("midiSysex")
    MidiSysex("midiSysex"),

    @SerializedName("notifications")
    Notifications("notifications"),

    @SerializedName("paymentHandler")
    PaymentHandler("paymentHandler"),

    @SerializedName("protectedMediaIdentifier")
    ProtectedMediaIdentifier("protectedMediaIdentifier"),

    @SerializedName("sensors")
    Sensors("sensors"),

    @SerializedName("videoCapture")
    VideoCapture("videoCapture");

    public final String value;

    PermissionType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
