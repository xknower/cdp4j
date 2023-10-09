package io.webfolder.cdp.type.network;

import io.webfolder.cdp.annotation.Experimental;

import java.util.ArrayList;
import java.util.List;

/**
 * Information about a signed exchange response
 */
@Experimental
public class SignedExchangeInfo {
    private Response outerResponse;

    private SignedExchangeHeader header;

    private SecurityDetails securityDetails;

    private List<SignedExchangeError> errors = new ArrayList<>();

    /**
     * The outer response of signed HTTP exchange which was received from network.
     */
    public Response getOuterResponse() {
        return outerResponse;
    }

    /**
     * The outer response of signed HTTP exchange which was received from network.
     */
    public void setOuterResponse(Response outerResponse) {
        this.outerResponse = outerResponse;
    }

    /**
     * Information about the signed exchange header.
     */
    public SignedExchangeHeader getHeader() {
        return header;
    }

    /**
     * Information about the signed exchange header.
     */
    public void setHeader(SignedExchangeHeader header) {
        this.header = header;
    }

    /**
     * Security details for the signed exchange header.
     */
    public SecurityDetails getSecurityDetails() {
        return securityDetails;
    }

    /**
     * Security details for the signed exchange header.
     */
    public void setSecurityDetails(SecurityDetails securityDetails) {
        this.securityDetails = securityDetails;
    }

    /**
     * Errors occurred while handling the signed exchagne.
     */
    public List<SignedExchangeError> getErrors() {
        return errors;
    }

    /**
     * Errors occurred while handling the signed exchagne.
     */
    public void setErrors(List<SignedExchangeError> errors) {
        this.errors = errors;
    }
}
