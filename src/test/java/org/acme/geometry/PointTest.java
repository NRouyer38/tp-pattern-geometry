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

		Point p = new Point(new Coordinate(6.9, 3.8));
		Assert.assertEquals(6.9, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(3.8, p.getCoordinate().getY(), EPSILON);
	}

	@Test
	public void getTypeMethod() {

		Point p = new Point();
		Assert.assertEquals(p.getType(), "Point");
	}
}