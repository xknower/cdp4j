package io.webfolder.cdp.test;

import io.webfolder.cdp.ChromiumDownloader;
import io.webfolder.cdp.ChromiumVersion;
import io.webfolder.cdp.Launcher;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.session.SessionFactory;
import io.webfolder.cdp.session.WaitUntil;
import org.junit.Test;

import java.nio.file.Path;

import static io.webfolder.cdp.ChromiumDownloader.getExecutable;
import static io.webfolder.cdp.ChromiumDownloader.getLatestInstalledVersion;
import static java.nio.file.Paths.get;
import static org.junit.Assert.assertTrue;

public class MouseClickTest {

    @Test
    public void testMouseMove() throws Exception {
        ChromiumDownloader downloader = new ChromiumDownloader();
        ChromiumVersion latest = getLatestInstalledVersion();
        Path path = latest != null ? getExecutable(latest) : downloader.download();

        String uri = get("src/test/resources/mouse-click.html").toAbsolutePath().toUri().toString();

        Launcher launcher = new Launcher();

        try (SessionFactory factory = launcher.launch(path); Session session = factory.create()) {
            session.navigateAndWait(uri, WaitUntil.DomContentLoad);
            session.click("#mybutton");
            Boolean clicked = session.getVariable("clicked", Boolean.class);
            assertTrue(clicked);
        }
    }
}
