package io.webfolder.cdp.type.fetch;

import lombok.Data;

/**
 * Response HTTP header entry
 */
@Data
public class HeaderEntry {

    private String name;

    private String value;

}
