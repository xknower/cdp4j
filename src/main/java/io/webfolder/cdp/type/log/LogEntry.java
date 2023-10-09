package io.webfolder.cdp.type.log;

import io.webfolder.cdp.type.constant.LogEntrySeverity;
import io.webfolder.cdp.type.constant.LogEntrySource;
import io.webfolder.cdp.type.runtime.RemoteObject;
import io.webfolder.cdp.type.runtime.StackTrace;

import java.util.ArrayList;
import java.util.List;

/**
 * Log entry
 */
public class LogEntry {
    private LogEntrySource source;

    private LogEntrySeverity level;

    private String text;

    private Double timestamp;

    private String url;

    private Integer lineNumber;

    private StackTrace stackTrace;

    private String networkRequestId;

    private String workerId;

    private List<RemoteObject> args = new ArrayList<>();

    /**
     * Log entry source.
     */
    public LogEntrySource getSource() {
        return source;
    }

    /**
     * Log entry source.
     */
    public void setSource(LogEntrySource source) {
        this.source = source;
    }

    /**
     * Log entry severity.
     */
    public LogEntrySeverity getLevel() {
        return level;
    }

    /**
     * Log entry severity.
     */
    public void setLevel(LogEntrySeverity level) {
        this.level = level;
    }

    /**
     * Logged text.
     */
    public String getText() {
        return text;
    }

    /**
     * Logged text.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Timestamp when this entry was added.
     */
    public Double getTimestamp() {
        return timestamp;
    }

    /**
     * Timestamp when this entry was added.
     */
    public void setTimestamp(Double timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * URL of the resource if known.
     */
    public String getUrl() {
        return url;
    }

    /**
     * URL of the resource if known.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Line number in the resource.
     */
    public Integer getLineNumber() {
        return lineNumber;
    }

    /**
     * Line number in the resource.
     */
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    /**
     * JavaScript stack trace.
     */
    public StackTrace getStackTrace() {
        return stackTrace;
    }

    /**
     * JavaScript stack trace.
     */
    public void setStackTrace(StackTrace stackTrace) {
        this.stackTrace = stackTrace;
    }

    /**
     * Identifier of the network request associated with this entry.
     */
    public String getNetworkRequestId() {
        return networkRequestId;
    }

    /**
     * Identifier of the network request associated with this entry.
     */
    public void setNetworkRequestId(String networkRequestId) {
        this.networkRequestId = networkRequestId;
    }

    /**
     * Identifier of the worker associated with this entry.
     */
    public String getWorkerId() {
        return workerId;
    }

    /**
     * Identifier of the worker associated with this entry.
     */
    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    /**
     * Call arguments.
     */
    public List<RemoteObject> getArgs() {
        return args;
    }

    /**
     * Call arguments.
     */
    public void setArgs(List<RemoteObject> args) {
        this.args = args;
    }
}
