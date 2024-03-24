package io.webfolder.cdp.type.page;

import io.webfolder.cdp.type.dom.Rect;
import lombok.Getter;

@Getter
public class GetLayoutMetricsResult {

    private LayoutViewport layoutViewport;

    private VisualViewport visualViewport;

    private Rect contentSize;

}
