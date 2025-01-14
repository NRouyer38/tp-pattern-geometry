package org.acme.geometry;

public class Point implements Geometry{
	
    private Coordinate coordinate;

    public Point() {
        this.coordinate = new Coordinate();
    }

    public Point(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    @Override
    public String getType() {
        return "Point";
    }

    @Override
    public boolean isEmpty() {
        return Double.isNaN(coordinate.getX());
    }

    @Override
    public void translate(double dx, double dy) {
        this.coordinate = new Coordinate(
            coordinate.getX() + dx,
            coordinate.getY() + dy
            );
    }

    @Override
    public Point clone(){
        return new Point (coordinate);
    }

    @Override
	public Envelope getEnvelope() {
		EnvelopeBuilder builder = new EnvelopeBuilder();
		builder.insert(this.coordinate);
		return builder.build();
	}

    public void accept(GeometryVisitor visitor) {
        visitor.visit(this);
    }
}
