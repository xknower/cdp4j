package io.webfolder.cdp.event.security;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.security.InsecureContentStatus;
import io.webfolder.cdp.type.security.SecurityState;
import io.webfolder.cdp.type.security.SecurityStateExplanation;

import java.util.ArrayList;
import java.util.List;

/**
 * The security state of the page changed
 */
@Domain("Security")
@EventName("securityStateChanged")
public class SecurityStateChanged {
    private SecurityState securityState;

    private Boolean schemeIsCryptographic;

    private List<SecurityStateExplanation> explanations = new ArrayList<>();

    private InsecureContentStatus insecureContentStatus;

    private String summary;

    /**
     * Security state.
     */
    public SecurityState getSecurityState() {
        return securityState;
    }

    /**
     * Security state.
     */
    public void setSecurityState(SecurityState securityState) {
        this.securityState = securityState;
    }

    /**
     * True if the page was loaded over cryptographic transport such as HTTPS.
     */
    public Boolean isSchemeIsCryptographic() {
        return schemeIsCryptographic;
    }

    /**
     * True if the page was loaded over cryptographic transport such as HTTPS.
     */
    public void setSchemeIsCryptographic(Boolean schemeIsCryptographic) {
        this.schemeIsCryptographic = schemeIsCryptographic;
    }

    /**
     * List of explanations for the security state. If the overall security state is <code>insecure</code> or
     * <code>warning</code>, at least one corresponding explanation should be included.
     */
    public List<SecurityStateExplanation> getExplanations() {
        return explanations;
    }

    /**
     * List of explanations for the security state. If the overall security state is <code>insecure</code> or
     * <code>warning</code>, at least one corresponding explanation should be included.
     */
    public void setExplanations(List<SecurityStateExplanation> explanations) {
        this.explanations = explanations;
    }

    /**
     * Information about insecure content on the page.
     */
    public InsecureContentStatus getInsecureContentStatus() {
        return insecureContentStatus;
    }

    /**
     * Information about insecure content on the page.
     */
    public void setInsecureContentStatus(InsecureContentStatus insecureContentStatus) {
        this.insecureContentStatus = insecureContentStatus;
    }

    /**
     * Overrides user-visible description of the state.
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Overrides user-visible description of the state.
     */
    public void setSummary(String summary) {
        this.summary = summary;
    }
}
