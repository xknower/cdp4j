package io.webfolder.cdp.test;

import io.webfolder.cdp.ChromiumDownloader;
import io.webfolder.cdp.ChromiumVersion;
import io.webfolder.cdp.Launcher;
import io.webfolder.cdp.command.DOMSnapshot;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.session.SessionFactory;
import io.webfolder.cdp.type.domsnapshot.CaptureSnapshotResult;
import org.junit.Test;

import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

import static io.webfolder.cdp.ChromiumDownloader.getExecutable;
import static io.webfolder.cdp.ChromiumDownloader.getLatestInstalledVersion;
import static java.nio.file.Paths.get;
import static org.junit.Assert.assertEquals;

public class SnapshotTest {

    @Test
    public void test() {
        ChromiumDownloader downloader = new ChromiumDownloader();

        ChromiumVersion latest = getLatestInstalledVersion();
        Path path = latest != null ? getExecutable(latest) : downloader.download();

        String url = get("src/test/resources/snapshot.html").toAbsolutePath().toUri().toString();

        Launcher launcher = new Launcher();

        try (SessionFactory factory = launcher.launch(path); Session session = factory.create()) {
            session.navigate(url);
            DOMSnapshot snapshot = session.getCommand().getDOMSnapshot();
            snapshot.enable();
            CaptureSnapshotResult result = snapshot.captureSnapshot(Collections.emptyList());
            assertEquals(1, result.getDocuments().size());
            List<List<Double>> textBoxBounds = result.getDocuments().get(0).getTextBoxes().getBounds();
            assertEquals(1, textBoxBounds.size());
            assertEquals(4, textBoxBounds.get(0).size());
        }
    }
}
