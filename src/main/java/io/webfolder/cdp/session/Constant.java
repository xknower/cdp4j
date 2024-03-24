package io.webfolder.cdp.session;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * 常量
 */
public interface Constant {

    List<String> DOM_PROPERTIES = asList("checked", "disabled", "selectedIndex");

    int TAB = 9;
    int ENTER = 13;
    int ESC = 27;
    int BACKSPACE = 46;
    int LEFT_ARROW = 37;
    int UP_ARROW = 38;
    int RIGHT_ARROW = 39;
    int DOWN_ARROW = 40;

    List<Integer> SPECIAL_KEYS = asList(
            TAB, ENTER,
            BACKSPACE, LEFT_ARROW,
            UP_ARROW, RIGHT_ARROW,
            DOWN_ARROW, ESC
    );

    Integer EMPTY_NODE_ID = 0;

    Object[] EMPTY_ARGS = new Object[]{};

    int WAIT_TIMEOUT = 10 * 1000; // 10 seconds

    int WAIT_PERIOD = 100; // 0.1 seconds

}
