package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Optional;
import io.webfolder.cdp.annotation.Returns;
import io.webfolder.cdp.type.constant.PauseOnExceptionState;
import io.webfolder.cdp.type.constant.TargetCallFrames;
import io.webfolder.cdp.type.debugger.BreakLocation;
import io.webfolder.cdp.type.debugger.EvaluateOnCallFrameResult;
import io.webfolder.cdp.type.debugger.Location;
import io.webfolder.cdp.type.debugger.RestartFrameResult;
import io.webfolder.cdp.type.debugger.ScriptPosition;
import io.webfolder.cdp.type.debugger.SearchMatch;
import io.webfolder.cdp.type.debugger.SetBreakpointByUrlResult;
import io.webfolder.cdp.type.debugger.SetBreakpointResult;
import io.webfolder.cdp.type.debugger.SetScriptSourceResult;
import io.webfolder.cdp.type.runtime.CallArgument;
import io.webfolder.cdp.type.runtime.StackTrace;
import io.webfolder.cdp.type.runtime.StackTraceId;

import java.util.List;

/**
 * Debugger domain exposes JavaScript debugging capabilities
 * It allows setting and removing
 * breakpoints, stepping through execution, exploring stack traces, etc
 */
@Domain("Debugger")
public interface Debugger {
    /**
     * Continues execution until specific location is reached.
     *
     * @param location Location to continue to.
     */
    void continueToLocation(Location location, @Optional TargetCallFrames targetCallFrames);

    /**
     * Disables debugger for given page.
     */
    void disable();

    /**
     * Enables debugger for the given page. Clients should not assume that the debugging has been
     * enabled until the result for this command is received.
     *
     * @return Unique identifier of the debugger.
     */
    @Returns("debuggerId")
    String enable();

    /**
     * Evaluates expression on a given call frame.
     *
     * @param callFrameId           Call frame identifier to evaluate on.
     * @param expression            Expression to evaluate.
     * @param objectGroup           String object group name to put result into (allows rapid releasing resulting object handles
     *                              using <code>releaseObjectGroup</code>).
     * @param includeCommandLineAPI Specifies whether command line API should be available to the evaluated expression, defaults
     *                              to false.
     * @param silent                In silent mode exceptions thrown during evaluation are not reported and do not pause
     *                              execution. Overrides <code>setPauseOnException</code> state.
     * @param returnByValue         Whether the result is expected to be a JSON object that should be sent by value.
     * @param generatePreview       Whether preview should be generated for the result.
     * @param throwOnSideEffect     Whether to throw an exception if side effect cannot be ruled out during evaluation.
     * @param timeout               Terminate execution after timing out (number of milliseconds).
     * @return EvaluateOnCallFrameResult
     */
    EvaluateOnCallFrameResult evaluateOnCallFrame(String callFrameId, String expression,
                                                  @Optional String objectGroup, @Optional Boolean includeCommandLineAPI,
                                                  @Optional Boolean silent, @Optional Boolean returnByValue,
                                                  @Experimental @Optional Boolean generatePreview, @Optional Boolean throwOnSideEffect,
                                                  @Experimental @Optional Double timeout);

    /**
     * Returns possible locations for breakpoint. scriptId in start and end range locations should be
     * the same.
     *
     * @param start              Start of range to search possible breakpoint locations in.
     * @param end                End of range to search possible breakpoint locations in (excluding). When not specified, end
     *                           of scripts is used as end of range.
     * @param restrictToFunction Only consider locations which are in the same (non-nested) function as start.
     * @return List of the possible breakpoint locations.
     */
    @Returns("locations")
    List<BreakLocation> getPossibleBreakpoints(Location start, @Optional Location end,
                                               @Optional Boolean restrictToFunction);

    /**
     * Returns source for the script with given id.
     *
     * @param scriptId Id of the script to get source for.
     * @return Script source.
     */
    @Returns("scriptSource")
    String getScriptSource(String scriptId);

    /**
     * Returns stack trace with given <code>stackTraceId</code>.
     */
    @Experimental
    @Returns("stackTrace")
    StackTrace getStackTrace(StackTraceId stackTraceId);

    /**
     * Stops on the next JavaScript statement.
     */
    void pause();

    @Experimental
    void pauseOnAsyncCall(StackTraceId parentStackTraceId);

    /**
     * Removes JavaScript breakpoint.
     */
    void removeBreakpoint(String breakpointId);

    /**
     * Restarts particular call frame from the beginning.
     *
     * @param callFrameId Call frame identifier to evaluate on.
     * @return RestartFrameResult
     */
    RestartFrameResult restartFrame(String callFrameId);

    /**
     * Resumes JavaScript execution.
     */
    void resume();

    /**
     * This method is deprecated - use Debugger.stepInto with breakOnAsyncCall and
     * Debugger.pauseOnAsyncTask instead. Steps into next scheduled async task if any is scheduled
     * before next pause. Returns success when async task is actually scheduled, returns error if no
     * task were scheduled or another scheduleStepIntoAsync was called.
     */
    @Experimental
    void scheduleStepIntoAsync();

    /**
     * Searches for given string in script content.
     *
     * @param scriptId      Id of the script to search in.
     * @param query         String to search for.
     * @param caseSensitive If true, search is case sensitive.
     * @param isRegex       If true, treats string parameter as regex.
     * @return List of search matches.
     */
    @Returns("result")
    List<SearchMatch> searchInContent(String scriptId, String query,
                                      @Optional Boolean caseSensitive, @Optional Boolean isRegex);

    /**
     * Enables or disables async call stacks tracking.
     *
     * @param maxDepth Maximum depth of async call stacks. Setting to <code>0</code> will effectively disable collecting async
     *                 call stacks (default).
     */
    void setAsyncCallStackDepth(Integer maxDepth);

    /**
     * Replace previous blackbox patterns with passed ones. Forces backend to skip stepping/pausing in
     * scripts with url matching one of the patterns. VM will try to leave blackboxed script by
     * performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
     *
     * @param patterns Array of regexps that will be used to check script url for blackbox state.
     */
    @Experimental
    void setBlackboxPatterns(List<String> patterns);

    /**
     * Makes backend skip steps in the script in blackboxed ranges. VM will try leave blacklisted
     * scripts by performing 'step in' several times, finally resorting to 'step out' if unsuccessful.
     * Positions array contains positions where blackbox state is changed. First interval isn't
     * blackboxed. Array should be sorted.
     *
     * @param scriptId Id of the script.
     */
    @Experimental
    void setBlackboxedRanges(String scriptId, List<ScriptPosition> positions);

    /**
     * Sets JavaScript breakpoint at a given location.
     *
     * @param location  Location to set breakpoint in.
     * @param condition Expression to use as a breakpoint condition. When specified, debugger will only stop on the
     *                  breakpoint if this expression evaluates to true.
     * @return SetBreakpointResult
     */
    SetBreakpointResult setBreakpoint(Location location, @Optional String condition);

    /**
     * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this
     * command is issued, all existing parsed scripts will have breakpoints resolved and returned in
     * <code>locations</code> property. Further matching script parsing will result in subsequent
     * <code>breakpointResolved</code> events issued. This logical breakpoint will survive page reloads.
     *
     * @param lineNumber   Line number to set breakpoint at.
     * @param url          URL of the resources to set breakpoint on.
     * @param urlRegex     Regex pattern for the URLs of the resources to set breakpoints on. Either <code>url</code> or
     *                     <code>urlRegex</code> must be specified.
     * @param scriptHash   Script hash of the resources to set breakpoint on.
     * @param columnNumber Offset in the line to set breakpoint at.
     * @param condition    Expression to use as a breakpoint condition. When specified, debugger will only stop on the
     *                     breakpoint if this expression evaluates to true.
     * @return SetBreakpointByUrlResult
     */
    SetBreakpointByUrlResult setBreakpointByUrl(Integer lineNumber, @Optional String url,
                                                @Optional String urlRegex, @Optional String scriptHash, @Optional Integer columnNumber,
                                                @Optional String condition);

    /**
     * Sets JavaScript breakpoint before each call to the given function.
     * If another function was created from the same source as a given one,
     * calling it will also trigger the breakpoint.
     *
     * @param objectId  Function object id.
     * @param condition Expression to use as a breakpoint condition. When specified, debugger will
     *                  stop on the breakpoint if this expression evaluates to true.
     * @return Id of the created breakpoint for further reference.
     */
    @Experimental
    @Returns("breakpointId")
    String setBreakpointOnFunctionCall(String objectId, @Optional String condition);

    /**
     * Activates / deactivates all breakpoints on the page.
     *
     * @param active New value for breakpoints active state.
     */
    void setBreakpointsActive(Boolean active);

    /**
     * Defines pause on exceptions state. Can be set to stop on all exceptions, uncaught exceptions or
     * no exceptions. Initial pause on exceptions state is <code>none</code>.
     *
     * @param state Pause on exceptions mode.
     */
    void setPauseOnExceptions(PauseOnExceptionState state);

    /**
     * Changes return value in top frame. Available only at return break position.
     *
     * @param newValue New return value.
     */
    @Experimental
    void setReturnValue(CallArgument newValue);

    /**
     * Edits JavaScript source live.
     *
     * @param scriptId     Id of the script to edit.
     * @param scriptSource New content of the script.
     * @param dryRun       If true the change will not actually be applied. Dry run may be used to get result
     *                     description without actually modifying the code.
     * @return SetScriptSourceResult
     */
    SetScriptSourceResult setScriptSource(String scriptId, String scriptSource,
                                          @Optional Boolean dryRun);

    /**
     * Makes page not interrupt on any pauses (breakpoint, exception, dom exception etc).
     *
     * @param skip New value for skip pauses state.
     */
    void setSkipAllPauses(Boolean skip);

    /**
     * Changes value of variable in a callframe. Object-based scopes are not supported and must be
     * mutated manually.
     *
     * @param scopeNumber  0-based number of scope as was listed in scope chain. Only 'local', 'closure' and 'catch'
     *                     scope types are allowed. Other scopes could be manipulated manually.
     * @param variableName Variable name.
     * @param newValue     New variable value.
     * @param callFrameId  Id of callframe that holds variable.
     */
    void setVariableValue(Integer scopeNumber, String variableName, CallArgument newValue,
                          String callFrameId);

    /**
     * Steps into the function call.
     *
     * @param breakOnAsyncCall Debugger will issue additional Debugger.paused notification if any async task is scheduled
     *                         before next pause.
     */
    void stepInto(@Experimental @Optional Boolean breakOnAsyncCall);

    /**
     * Steps out of the function call.
     */
    void stepOut();

    /**
     * Steps over the statement.
     */
    void stepOver();

    /**
     * Continues execution until specific location is reached.
     *
     * @param location Location to continue to.
     */
    void continueToLocation(Location location);

    /**
     * Evaluates expression on a given call frame.
     *
     * @param callFrameId Call frame identifier to evaluate on.
     * @param expression  Expression to evaluate.
     * @return EvaluateOnCallFrameResult
     */
    EvaluateOnCallFrameResult evaluateOnCallFrame(String callFrameId, String expression);

    /**
     * Returns possible locations for breakpoint. scriptId in start and end range locations should be
     * the same.
     *
     * @param start Start of range to search possible breakpoint locations in.
     * @return List of the possible breakpoint locations.
     */
    @Returns("locations")
    List<BreakLocation> getPossibleBreakpoints(Location start);

    /**
     * Searches for given string in script content.
     *
     * @param scriptId Id of the script to search in.
     * @param query    String to search for.
     * @return List of search matches.
     */
    @Returns("result")
    List<SearchMatch> searchInContent(String scriptId, String query);

    /**
     * Sets JavaScript breakpoint at a given location.
     *
     * @param location Location to set breakpoint in.
     * @return SetBreakpointResult
     */
    SetBreakpointResult setBreakpoint(Location location);

    /**
     * Sets JavaScript breakpoint at given location specified either by URL or URL regex. Once this
     * command is issued, all existing parsed scripts will have breakpoints resolved and returned in
     * <code>locations</code> property. Further matching script parsing will result in subsequent
     * <code>breakpointResolved</code> events issued. This logical breakpoint will survive page reloads.
     *
     * @param lineNumber Line number to set breakpoint at.
     * @return SetBreakpointByUrlResult
     */
    SetBreakpointByUrlResult setBreakpointByUrl(Integer lineNumber);

    /**
     * Sets JavaScript breakpoint before each call to the given function.
     * If another function was created from the same source as a given one,
     * calling it will also trigger the breakpoint.
     *
     * @param objectId Function object id.
     * @return Id of the created breakpoint for further reference.
     */
    @Experimental
    @Returns("breakpointId")
    String setBreakpointOnFunctionCall(String objectId);

    /**
     * Edits JavaScript source live.
     *
     * @param scriptId     Id of the script to edit.
     * @param scriptSource New content of the script.
     * @return SetScriptSourceResult
     */
    SetScriptSourceResult setScriptSource(String scriptId, String scriptSource);

    /**
     * Steps into the function call.
     */
    void stepInto();
}
