package io.webfolder.cdp.type.fetch;

import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.constant.AuthResponse;
import lombok.Data;

/**
 * Response to an AuthChallenge
 */
@Experimental
@Data
public class AuthChallengeResponse {

    /**
     * The decision on what to do in response to the authorization challenge.  Default means
     * deferring to the default behavior of the net stack, which will likely either the Cancel
     * authentication or display a popup dialog box.
     */
    private AuthResponse response;
    /**
     * The username to provide, possibly empty. Should only be set if response is
     * ProvideCredentials.
     */
    private String username;
    /**
     * The password to provide, possibly empty. Should only be set if response is
     * ProvideCredentials.
     */
    private String password;

}
