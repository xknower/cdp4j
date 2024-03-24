package io.webfolder.cdp.type.domsnapshot;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Data that is only present on rare nodes
 */
@Data
public class RareStringData {

    private List<Integer> index = new ArrayList<>();

    private List<Integer> value = new ArrayList<>();

}
