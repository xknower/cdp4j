package io.webfolder.cdp.event.runtime;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.runtime.RemoteObject;
import lombok.Data;

/**
 * Issued when object should be inspected (for example, as a result of inspect() command line API
 * call)
 */
@Domain("Runtime")
@EventName("inspectRequested")
@Data
public class InspectRequested {

    private RemoteObject object;

    private Object hints;

}
