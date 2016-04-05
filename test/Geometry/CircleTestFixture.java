/*
 * 
 */
package Geometry;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Alex Dutton
 *
 */
public class CircleTestFixture {
	public void circleTest() throws Exception {
		Circle righty = new Circle(5);
		assertEquals(2.5, righty.Radius, 0);
		assertEquals(new Point (0,0).X, righty.Center.X , 0);
		assertEquals(new Point (0,0).Y, righty.Center.Y , 0);
		
	}
	@Test (expected = Exception.class)
	public void execptionCircleTest() throws Exception{
		Circle straight = new Circle (0);
	}
}
