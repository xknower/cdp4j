package io.webfolder.cdp.sample;

import io.webfolder.cdp.Launcher;
import io.webfolder.cdp.command.Page;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.session.SessionFactory;

import java.nio.file.Path;
import java.nio.file.Paths;

import static io.webfolder.cdp.type.constant.DownloadBehavior.Allow;

public class DownloadFile {

    public static void main(String[] args) {
        Launcher launcher = new Launcher();

        try (SessionFactory factory = launcher.launch();
             Session session = factory.create()) {
            session.navigate("https://www.chiark.greenend.org.uk/~sgtatham/putty/latest.html");
            session.waitDocumentReady();
            session.getCommand().getNetwork().enable();
            Page page = session.getCommand().getPage();
            Path downloadPath = Paths.get(".").toAbsolutePath();
            page.setDownloadBehavior(Allow, downloadPath.toString());
            // link must be visible before downloading the file
            session.evaluate("document.querySelector(\"code\").scrollIntoView()");
            // click the download link
            session.click("code");
            session.wait(2000 * 200);
        }
    }
}
