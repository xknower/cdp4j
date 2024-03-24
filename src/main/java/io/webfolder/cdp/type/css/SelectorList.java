package io.webfolder.cdp.type.css;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Selector list data
 */
@Data
public class SelectorList {

    /**
     * Selectors in the list.
     */
    private List<Value> selectors = new ArrayList<>();
    /**
     * Rule selector text.
     */
    private String text;

}
