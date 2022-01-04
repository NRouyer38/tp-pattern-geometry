package org.acme.geometry;

import java.util.List;
import java.util.ArrayList;

public class EnvelopeBuilder {

    private List<Double> xVals;
    private List<Double> yVals;

    public EnvelopeBuilder() {
        this.xVals = new ArrayList<Double>();
        this.yVals = new ArrayList<Double>();
    }

}
