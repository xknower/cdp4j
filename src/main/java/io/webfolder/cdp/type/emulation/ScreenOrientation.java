package io.webfolder.cdp.type.emulation;

import io.webfolder.cdp.type.constant.PortraitType;

/**
 * Screen orientation
 */
public class ScreenOrientation {
    private PortraitType type;

    private Integer angle;

    /**
     * Orientation type.
     */
    public PortraitType getType() {
        return type;
    }

    /**
     * Orientation type.
     */
    public void setType(PortraitType type) {
        this.type = type;
    }

    /**
     * Orientation angle.
     */
    public Integer getAngle() {
        return angle;
    }

    /**
     * Orientation angle.
     */
    public void setAngle(Integer angle) {
        this.angle = angle;
    }
}
