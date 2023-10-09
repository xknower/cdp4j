package io.webfolder.cdp.event.debugger;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired when the virtual machine resumed execution
 */
@Domain("Debugger")
@EventName("resumed")
public class Resumed {
}
