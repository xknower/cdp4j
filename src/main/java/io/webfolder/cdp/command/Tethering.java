package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;

/**
 * The Tethering domain defines methods and events for browser port binding
 */
@Experimental
@Domain("Tethering")
public interface Tethering {
    /**
     * Request browser port binding.
     *
     * @param port Port number to bind.
     */
    void bind(Integer port);

    /**
     * Request browser port unbinding.
     *
     * @param port Port number to unbind.
     */
    void unbind(Integer port);
}
