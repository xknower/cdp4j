package io.webfolder.cdp.session;

import io.webfolder.cdp.command.Input;
import io.webfolder.cdp.type.util.Point;

import static io.webfolder.cdp.type.constant.MouseButtonType.Left;
import static io.webfolder.cdp.type.constant.MouseEventType.MouseMoved;
import static io.webfolder.cdp.type.constant.MouseEventType.MousePressed;
import static io.webfolder.cdp.type.constant.MouseEventType.MouseReleased;
import static java.lang.String.format;

/**
 * Interface representing basic mouse operations.
 */
public interface Mouse {

    /**
     * Click on the specified element.
     * <p>
     * There are some preconditions for an element to be clicked.
     * The element must be visible and it must have a height and width greater then 0.
     *
     * @param selector css or xpath selector
     * @return this
     */
    default Session click(final String selector) {
        return click(selector, Constant.EMPTY_ARGS);
    }

    /**
     * Click on the specified element.
     * <p>
     * There are some preconditions for an element to be clicked. The element
     * must be visible and it must have a height and width greater then 0.
     *
     * @param selector css or xpath selector
     * @param args     format string
     * @return this
     */
    default Session click(final String selector, final Object... args) {
        getThis().logEntry("click", format(selector, args));
        getThis().scrollIntoViewIfNeeded(selector, args);
        Point point = getThis().getClickablePoint(selector, args);
        int clickCount = 1;
        Input input = getThis().getCommand().getInput();
        input.dispatchMouseEvent(MousePressed, point.x, point.y, null, null, Left, clickCount, null, null);
        input.dispatchMouseEvent(MouseReleased, point.x, point.y, null, null, Left, clickCount, null, null);
        return getThis();
    }

    /**
     * Dispatches a mousemove event.
     *
     * @param x X coordinate of the event relative to the main frame's viewport in CSS pixels.
     * @param y Y coordinate of the event relative to the main frame's viewport in CSS pixels. 0 refers to
     *          the top of the viewport and Y increases as it proceeds towards the bottom of the viewport.
     * @return this
     */
    default Session move(double x, double y) {
        Input input = getThis().getCommand().getInput();
        input.dispatchMouseEvent(MouseMoved, x, y);
        return getThis();
    }

    Session getThis();
}
