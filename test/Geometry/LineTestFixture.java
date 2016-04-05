/**
 * 
 */
package Geometry;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Alex Dutton
 *
 */
public class LineTestFixture {

	@Test
	public void testPerpendicular() throws Exception {
		Line vertical = new Line(0,0, 0, 5);
		Line horizontal = new Line(0, 0, 5, 0);
		Line withSlope = new Line(0, 0, 1, 2);
		Line perpSlope = new Line(0, 0, -2, 1);
		Line failSlope = new Line(0, 0, 1, 1);
		Line paralellSlope = new Line(0, 1, 1, 3);
		
		assertTrue(vertical.isPerpendicular(horizontal));
		assertTrue(horizontal.isPerpendicular(vertical));
		
		assertTrue(withSlope.isPerpendicular(perpSlope));
		assertTrue(perpSlope.isPerpendicular(withSlope));

		assertFalse(withSlope.isPerpendicular(vertical));
		assertFalse(withSlope.isPerpendicular(horizontal));
		assertFalse(withSlope.isPerpendicular(failSlope));
		assertFalse(withSlope.isPerpendicular(paralellSlope));
	}
	@Test
	public void testParallelAndIntersect() throws Exception{
		Line vertical = new Line(0,0, 0, 5);
		Line horizontal = new Line(0, 0, 5, 0);
		Line withSlope = new Line(0, 0, 1, 2);
		Line perpSlope = new Line(0, 0, -2, 1);
		Line failSlope = new Line(0, 0, 1, 1);
		Line paralellSlope = new Line(0, 1, 1, 3);
		Line vertical2 = new Line(1,0, 1, 5);
		Line horizontal2 = new Line(0, 1, 5, 1);
		assertTrue(vertical.isParallel(vertical2));
		assertTrue(horizontal.isParallel(horizontal2));
		assertTrue(withSlope.isParallel(paralellSlope));
		
		assertFalse(vertical.isIntercept(vertical2));
		assertFalse(horizontal.isIntercept(horizontal2));
		assertFalse(withSlope.isIntercept(paralellSlope));

		assertTrue(withSlope.isIntercept(perpSlope));
		assertFalse(perpSlope.isParallel(withSlope));
	}

}
