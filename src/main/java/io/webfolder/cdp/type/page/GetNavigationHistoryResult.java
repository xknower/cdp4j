package io.webfolder.cdp.type.page;

import lombok.Getter;

import java.util.List;

@Getter
public class GetNavigationHistoryResult {

    private Integer currentIndex;

    private List<NavigationEntry> entries;

}
