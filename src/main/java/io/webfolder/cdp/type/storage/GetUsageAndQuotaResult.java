package io.webfolder.cdp.type.storage;

import java.util.List;

public class GetUsageAndQuotaResult {
    private Double usage;

    private Double quota;

    private List<UsageForType> usageBreakdown;

    public Double getUsage() {
        return usage;
    }

    public Double getQuota() {
        return quota;
    }

    public List<UsageForType> getUsageBreakdown() {
        return usageBreakdown;
    }
}
