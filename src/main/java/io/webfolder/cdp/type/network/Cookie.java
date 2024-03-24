package io.webfolder.cdp.type.network;

import lombok.Data;

import java.io.Serializable;

/**
 * Cookie object
 */
@Data
public class Cookie implements Serializable {

    private static final long serialVersionUID = 3780035664493989002L;

    /**
     * Cookie name.
     */
    private String name;
    /**
     * Cookie value.
     */
    private String value;
    /**
     * Cookie domain.
     */
    private String domain;
    /**
     * Cookie path.
     */
    private String path;
    /**
     * Cookie expiration date as the number of seconds since the UNIX epoch.
     */
    private Double expires;
    /**
     * Cookie size.
     */
    private Integer size;
    /**
     * True if cookie is http-only.
     */
    private Boolean httpOnly;
    /**
     * True if cookie is secure.
     */
    private Boolean secure;
    /**
     * True in case of session cookie.
     */
    private Boolean session;
    /**
     * Cookie SameSite type.
     */
    private CookieSameSite sameSite;

}
