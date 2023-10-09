package io.webfolder.cdp.event.runtime;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.runtime.RemoteObject;

/**
 * Issued when object should be inspected (for example, as a result of inspect() command line API
 * call)
 */
@Domain("Runtime")
@EventName("inspectRequested")
public class InspectRequested {
    private RemoteObject object;

    private Object hints;

    public RemoteObject getObject() {
        return object;
    }

    public void setObject(RemoteObject object) {
        this.object = object;
    }

    public Object getHints() {
        return hints;
    }

    public void setHints(Object hints) {
        this.hints = hints;
    }
}
