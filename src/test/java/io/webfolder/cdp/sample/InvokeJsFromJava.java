package io.webfolder.cdp.sample;

import io.webfolder.cdp.JsFunction;
import io.webfolder.cdp.Launcher;
import io.webfolder.cdp.session.Session;
import io.webfolder.cdp.session.SessionFactory;

import java.util.List;

import static io.webfolder.cdp.session.WaitUntil.DomContentLoad;
import static java.nio.file.Paths.get;
import static java.util.Arrays.asList;

public class InvokeJsFromJava {

    public static interface MyJsFunction {

        @JsFunction("let attributes = []; document.querySelectorAll(selector).forEach(e => { attributes.push(e.getAttribute(attributeName)); }); return attributes;")
        List<String> listAttributes(String selector, String attributeName);

        @JsFunction("")
        void dummy();

        @JsFunction("console.error(message);")
        void consoleError(String message);

        @JsFunction("return a + b")
        int sum(int a, int b);

        @JsFunction("return str1 + str2")
        String concat(String str1, String str2);

        @JsFunction("let list = []; numbers.forEach(i => list.push(i + inc)); return list;")
        List<Double> increment(List<Integer> numbers, int inc);
    }

    public static void main(String[] args) {
        Launcher launcher = new Launcher();

        String uri = get("src/test/resources/js-function-test.html").toAbsolutePath().toUri().toString();

        try (SessionFactory factory = launcher.launch(); Session session = factory.create()) {
            // Important!
            // Register the JsFunction before the navigate method
            session.registerJsFunction(MyJsFunction.class);
            session.enableConsoleLog();
            session.navigateAndWait(uri, DomContentLoad);
            MyJsFunction utility = session.getJsFunction(MyJsFunction.class);
            List<String> attributes = utility.listAttributes("img", "src");
            System.out.println(attributes);

            utility.dummy();
            utility.consoleError("panic!");

            System.out.println(utility.sum(2, 2));

            System.out.println(utility.concat("foo", "bar"));

            List<Double> list = utility.increment(asList(0, 1, 2, 3), 1);
            System.out.println(list);
            session.wait(500);
        }
    }
}
