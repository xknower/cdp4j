package io.webfolder.cdp.type.domsnapshot;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RareIntegerData {

    private List<Integer> index = new ArrayList<>();

    private List<Integer> value = new ArrayList<>();

}
