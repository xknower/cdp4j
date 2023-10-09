package io.webfolder.cdp.type.domsnapshot;

import java.util.ArrayList;
import java.util.List;

public class RareIntegerData {
    private List<Integer> index = new ArrayList<>();

    private List<Integer> value = new ArrayList<>();

    public List<Integer> getIndex() {
        return index;
    }

    public void setIndex(List<Integer> index) {
        this.index = index;
    }

    public List<Integer> getValue() {
        return value;
    }

    public void setValue(List<Integer> value) {
        this.value = value;
    }
}
