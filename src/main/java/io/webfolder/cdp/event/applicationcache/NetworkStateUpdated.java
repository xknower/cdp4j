package io.webfolder.cdp.event.applicationcache;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

@Domain("ApplicationCache")
@EventName("networkStateUpdated")
public class NetworkStateUpdated {
    private Boolean isNowOnline;

    public Boolean isIsNowOnline() {
        return isNowOnline;
    }

    public void setIsNowOnline(Boolean isNowOnline) {
        this.isNowOnline = isNowOnline;
    }
}
