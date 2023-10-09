package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Returns;

import java.util.List;

/**
 * This domain is deprecated
 */
@Deprecated
@Domain("Schema")
public interface Schema {
    /**
     * Returns supported domains.
     *
     * @return List of supported domains.
     */
    @Returns("domains")
    List<io.webfolder.cdp.type.schema.Domain> getDomains();
}
