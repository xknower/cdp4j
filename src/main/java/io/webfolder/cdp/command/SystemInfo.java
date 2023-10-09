package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Returns;
import io.webfolder.cdp.type.systeminfo.GetInfoResult;
import io.webfolder.cdp.type.systeminfo.ProcessInfo;

import java.util.List;

/**
 * The SystemInfo domain defines methods and events for querying low-level system information
 */
@Experimental
@Domain("SystemInfo")
public interface SystemInfo {
    /**
     * Returns information about the system.
     *
     * @return GetInfoResult
     */
    GetInfoResult getInfo();

    /**
     * Returns information about all running processes.
     *
     * @return An array of process info blocks.
     */
    @Returns("processInfo")
    List<ProcessInfo> getProcessInfo();
}
