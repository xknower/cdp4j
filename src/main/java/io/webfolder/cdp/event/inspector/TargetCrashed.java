package io.webfolder.cdp.event.inspector;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired when debugging target has crashed
 */
@Domain("Inspector")
@EventName("targetCrashed")
public class TargetCrashed {
}
