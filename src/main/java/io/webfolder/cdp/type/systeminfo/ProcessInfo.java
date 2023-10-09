package io.webfolder.cdp.type.systeminfo;

/**
 * Represents process info
 */
public class ProcessInfo {
    private String type;

    private Integer id;

    private Double cpuTime;

    /**
     * Specifies process type.
     */
    public String getType() {
        return type;
    }

    /**
     * Specifies process type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Specifies process id.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Specifies process id.
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Specifies cumulative CPU usage in seconds across all threads of the
     * process since the process start.
     */
    public Double getCpuTime() {
        return cpuTime;
    }

    /**
     * Specifies cumulative CPU usage in seconds across all threads of the
     * process since the process start.
     */
    public void setCpuTime(Double cpuTime) {
        this.cpuTime = cpuTime;
    }
}
