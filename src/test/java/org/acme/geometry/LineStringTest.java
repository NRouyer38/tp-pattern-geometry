package org.acme.geometry;

import java.util.List;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {

	public static final double EPSILON = 1.0e-15;

	public static Point createPointO() {
		return new Point(new Coordinate());
	}

	public static Point createPointA() {
		return new Point(new Coordinate(6.9, 3.8));
	}

	@Test
	public void testDefaultConstructor() {

		LineString aLine = new LineString();
		Assert.assertEquals(0, aLine.getNumPoints());
	}

	@Test
	public void testConstructor() {

		List<Point> points = new ArrayList<Point>();
		points.add(createPointA());
		LineString aLine = new LineString(points);
		Assert.assertEquals(1, aLine.getNumPoints());
	}

	@Test
	public void getTypeMethod() {

		LineString aLine = new LineString();
		Assert.assertEquals("LineString", aLine.getType());
	}

	@Test
	public void getNumPointsMethod() {

		List<Point> points = new ArrayList<Point>();
		points.add(createPointO());
		points.add(createPointA());
        points.add(createPointA());
		LineString aLine = new LineString(points);
		Assert.assertEquals(3, aLine.getNumPoints(), EPSILON);
	}

	@Test
	public void getPointNMethod() {

		List<Point> points = new ArrayList<Point>();
		points.add(createPointO());
		points.add(createPointA());
		LineString aLine = new LineString(points);
		Assert.assertEquals(6.9, aLine.getPointN(1).getCoordinate().getX(), EPSILON);
        Assert.assertEquals(3.8, aLine.getPointN(1).getCoordinate().getY(), EPSILON);
	}

}