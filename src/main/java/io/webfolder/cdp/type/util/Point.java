package io.webfolder.cdp.type.util;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Point {

    public double x;

    public double y;

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}
