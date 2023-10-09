package io.webfolder.cdp.sample;

import io.webfolder.cdp.Launcher;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.session.SessionFactory;

import java.net.URL;

public class WaitUntil {

    public static void main(String[] args) {
        URL url = WaitUntil.class.getResource("/wait-until.html");

        Launcher launcher = new Launcher();

        try (SessionFactory factory = launcher.launch();
             Session session = factory.create()) {

            session.navigate(url.toString());
            session.waitDocumentReady();

            boolean succeed = session.waitUntil(s -> {
                return s.matches("#time");
            }, 10 * 1000);
            if (succeed) {
                String time = session.getText("#time");
                System.out.println(time);
            }
        }
    }
}
