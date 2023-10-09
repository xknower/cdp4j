package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum ViolationType {
    @SerializedName("longTask")
    LongTask("longTask"),

    @SerializedName("longLayout")
    LongLayout("longLayout"),

    @SerializedName("blockedEvent")
    BlockedEvent("blockedEvent"),

    @SerializedName("blockedParser")
    BlockedParser("blockedParser"),

    @SerializedName("discouragedAPIUse")
    DiscouragedAPIUse("discouragedAPIUse"),

    @SerializedName("handler")
    Handler("handler"),

    @SerializedName("recurringHandler")
    RecurringHandler("recurringHandler");

    public final String value;

    ViolationType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
