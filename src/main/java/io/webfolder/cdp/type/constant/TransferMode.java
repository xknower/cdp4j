package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum TransferMode {
    @SerializedName("ReportEvents")
    ReportEvents("ReportEvents"),

    @SerializedName("ReturnAsStream")
    ReturnAsStream("ReturnAsStream");

    public final String value;

    TransferMode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
