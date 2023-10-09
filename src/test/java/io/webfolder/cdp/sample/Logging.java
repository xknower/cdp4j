package io.webfolder.cdp.sample;

import io.webfolder.cdp.Launcher;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.session.SessionFactory;

public class Logging {

    public static void main(String[] args) {
        Launcher launcher = new Launcher();

        try (SessionFactory factory = launcher.launch();
             Session session = factory.create()) {
            session.navigate("about:blank");
            session.waitDocumentReady();

            // logs javascript messages
            session.enableConsoleLog();

            session.evaluate("console.info('info message')");
            session.evaluate("console.error('error message')");
            session.evaluate("console.warn('warning message')");

            // logs newtwork, violation, security, storage and deprecation messages
            session.enableDetailLog();

            session.evaluate("fetch('https://google.com')");
            session.wait(2000);
        }
    }
}
