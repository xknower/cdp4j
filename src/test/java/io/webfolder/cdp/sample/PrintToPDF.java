package io.webfolder.cdp.sample;

import io.webfolder.cdp.AdaptiveProcessManager;
import io.webfolder.cdp.Launcher;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.session.SessionFactory;

import java.io.IOException;
import java.nio.file.Path;

import static java.awt.Desktop.getDesktop;
import static java.awt.Desktop.isDesktopSupported;
import static java.nio.file.Files.createTempFile;
import static java.nio.file.Files.write;
import static java.util.Arrays.asList;

public class PrintToPDF {

    // Requires Headless Chrome
    // https://chromium.googlesource.com/chromium/src/+/lkgr/headless/README.md
    public static void main(String[] args) throws IOException {
        Launcher launcher = new Launcher();
        launcher.setProcessManager(new AdaptiveProcessManager());

        Path file = createTempFile("cdp4j", ".pdf");

        try (SessionFactory factory = launcher.launch(asList("--disable-gpu", "--headless"))) {

            String context = factory.createBrowserContext();
            try (Session session = factory.create(context)) {

                session.navigate("https://webfolder.io/cdp4j.html");
                session.waitDocumentReady();

                byte[] content = session
                        .getCommand()
                        .getPage()
                        .printToPDF();

                write(file, content);
            }

            factory.disposeBrowserContext(context);
        }

        if (isDesktopSupported()) {
            getDesktop().open(file.toFile());
        }

        launcher.getProcessManager().kill();
    }
}
