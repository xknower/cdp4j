package com.neovisionaries.ws.client;

/**
 * Interface for various Masker implementations.
 *
 * 用于各种Masker实现的接口。
 */
public interface Masker {

    /**
     * @return As per websocket RFC 6455 specification ( https://tools.ietf.org/html/rfc6455#page-32 )
     * 4 byte masking key( %x00-FF ).
     */
    byte[] getMaskingKey();

    /**
     * @param payload Mask the payload with same masking key returned using @see getMaskingKey API.
     */
    void mask(byte[] payload);
}
