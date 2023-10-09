package io.webfolder.cdp.type.console;

import io.webfolder.cdp.type.constant.MessageSeverity;
import io.webfolder.cdp.type.constant.MessageSource;

/**
 * Console message
 */
public class ConsoleMessage {
    private MessageSource source;

    private MessageSeverity level;

    private String text;

    private String url;

    private Integer line;

    private Integer column;

    /**
     * Message source.
     */
    public MessageSource getSource() {
        return source;
    }

    /**
     * Message source.
     */
    public void setSource(MessageSource source) {
        this.source = source;
    }

    /**
     * Message severity.
     */
    public MessageSeverity getLevel() {
        return level;
    }

    /**
     * Message severity.
     */
    public void setLevel(MessageSeverity level) {
        this.level = level;
    }

    /**
     * Message text.
     */
    public String getText() {
        return text;
    }

    /**
     * Message text.
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * URL of the message origin.
     */
    public String getUrl() {
        return url;
    }

    /**
     * URL of the message origin.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Line number in the resource that generated this message (1-based).
     */
    public Integer getLine() {
        return line;
    }

    /**
     * Line number in the resource that generated this message (1-based).
     */
    public void setLine(Integer line) {
        this.line = line;
    }

    /**
     * Column number in the resource that generated this message (1-based).
     */
    public Integer getColumn() {
        return column;
    }

    /**
     * Column number in the resource that generated this message (1-based).
     */
    public void setColumn(Integer column) {
        this.column = column;
    }
}
