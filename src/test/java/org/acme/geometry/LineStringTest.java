package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {

	public static final double EPSILON = 1.0e-15;

	@Test
	public void testDefaultConstructor() {
		LineString aLine = new LineString();
		Assert.assertEquals(0, aLine.getNumPoints());
	}

	@Test
	public void testType() {
		LineString aLine = new LineString();
		Assert.assertEquals("LineString", aLine.getType());
	}

	@Test
	public void testNumPoints() {
		LineString aLine = SampleFactory.createLineStringOA();
		Assert.assertEquals(2, aLine.getNumPoints(), EPSILON);
	}

	@Test
	public void testPointN() {
		LineString aLine = SampleFactory.createLineStringOA();
		Assert.assertEquals(6.9, aLine.getPointN(1).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(3.8, aLine.getPointN(1).getCoordinate().getY(), EPSILON);
	}

	@Test
	public void testEmpty() {
		LineString l = new LineString();
		Assert.assertTrue(l.isEmpty());
	}

	@Test
	public void testTranslate(){
		LineString aLine = SampleFactory.createLineStringOA();
		aLine.translate(1.0, 1.0);
		Assert.assertEquals(1.0, aLine.getPointN(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(7.9, aLine.getPointN(1).getCoordinate().getX(), EPSILON);
	}
}