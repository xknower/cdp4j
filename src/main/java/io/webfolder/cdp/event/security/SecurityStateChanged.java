package io.webfolder.cdp.event.security;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.security.InsecureContentStatus;
import io.webfolder.cdp.type.security.SecurityState;
import io.webfolder.cdp.type.security.SecurityStateExplanation;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * The security state of the page changed
 */
@Domain("Security")
@EventName("securityStateChanged")
@Data
public class SecurityStateChanged {

    /**
     * Security state.
     */
    private SecurityState securityState;
    /**
     * True if the page was loaded over cryptographic transport such as HTTPS.
     */
    private Boolean schemeIsCryptographic;
    /**
     * List of explanations for the security state. If the overall security state is <code>insecure</code> or
     * <code>warning</code>, at least one corresponding explanation should be included.
     */
    private List<SecurityStateExplanation> explanations = new ArrayList<>();
    /**
     * Information about insecure content on the page.
     */
    private InsecureContentStatus insecureContentStatus;
    /**
     * Overrides user-visible description of the state.
     */
    private String summary;

}
