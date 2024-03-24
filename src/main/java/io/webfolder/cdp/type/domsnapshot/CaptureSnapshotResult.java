package io.webfolder.cdp.type.domsnapshot;

import lombok.Getter;

import java.util.List;

@Getter
public class CaptureSnapshotResult {

    private List<DocumentSnapshot> documents;

}
