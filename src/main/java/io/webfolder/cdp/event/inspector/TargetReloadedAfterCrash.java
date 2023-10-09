package io.webfolder.cdp.event.inspector;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired when debugging target has reloaded after crash
 */
@Domain("Inspector")
@EventName("targetReloadedAfterCrash")
public class TargetReloadedAfterCrash {
}
