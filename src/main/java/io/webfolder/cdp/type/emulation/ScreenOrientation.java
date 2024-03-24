package io.webfolder.cdp.type.emulation;

import io.webfolder.cdp.type.constant.PortraitType;
import lombok.Data;

/**
 * Screen orientation
 */
@Data
public class ScreenOrientation {

    /**
     * Orientation type.
     */
    private PortraitType type;
    /**
     * Orientation angle.
     */
    private Integer angle;

}
