package io.webfolder.cdp.event.performance;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.performance.Metric;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Current values of the metrics
 */
@Domain("Performance")
@EventName("metrics")
@Data
public class Metrics {

    /**
     * Current values of the metrics.
     */
    private List<Metric> metrics = new ArrayList<>();
    /**
     * Timestamp title.
     */
    private String title;

}
