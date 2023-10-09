package io.webfolder.cdp.sample;

import io.webfolder.cdp.Launcher;
import io.webfolder.cdp.session.Option;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.session.SessionFactory;

public class BingTranslator {

    public static void main(String[] args) {
        Launcher launcher = new Launcher();

        try (SessionFactory factory = launcher.launch();
             Session session = factory.create()) {
            session
                    .navigate("https://www.bing.com/translator")
                    .waitDocumentReady()
                    .enableConsoleLog()
                    .enableDetailLog()
                    .enableNetworkLog();

            Option en = session
                    .getOptions("#t_sl")
                    .stream()
                    .filter(p -> "en".equals(p.getValue()))
                    .findFirst()
                    .get();

            Option et = session
                    .getOptions("#t_tl")
                    .stream()
                    .filter(p -> "et".equals(p.getValue()))
                    .findFirst()
                    .get();

            session
                    .click("#t_sl") // click source language
                    .wait(500)
                    .setSelectedIndex("#t_sl", en.getIndex()) // choose English
                    .wait(500)
                    .click("#t_tl") // click destination language
                    .wait(500)
                    .setSelectedIndex("#t_tl", et.getIndex()) // choose Estonian
                    .wait(500);

            session.focus("#t_sv")
                    .sendKeys("hello world")
                    .wait(1000);

            System.out.println(session.getValue("#t_tv"));
        }
    }
}
