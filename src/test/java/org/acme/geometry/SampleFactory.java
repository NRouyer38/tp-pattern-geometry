package org.acme.geometry;

import java.util.List;
import java.util.ArrayList;

public class SampleFactory {

    public static Point createPointO(){
        return new Point(new Coordinate(0.0, 0.0));
    }

    public static Point createPointA(){
        return new Point(new Coordinate(6.9, 3.8));
    }

    public static Point createPointB(){
        return new Point(new Coordinate(7.4, 7.3));
    }

    public static LineString createLineStringOA(){
        List<Point> points = new ArrayList<Point>();
        points.add(createPointO());
        points.add(createPointA());
        return new LineString(points);
    }
    
}
