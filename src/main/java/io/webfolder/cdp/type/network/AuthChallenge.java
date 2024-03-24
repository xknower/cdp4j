package io.webfolder.cdp.type.network;

import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.type.constant.AuthChallengeSource;
import lombok.Data;

/**
 * Authorization challenge for HTTP status code 401 or 407
 */
@Experimental
@Data
public class AuthChallenge {

    /**
     * Source of the authentication challenge.
     */
    private AuthChallengeSource source;
    /**
     * Origin of the challenger.
     */
    private String origin;
    /**
     * The authentication scheme used, such as basic or digest
     */
    private String scheme;
    /**
     * The realm of the challenge. May be empty.
     */
    private String realm;

}
