package io.webfolder.cdp.type.network;

import lombok.Data;

/**
 * WebSocket frame data
 */
@Data
public class WebSocketFrame {

    /**
     * WebSocket frame opcode.
     */
    private Double opcode;
    /**
     * WebSocket frame mask.
     */
    private Boolean mask;
    /**
     * WebSocket frame payload data.
     */
    private String payloadData;

}
