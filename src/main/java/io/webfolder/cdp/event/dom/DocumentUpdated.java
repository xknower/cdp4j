package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

/**
 * Fired when <code>Document</code> has been totally updated
 * Node ids are no longer valid
 */
@Domain("DOM")
@EventName("documentUpdated")
public class DocumentUpdated {
}
