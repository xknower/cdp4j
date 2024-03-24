package io.webfolder.cdp.event.runtime;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * Notification is issued every time when binding is called
 */
@Experimental
@Domain("Runtime")
@EventName("bindingCalled")
@Data
public class BindingCalled {

    private String name;

    private String payload;
    /**
     * Identifier of the context where the call was made.
     */
    private Integer executionContextId;

}
