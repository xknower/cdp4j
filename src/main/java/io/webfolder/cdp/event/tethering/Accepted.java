package io.webfolder.cdp.event.tethering;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Informs that port was successfully bound and got a specified connection id
 */
@Domain("Tethering")
@EventName("accepted")
public class Accepted {
    private Integer port;

    private String connectionId;

    /**
     * Port number that was successfully bound.
     */
    public Integer getPort() {
        return port;
    }

    /**
     * Port number that was successfully bound.
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * Connection id to be used.
     */
    public String getConnectionId() {
        return connectionId;
    }

    /**
     * Connection id to be used.
     */
    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }
}
