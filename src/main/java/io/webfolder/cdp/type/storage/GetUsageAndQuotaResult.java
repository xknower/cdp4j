package io.webfolder.cdp.type.storage;

import lombok.Getter;

import java.util.List;

@Getter
public class GetUsageAndQuotaResult {

    private Double usage;

    private Double quota;

    private List<UsageForType> usageBreakdown;

}
