package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.type.log.ViolationSetting;

import java.util.List;

/**
 * Provides access to log entries
 */
@Domain("Log")
public interface Log {
    /**
     * Clears the log.
     */
    void clear();

    /**
     * Disables log domain, prevents further log entries from being reported to the client.
     */
    void disable();

    /**
     * Enables log domain, sends the entries collected so far to the client by means of the
     * <code>entryAdded</code> notification.
     */
    void enable();

    /**
     * start violation reporting.
     *
     * @param config Configuration for violations.
     */
    void startViolationsReport(List<ViolationSetting> config);

    /**
     * Stop violation reporting.
     */
    void stopViolationsReport();
}
