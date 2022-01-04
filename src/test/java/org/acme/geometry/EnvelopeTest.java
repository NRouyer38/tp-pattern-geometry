package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnvelopeTest {
	
	public static final double EPSILON = 1.0e-15;

	@Test
	public void testConstructor(){
		Envelope envelope = new Envelope(
            new Coordinate(3.8, 6.9),
            new Coordinate(7.3, 7.4)
            );
	
		Assert.assertEquals(3.8, envelope.getXmin(), EPSILON);
		Assert.assertEquals(6.9, envelope.getYmin(), EPSILON);
		Assert.assertEquals(7.3, envelope.getXmax(), EPSILON);
		Assert.assertEquals(7.4, envelope.getYmax(), EPSILON);
	}
}