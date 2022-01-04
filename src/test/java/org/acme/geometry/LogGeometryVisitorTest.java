package org.acme.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LogGeometryVisitorTest {
    private ByteArrayOutputStream os;
    private PrintStream out;

    @Before
    public void setUp() {
        this.os = new ByteArrayOutputStream();
        this.out = new PrintStream(this.os);
    }

    @Test
    public void testPoint(){
        LogGeometryVisitor visitor = new LogGeometryVisitor(out);
        Geometry g = SampleFactory.createPointA();
        g.accept(visitor);

        String aString = os.toString(StandardCharsets.UTF_8);
        Assert.assertEquals("Un point de coordonnee x : 6.9 et y : 3.8", aString.trim());
    }

    @Test
    public void testLine(){
        LogGeometryVisitor visitor = new LogGeometryVisitor(out);
        Geometry g = SampleFactory.createLineStringOAB();
        g.accept(visitor);

        String aString = os.toString(StandardCharsets.UTF_8);
        Assert.assertEquals("Une ligne avec 3 points", aString.trim());
    }
}
