package io.webfolder.cdp.type.network;

import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Information about a signed exchange signature
 * https://wicg.github.io/webpackage/draft-yasskin-httpbis-origin-signed-exchanges-impl.html#rfc-section3.1
 */
@Experimental
@Data
public class SignedExchangeSignature {

    /**
     * Signed exchange signature label.
     */
    private String label;
    /**
     * The hex string of signed exchange signature.
     */
    private String signature;
    /**
     * Signed exchange signature integrity.
     */
    private String integrity;
    /**
     * Signed exchange signature cert Url.
     */
    private String certUrl;
    /**
     * The hex string of signed exchange signature cert sha256.
     */
    private String certSha256;
    /**
     * Signed exchange signature validity Url.
     */
    private String validityUrl;
    /**
     * Signed exchange signature date.
     */
    private Integer date;
    /**
     * Signed exchange signature expires.
     */
    private Integer expires;
    /**
     * The encoded certificates.
     */
    private List<String> certificates = new ArrayList<>();

}
