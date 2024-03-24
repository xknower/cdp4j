package io.webfolder.cdp.session;

import lombok.Getter;
import lombok.Setter;

@Getter
public class SessionSettings {

    private static final Integer DEFAULT_SCREEN_WIDTH = 1366; // WXGA width

    private static final Integer DEFAULT_SCREEN_HEIGHT = 768; // WXGA height

    private final int screenWidth;

    @Setter
    private int screenHeight;

    public SessionSettings() {
        this(DEFAULT_SCREEN_WIDTH, DEFAULT_SCREEN_HEIGHT);
    }

    public SessionSettings(int screenWidth, int screenHeight) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    @Override
    public String toString() {
        return "SessionSettings [screenWidth=" + screenWidth + ", screenHeight=" + screenHeight + "]";
    }

}
