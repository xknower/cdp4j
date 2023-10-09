package io.webfolder.cdp.event.emulation;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;

/**
 * Notification sent after the virtual time budget for the current VirtualTimePolicy has run out
 */
@Experimental
@Domain("Emulation")
@EventName("virtualTimeBudgetExpired")
public class VirtualTimeBudgetExpired {
}
