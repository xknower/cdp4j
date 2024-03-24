package io.webfolder.cdp.type.database;

import lombok.Data;

/**
 * Database error
 */
@Data
public class Error {

    /**
     * Error message.
     */
    private String message;
    /**
     * Error code.
     */
    private Integer code;

}
