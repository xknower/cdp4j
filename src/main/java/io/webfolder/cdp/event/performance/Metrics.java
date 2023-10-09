package io.webfolder.cdp.event.performance;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.EventName;
import io.webfolder.cdp.type.performance.Metric;

import java.util.ArrayList;
import java.util.List;

/**
 * Current values of the metrics
 */
@Domain("Performance")
@EventName("metrics")
public class Metrics {
    private List<Metric> metrics = new ArrayList<>();

    private String title;

    /**
     * Current values of the metrics.
     */
    public List<Metric> getMetrics() {
        return metrics;
    }

    /**
     * Current values of the metrics.
     */
    public void setMetrics(List<Metric> metrics) {
        this.metrics = metrics;
    }

    /**
     * Timestamp title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Timestamp title.
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
