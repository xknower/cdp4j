package io.webfolder.cdp.type.page;

import io.webfolder.cdp.type.dom.Rect;

public class GetLayoutMetricsResult {
    private LayoutViewport layoutViewport;

    private VisualViewport visualViewport;

    private Rect contentSize;

    public LayoutViewport getLayoutViewport() {
        return layoutViewport;
    }

    public VisualViewport getVisualViewport() {
        return visualViewport;
    }

    public Rect getContentSize() {
        return contentSize;
    }
}
