package io.webfolder.cdp.type.constant;

import com.google.gson.annotations.SerializedName;

public enum AnimationType {

    @SerializedName("CSSTransition")
    CSSTransition("CSSTransition"),

    @SerializedName("CSSAnimation")
    CSSAnimation("CSSAnimation"),

    @SerializedName("WebAnimation")
    WebAnimation("WebAnimation");

    public final String value;

    AnimationType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

}
