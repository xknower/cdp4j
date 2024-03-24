package io.webfolder.cdp.type.dom;

import lombok.Data;

/**
 * Backend node with a friendly name
 */
@Data
public class BackendNode {

    /**
     * <code>Node</code>'s nodeType.
     */
    private Integer nodeType;
    /**
     * <code>Node</code>'s nodeName.
     */
    private String nodeName;

    private Integer backendNodeId;

}
