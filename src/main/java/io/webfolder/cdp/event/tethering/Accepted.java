package io.webfolder.cdp.event.tethering;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

/**
 * Informs that port was successfully bound and got a specified connection id
 */
@Domain("Tethering")
@EventName("accepted")
@Data
public class Accepted {

    /**
     * Port number that was successfully bound.
     */
    private Integer port;
    /**
     * Connection id to be used.
     */
    private String connectionId;

}
