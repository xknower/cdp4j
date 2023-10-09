package io.webfolder.cdp.sample;

import io.webfolder.cdp.AdaptiveProcessManager;
import io.webfolder.cdp.Launcher;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.session.SessionFactory;

import static java.util.Arrays.asList;

public class IncognitoBrowsing {

    // Requires Headless Chrome
    // https://chromium.googlesource.com/chromium/src/+/lkgr/headless/README.md
    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.setProcessManager(new AdaptiveProcessManager());

        try (SessionFactory factory = launcher.launch(asList("--headless", "--disable-gpu"))) {

            String firstContext = null;

            try (Session firstSession = factory.create()) {
                firstContext = firstSession.getBrowserContextId();
                firstSession.navigate("https://httpbin.org/cookies/set?SESSION_ID=1");
                firstSession.waitDocumentReady();
                String session1Content = (String) firstSession.evaluate("window.document.body.textContent");
                System.err.println(session1Content);
            }

            // firstSession & anotherSession share same SESSSION_ID value

            try (Session anotherSession = factory.create(firstContext)) {
                anotherSession.navigate("https://httpbin.org/cookies");
                anotherSession.waitDocumentReady();
                String anotherSessionContent = (String) anotherSession.evaluate("window.document.body.textContent");
                System.err.println(anotherSessionContent);
            }

            String secondContext = factory.createBrowserContext();
            try (Session secondSession = factory.create(secondContext)) {
                secondSession.navigate("https://httpbin.org/cookies");
                secondSession.waitDocumentReady();
                String session2Content = (String) secondSession.evaluate("window.document.body.textContent");
                System.err.println(session2Content);
            }

            // Dispose first context
            factory.disposeBrowserContext(firstContext);

            // Dispose second context
            factory.disposeBrowserContext(secondContext);

            launcher.getProcessManager().kill();
        }
    }
}
