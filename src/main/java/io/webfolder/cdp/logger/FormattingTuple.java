package io.webfolder.cdp.logger;

import lombok.Getter;

/**
 * Holds the results of formatting done by {@link MessageFormatter}.
 *
 * @author Joern Huxhorn
 */
@Getter
class FormattingTuple {

    static public FormattingTuple NULL = new FormattingTuple(null);

    private final String message;

    private final Throwable throwable;

    private final Object[] argArray;

    public FormattingTuple(String message) {
        this(message, null, null);
    }

    public FormattingTuple(String message, Object[] argArray, Throwable throwable) {
        this.message = message;
        this.throwable = throwable;
        this.argArray = argArray;
    }

}
