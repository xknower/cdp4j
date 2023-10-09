package io.webfolder.cdp.sample;

import io.webfolder.cdp.Launcher;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.session.SessionFactory;

public class SharedSession {

    public static void main(String[] args) {
        Launcher launcher = new Launcher();

        try (SessionFactory factory = launcher.launch();
             Session session = factory.create()) {
            try (Session firstSession = factory.create()) {
                firstSession.navigate("https://httpbin.org/cookies/set?SESSION_ID=1");
                firstSession.wait(1000);
                String session1 = (String) firstSession.evaluate("window.document.body.textContent");
                System.out.println(session1);
            }

            try (Session secondSession = factory.create()) {
                secondSession.navigate("https://httpbin.org/cookies");
                String session2 = (String) secondSession.evaluate("window.document.body.textContent");
                secondSession.wait(1000);
                System.out.println(session2);
            }
        }
    }
}
