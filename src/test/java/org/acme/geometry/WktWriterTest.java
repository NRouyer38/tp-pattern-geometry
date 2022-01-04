
package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class WktWriterTest {
    @Test
    public void testWktPoint(){
        Point p = SampleFactory.createPointA();
        WktWriter aWkt = new WktWriter();
        String WKT = aWkt.write(p);
        Assert.assertEquals("POINT(6.9 3.8)", WKT);
    }

    @Test
    public void testLineStringPoint(){
        LineString aLine = SampleFactory.createLineStringOAB();
        WktWriter aWkt = new WktWriter();
        String WKT = aWkt.write(aLine);
        Assert.assertEquals("LINESTRING(0.0 0.0,6.9 3.8,7.4 7.3)", WKT);
    }
}
