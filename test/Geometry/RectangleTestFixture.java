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
public class RectangleTestFixture {

	@Test
	public void rectangleTest() throws Exception {
		Rectangle righty = new Rectangle(0, 0, 3, 4);
		
		assertEquals(4.0, righty.Height, 0);
		assertEquals(3.0, righty.Width, 0);
		assertEquals(5.0, righty.diagonalDistance(), 0);
		assertEquals(12.0, righty.area(), 0);
		assertEquals(14.0, righty.perimeter(), 0);
		
		
	}
	@Test (expected = Exception.class)
	public void execptionRectangleTest() throws Exception{
		Rectangle straight = new Rectangle (0,0,0,1);
	}
}