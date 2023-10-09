package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum TraceRecordMode {
    @SerializedName("recordUntilFull")
    RecordUntilFull("recordUntilFull"),

    @SerializedName("recordContinuously")
    RecordContinuously("recordContinuously"),

    @SerializedName("recordAsMuchAsPossible")
    RecordAsMuchAsPossible("recordAsMuchAsPossible"),

    @SerializedName("echoToConsole")
    EchoToConsole("echoToConsole");

    public final String value;

    TraceRecordMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
