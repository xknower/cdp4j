package io.webfolder.cdp.event.applicationcache;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

@Domain("ApplicationCache")
@EventName("networkStateUpdated")
@Data
public class NetworkStateUpdated {

    private Boolean isNowOnline;

}
