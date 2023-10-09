package io.webfolder.cdp.type.emulation;

import com.google.gson.annotations.SerializedName;

/**
 * advance: If the scheduler runs out of immediate work, the virtual time base may fast forward to
 * allow the next delayed task (if any) to run; pause: The virtual time base may not advance;
 * pauseIfNetworkFetchesPending: The virtual time base may not advance if there are any pending
 * resource fetches
 */
public enum VirtualTimePolicy {
    @SerializedName("advance")
    Advance("advance"),

    @SerializedName("pause")
    Pause("pause"),

    @SerializedName("pauseIfNetworkFetchesPending")
    PauseIfNetworkFetchesPending("pauseIfNetworkFetchesPending");

    public final String value;

    VirtualTimePolicy(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
