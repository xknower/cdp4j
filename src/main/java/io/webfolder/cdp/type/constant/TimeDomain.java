package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum TimeDomain {

    @SerializedName("timeTicks")
    TimeTicks("timeTicks"),

    @SerializedName("threadTicks")
    ThreadTicks("threadTicks");

    public final String value;

    TimeDomain(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
