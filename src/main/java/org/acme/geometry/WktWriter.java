package org.acme.geometry;

public class WktWriter {
    public WktWriter(){
    }
    public String write(Geometry geometry) {

        String WKT = "";

        if ( geometry instanceof Point ){
            Point point = (Point)geometry;
            if (point.isEmpty()) {
            	WKT = "POINT EMPTY";
            }
            else {
            	WKT = "POINT(" +
                point.getCoordinate().getX() +
                " " + point.getCoordinate().getY() +
                ")";
            }
        }else if ( geometry instanceof LineString ){
            LineString lineString = (LineString)geometry;
            // traiter le cas LineString
            if (lineString.isEmpty()) {
            	WKT = "LINESTRING EMPTY";
            }
            else {
                WKT = "LINESTRING(";
                
                for (int i = 0; i < lineString.getNumPoints(); i++){
                    Point p = lineString.getPointN(i);
                    WKT += 
                    p.getCoordinate().getX() +
                    " " +
                    p.getCoordinate().getY() +
                    ","
                    ;
                }
                WKT = WKT.substring(0, WKT.length()-1) + ")";
            }
        }else{
            throw new RuntimeException("geometry type not supported");
        }
        return WKT;
    }
}
