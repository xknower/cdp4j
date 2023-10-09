package io.webfolder.cdp.type.memory;

public class GetDOMCountersResult {
    private Integer documents;

    private Integer nodes;

    private Integer jsEventListeners;

    public Integer getDocuments() {
        return documents;
    }

    public Integer getNodes() {
        return nodes;
    }

    public Integer getJsEventListeners() {
        return jsEventListeners;
    }
}
