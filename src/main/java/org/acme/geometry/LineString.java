package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry{
	
    private List<Point> points;

    public LineString() {
        this.points = new ArrayList<Point>();
    }

    public LineString(List<Point> points) {
        this.points = points;
    }
    
    public int getNumPoints(){
        return points.size();
    }

    public Point getPointN(int n){
        return points.get(n);
    }

    @Override
    public String getType() {
        return "LineString";
    }

    @Override
    public boolean isEmpty() {
        return this.points.isEmpty();
    }

    @Override
    public void translate(double dx, double dy) {
        for (Point point : points){
            point.translate(dx, dy);
        }
    }

    @Override
    public LineString clone(){
        List<Point> newPoint = new ArrayList<>(getNumPoints());
        for (Point point : points) {
            newPoint.add(point.clone());
        }
        return new LineString(newPoint);
    }

    @Override
	public Envelope getEnvelope() {
		EnvelopeBuilder builder = new EnvelopeBuilder();
		for(Point point : this.points) {
			builder.insert(point.getCoordinate());
		}
		return builder.build();
	}
}