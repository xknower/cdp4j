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
import static io.webfolder.cdp.session.WaitUntil.DomContentLoad;
import static java.lang.Double.valueOf;
import static java.nio.file.Paths.get;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class JsFunctionTest {

    @Test
    public void test() throws Exception {
        ChromiumDownloader downloader = new ChromiumDownloader();
        ChromiumVersion latest = getLatestInstalledVersion();
        Path path = latest != null ? getExecutable(latest) : downloader.download();

        String uri = get("src/test/resources/js-function-test.html").toAbsolutePath().toUri().toString();
        Launcher launcher = new Launcher();

        try (SessionFactory factory = launcher.launch(path); Session session = factory.create()) {
            // Important!
            // Register the JsFunction before the navigate method
            session.registerJsFunction(MyJsFunction.class);
            session.enableConsoleLog();
            session.navigateAndWait(uri, DomContentLoad);
            MyJsFunction utility = session.getJsFunction(MyJsFunction.class);
            List<String> attributes = utility.listAttributes("img", "src");
            assertEquals(2, attributes.size());
            assertEquals("image1.png", attributes.get(0));
            assertEquals("image2.png", attributes.get(1));
            utility.dummy();
            utility.consoleError("panic!");
            assertEquals(4, utility.sum(2, 2));
            assertEquals("foobar", utility.concat("foo", "bar"));
            List<Double> list = utility.increment(asList(0, 1, 2, 3), 1);
            assertEquals(4, list.size());
            assertEquals(valueOf("1"), list.get(0));
            assertEquals(valueOf("2"), list.get(1));
            assertEquals(valueOf("3"), list.get(2));
            assertEquals(valueOf("4"), list.get(3));
            session.wait(500);
        }
    }
}
