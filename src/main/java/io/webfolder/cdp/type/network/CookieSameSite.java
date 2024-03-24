package io.webfolder.cdp.type.network;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the cookie's 'SameSite' status:
 * https://tools
 * ietf
 * org/html/draft-west-first-party-cookies
 */
public enum CookieSameSite {

    @SerializedName("Strict")
    Strict("Strict"),

    @SerializedName("Lax")
    Lax("Lax");

    public final String value;

    CookieSameSite(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
