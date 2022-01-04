package org.acme.geometry;

import java.io.PrintStream;

public class LogGeometryVisitor implements GeometryVisitor{

    private PrintStream out;

    public LogGeometryVisitor() {
        this(System.out);
    }
    public LogGeometryVisitor(PrintStream out) {
        this.out = out;
    }

    public void visit(Point point ){
        out.print("Un point de coordonnee x : " +
            point.getCoordinate().getX() +
            " et y : " +
            point.getCoordinate().getY());
    }
    public void visit(LineString lineString ) {
        out.print("Une ligne avec " +
            lineString.getNumPoints() + " points");
    }
}
