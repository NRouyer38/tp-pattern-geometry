package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor(){
		Point p = new Point();
		Assert.assertEquals(Double.NaN, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(Double.NaN, p.getCoordinate().getY(), EPSILON);
	}

	@Test
	public void testConstructor(){
		Point p = SampleFactory.createPointA();
		Assert.assertEquals(6.9, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(3.8, p.getCoordinate().getY(), EPSILON);
	}

    @Test
    public void testType() {
		Point p = new Point();
        Assert.assertEquals("Point", p.getType());
    }

	@Test
	public void testEmpty(){
		Point p = new Point();
		Assert.assertTrue(p.isEmpty());
	}

	@Test
	public void testTranslate(){
		Point p = SampleFactory.createPointA();
		p.translate(1.0, 1.0);
		Assert.assertEquals(7.9, p.getCoordinate().getX(), EPSILON);
	}

	@Test
	public void testClone(){
		Point p = SampleFactory.createPointA();
		Point newPoint = p.clone();
		Assert.assertEquals(6.9, newPoint.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(3.8, newPoint.getCoordinate().getY(), EPSILON);
	}

	@Test
    public void testGetEnvelope() {
        Point p = SampleFactory.createPointA();
        Envelope envelope = p.getEnvelope();
        Assert.assertEquals(6.9, envelope.getXmax(), EPSILON);
        Assert.assertEquals(3.8, envelope.getYmax(), EPSILON);
    }
}