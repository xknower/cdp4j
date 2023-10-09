package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Optional;

/**
 * Testing domain is a dumping ground for the capabilities requires for browser or app testing that do not fit other
 * domains
 */
@Experimental
@Domain("Testing")
public interface Testing {
    /**
     * Generates a report for testing.
     *
     * @param message Message to be displayed in the report.
     * @param group   Specifies the endpoint group to deliver the report to.
     */
    void generateTestReport(String message, @Optional String group);

    /**
     * Generates a report for testing.
     *
     * @param message Message to be displayed in the report.
     */
    void generateTestReport(String message);
}
