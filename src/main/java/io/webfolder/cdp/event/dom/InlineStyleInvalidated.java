package io.webfolder.cdp.event.dom;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Fired when <code>Element</code>'s inline style is modified via a CSS property modification
 */
@Experimental
@Domain("DOM")
@EventName("inlineStyleInvalidated")
@Data
public class InlineStyleInvalidated {

    /**
     * Ids of the nodes for which the inline styles have been invalidated.
     */
    private List<Integer> nodeIds = new ArrayList<>();

}
