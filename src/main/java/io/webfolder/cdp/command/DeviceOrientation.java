package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;

@Experimental
@Domain("DeviceOrientation")
public interface DeviceOrientation {
    /**
     * Clears the overridden Device Orientation.
     */
    void clearDeviceOrientationOverride();

    /**
     * Overrides the Device Orientation.
     *
     * @param alpha Mock alpha
     * @param beta  Mock beta
     * @param gamma Mock gamma
     */
    void setDeviceOrientationOverride(Double alpha, Double beta, Double gamma);
}
