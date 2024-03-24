package io.webfolder.cdp.event.page;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import lombok.Data;

@Domain("Page")
@EventName("loadEventFired")
@Data
public class LoadEventFired {

    private Double timestamp;

}
