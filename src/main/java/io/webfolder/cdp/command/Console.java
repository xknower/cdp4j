package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;

/**
 * This domain is deprecated - use Runtime or Log instead
 */
@Deprecated
@Domain("Console")
public interface Console {
    /**
     * Does nothing.
     */
    void clearMessages();

    /**
     * Disables console domain, prevents further console messages from being reported to the client.
     */
    void disable();

    /**
     * Enables console domain, sends the messages collected so far to the client by means of the
     * <code>messageAdded</code> notification.
     */
    void enable();
}
