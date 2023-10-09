package io.webfolder.cdp.command;

import io.webfolder.cdp.annotation.Domain;
import io.webfolder.cdp.annotation.Experimental;
import io.webfolder.cdp.annotation.Returns;
import io.webfolder.cdp.type.constant.TimeDomain;
import io.webfolder.cdp.type.performance.Metric;

import java.util.List;

@Domain("Performance")
public interface Performance {
    /**
     * Disable collecting and reporting metrics.
     */
    void disable();

    /**
     * Enable collecting and reporting metrics.
     */
    void enable();

    /**
     * Sets time domain to use for collecting and reporting duration metrics.
     * Note that this must be called before enabling metrics collection. Calling
     * this method while metrics collection is enabled returns an error.
     *
     * @param timeDomain Time domain
     */
    @Experimental
    void setTimeDomain(TimeDomain timeDomain);

    /**
     * Retrieve current values of run-time metrics.
     *
     * @return Current values for run-time metrics.
     */
    @Returns("metrics")
    List<Metric> getMetrics();
}
