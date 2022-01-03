package org.acme.geometry;

public class Coordinate {

    private double x = 0.0;
    private double y = 0.0;

    public double getX () {
        return x;
    }

    public double getY () {
        return y;
    }

    //method coordinate
    public Coordinate() {
    	this.x = 0.0;
    	this.y = 0.0;
    	}
    
    public Coordinate(double x, double y) {
    	this.x = x;
    	this.y = y;
    	}
}
