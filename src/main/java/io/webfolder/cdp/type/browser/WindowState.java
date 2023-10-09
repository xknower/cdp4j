package io.webfolder.cdp.type.browser;

import com.google.gson.annotations.SerializedName;

/**
 * The state of the browser window
 */
public enum WindowState {
    @SerializedName("normal")
    Normal("normal"),

    @SerializedName("minimized")
    Minimized("minimized"),

    @SerializedName("maximized")
    Maximized("maximized"),

    @SerializedName("fullscreen")
    Fullscreen("fullscreen");

    public final String value;

    WindowState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
