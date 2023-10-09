package io.webfolder.cdp.type.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * Array of heap profile samples
 */
public class SamplingProfile {
    private List<SamplingProfileNode> samples = new ArrayList<>();

    private List<Module> modules = new ArrayList<>();

    public List<SamplingProfileNode> getSamples() {
        return samples;
    }

    public void setSamples(List<SamplingProfileNode> samples) {
        this.samples = samples;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}
