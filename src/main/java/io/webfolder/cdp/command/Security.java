package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.security.CertificateErrorAction;

/**
 * Security
 */
@Domain("Security")
public interface Security {
    /**
     * Disables tracking security state changes.
     */
    void disable();

    /**
     * Enables tracking security state changes.
     */
    void enable();

    /**
     * Enable/disable whether all certificate errors should be ignored.
     *
     * @param ignore If true, all certificate errors will be ignored.
     */
    @Experimental
    void setIgnoreCertificateErrors(Boolean ignore);

    /**
     * Handles a certificate error that fired a certificateError event.
     *
     * @param eventId The ID of the event.
     * @param action  The action to take on the certificate error.
     */
    void handleCertificateError(Integer eventId, CertificateErrorAction action);

    /**
     * Enable/disable overriding certificate errors. If enabled, all certificate error events need to
     * be handled by the DevTools client and should be answered with <code>handleCertificateError</code> commands.
     *
     * @param override If true, certificate errors will be overridden.
     */
    void setOverrideCertificateErrors(Boolean override);
}
