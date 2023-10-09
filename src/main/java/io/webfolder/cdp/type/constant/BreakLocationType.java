package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum BreakLocationType {
    @SerializedName("debuggerStatement")
    DebuggerStatement("debuggerStatement"),

    @SerializedName("call")
    Call("call"),

    @SerializedName("return")
    Return("return");

    public final String value;

    BreakLocationType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
