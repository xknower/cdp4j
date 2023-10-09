package io.webfolder.cdp.type.network;

import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.constant.AuthResponse;

/**
 * Response to an AuthChallenge
 */
@Experimental
public class AuthChallengeResponse {
    private AuthResponse response;

    private String username;

    private String password;

    /**
     * The decision on what to do in response to the authorization challenge.  Default means
     * deferring to the default behavior of the net stack, which will likely either the Cancel
     * authentication or display a popup dialog box.
     */
    public AuthResponse getResponse() {
        return response;
    }

    /**
     * The decision on what to do in response to the authorization challenge.  Default means
     * deferring to the default behavior of the net stack, which will likely either the Cancel
     * authentication or display a popup dialog box.
     */
    public void setResponse(AuthResponse response) {
        this.response = response;
    }

    /**
     * The username to provide, possibly empty. Should only be set if response is
     * ProvideCredentials.
     */
    public String getUsername() {
        return username;
    }

    /**
     * The username to provide, possibly empty. Should only be set if response is
     * ProvideCredentials.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * The password to provide, possibly empty. Should only be set if response is
     * ProvideCredentials.
     */
    public String getPassword() {
        return password;
    }

    /**
     * The password to provide, possibly empty. Should only be set if response is
     * ProvideCredentials.
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
