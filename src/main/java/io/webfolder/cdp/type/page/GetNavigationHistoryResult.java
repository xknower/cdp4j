package io.webfolder.cdp.type.page;

import java.util.List;

public class GetNavigationHistoryResult {
    private Integer currentIndex;

    private List<NavigationEntry> entries;

    public Integer getCurrentIndex() {
        return currentIndex;
    }

    public List<NavigationEntry> getEntries() {
        return entries;
    }
}
