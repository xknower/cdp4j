package io.webfolder.cdp.type.runtime;

import io.webfolder.cdp.annotation.Experimental;
import lombok.Data;

/**
 * If <code>debuggerId</code> is set stack trace comes from another debugger and can be resolved there
 * This
 * allows to track cross-debugger calls
 * See Runtime <code>StackTrace<code> and Debugger
 * paused</code>for usages
 */
@Experimental
@Data
public class StackTraceId {

    private String id;

    private String debuggerId;

}
