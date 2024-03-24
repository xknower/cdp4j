package io.webfolder.cdp.type.log;

import io.webfolder.cdp.type.constant.LogEntrySeverity;
import io.webfolder.cdp.type.constant.LogEntrySource;
import io.webfolder.cdp.type.runtime.RemoteObject;
import io.webfolder.cdp.type.runtime.StackTrace;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Log entry
 */
@Data
public class LogEntry {

    /**
     * Log entry source.
     */
    private LogEntrySource source;
    /**
     * Log entry severity.
     */
    private LogEntrySeverity level;
    /**
     * Logged text.
     */
    private String text;
    /**
     * Timestamp when this entry was added.
     */
    private Double timestamp;
    /**
     * URL of the resource if known.
     */
    private String url;
    /**
     * Line number in the resource.
     */
    private Integer lineNumber;
    /**
     * JavaScript stack trace.
     */
    private StackTrace stackTrace;
    /**
     * Identifier of the network request associated with this entry.
     */
    private String networkRequestId;
    /**
     * Identifier of the worker associated with this entry.
     */
    private String workerId;
    /**
     * Call arguments.
     */
    private List<RemoteObject> args = new ArrayList<>();

}
