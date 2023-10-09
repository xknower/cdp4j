package io.webfolder.cdp.type.css;

import java.util.ArrayList;
import java.util.List;

/**
 * Selector list data
 */
public class SelectorList {
    private List<Value> selectors = new ArrayList<>();

    private String text;

    /**
     * Selectors in the list.
     */
    public List<Value> getSelectors() {
        return selectors;
    }

    /**
     * Selectors in the list.
     */
    public void setSelectors(List<Value> selectors) {
        this.selectors = selectors;
    }

    /**
     * Rule selector text.
     */
    public String getText() {
        return text;
    }

    /**
     * Rule selector text.
     */
    public void setText(String text) {
        this.text = text;
    }
}
