package io.webfolder.cdp.type.memory;

import lombok.Getter;

@Getter
public class GetDOMCountersResult {

    private Integer documents;

    private Integer nodes;

    private Integer jsEventListeners;

}
