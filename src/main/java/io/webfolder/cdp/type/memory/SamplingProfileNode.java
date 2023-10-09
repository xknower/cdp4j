package io.webfolder.cdp.type.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * Heap profile sample
 */
public class SamplingProfileNode {
    private Double size;

    private Double total;

    private List<String> stack = new ArrayList<>();

    /**
     * Size of the sampled allocation.
     */
    public Double getSize() {
        return size;
    }

    /**
     * Size of the sampled allocation.
     */
    public void setSize(Double size) {
        this.size = size;
    }

    /**
     * Total bytes attributed to this sample.
     */
    public Double getTotal() {
        return total;
    }

    /**
     * Total bytes attributed to this sample.
     */
    public void setTotal(Double total) {
        this.total = total;
    }

    /**
     * Execution stack at the point of allocation.
     */
    public List<String> getStack() {
        return stack;
    }

    /**
     * Execution stack at the point of allocation.
     */
    public void setStack(List<String> stack) {
        this.stack = stack;
    }
}
