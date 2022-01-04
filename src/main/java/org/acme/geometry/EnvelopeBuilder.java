package org.acme.geometry;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class EnvelopeBuilder {

    List<Double> xVals = new ArrayList<Double>();
    List<Double> yVals = new ArrayList<Double>();

    public void insert(Coordinate coordinate)  {
        xVals.add(coordinate.getX());
        yVals.add(coordinate.getY());
    }

    public Envelope build() {
        double xMin = Collections.min(xVals);
        double yMin = Collections.min(yVals);
        double xMax = Collections.max(xVals);
        double yMAx = Collections.max(yVals);
        Coordinate bottomLeft = new Coordinate(xMin,yMin);
        Coordinate topRight = new Coordinate(xMax, yMAx);
        return new Envelope(bottomLeft,topRight);
    }



}
