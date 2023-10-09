package io.webfolder.cdp.type.network;

/**
 * WebSocket frame data
 */
public class WebSocketFrame {
    private Double opcode;

    private Boolean mask;

    private String payloadData;

    /**
     * WebSocket frame opcode.
     */
    public Double getOpcode() {
        return opcode;
    }

    /**
     * WebSocket frame opcode.
     */
    public void setOpcode(Double opcode) {
        this.opcode = opcode;
    }

    /**
     * WebSocke frame mask.
     */
    public Boolean isMask() {
        return mask;
    }

    /**
     * WebSocke frame mask.
     */
    public void setMask(Boolean mask) {
        this.mask = mask;
    }

    /**
     * WebSocke frame payload data.
     */
    public String getPayloadData() {
        return payloadData;
    }

    /**
     * WebSocke frame payload data.
     */
    public void setPayloadData(String payloadData) {
        this.payloadData = payloadData;
    }
}
