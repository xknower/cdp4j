package io.webfolder.cdp.type.page;

import lombok.Getter;

import java.util.List;

@Getter
public class GetAppManifestResult {

    private String url;

    private List<AppManifestError> errors;

    private String data;

}
