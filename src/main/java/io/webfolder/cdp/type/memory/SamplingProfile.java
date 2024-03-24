package io.webfolder.cdp.type.memory;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Array of heap profile samples
 */
@Data
public class SamplingProfile {

    private List<SamplingProfileNode> samples = new ArrayList<>();

    private List<Module> modules = new ArrayList<>();

}
