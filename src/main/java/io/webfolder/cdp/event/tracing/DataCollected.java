package io.webfolder.cdp.event.tracing;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Contains an bucket of collected trace events
 * When tracing is stopped collected events will be
 * send as a sequence of dataCollected events followed by tracingComplete event
 */
@Domain("Tracing")
@EventName("dataCollected")
public class DataCollected {

    private List<Map<String, Object>> value = new ArrayList<>();

    public List<Map<String, Object>> getValue() {
        return value;
    }

    public void setValue(List<Map<String, Object>> value) {
        this.value = value;
    }
}
