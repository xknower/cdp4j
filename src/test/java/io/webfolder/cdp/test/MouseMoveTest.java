package io.webfolder.cdp.test;

import io.webfolder.cdp.ChromiumDownloader;
import io.webfolder.cdp.ChromiumVersion;
import io.webfolder.cdp.Launcher;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.session.SessionFactory;
import org.junit.Test;

import java.nio.file.Path;
import java.util.List;

import static io.webfolder.cdp.ChromiumDownloader.getExecutable;
import static io.webfolder.cdp.ChromiumDownloader.getLatestInstalledVersion;
import static java.nio.file.Paths.get;
import static org.junit.Assert.assertTrue;

public class MouseMoveTest {

    @Test
    @SuppressWarnings({"unchecked"})
    public void testMouseMove() throws Exception {
        ChromiumDownloader downloader = new ChromiumDownloader();
        ChromiumVersion latest = getLatestInstalledVersion();
        Path path = latest != null ? getExecutable(latest) : downloader.download();

        String uri = get("src/test/resources/mouse-move.html").toAbsolutePath().toUri().toString();

        Launcher launcher = new Launcher();

        try (SessionFactory factory = launcher.launch(path); Session session = factory.create()) {
            session.enableConsoleLog();
            session.navigate(uri);
            session.move(20, 20);
            session.move(21, 21);
            session.move(22, 22);
            session.move(23, 23);
            List<Double> positionsX = session.getVariable("positionsX", List.class);
            List<Double> positionsY = session.getVariable("positionsY", List.class);
            assertTrue(positionsX.size() >= 4);
            assertTrue(positionsY.size() >= 4);
        }
    }
}
