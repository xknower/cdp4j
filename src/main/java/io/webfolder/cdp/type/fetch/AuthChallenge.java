package io.webfolder.cdp.type.fetch;

import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.constant.AuthChallengeSource;

/**
 * Authorization challenge for HTTP status code 401 or 407
 */
@Experimental
public class AuthChallenge {
    private AuthChallengeSource source;

    private String origin;

    private String scheme;

    private String realm;

    /**
     * Source of the authentication challenge.
     */
    public AuthChallengeSource getSource() {
        return source;
    }

    /**
     * Source of the authentication challenge.
     */
    public void setSource(AuthChallengeSource source) {
        this.source = source;
    }

    /**
     * Origin of the challenger.
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Origin of the challenger.
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * The authentication scheme used, such as basic or digest
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * The authentication scheme used, such as basic or digest
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     * The realm of the challenge. May be empty.
     */
    public String getRealm() {
        return realm;
    }

    /**
     * The realm of the challenge. May be empty.
     */
    public void setRealm(String realm) {
        this.realm = realm;
    }
}
