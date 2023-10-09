package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;

@Experimental
@Domain("Inspector")
public interface Inspector {
    /**
     * Disables inspector domain notifications.
     */
    void disable();

    /**
     * Enables inspector domain notifications.
     */
    void enable();
}
