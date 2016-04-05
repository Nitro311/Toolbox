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
public class TriangleTestFixture {

	@Test
	public void testTriangle() throws Exception {
		Triangle test = new Triangle (0,0,4,3,4,0);
		assertEquals(6, test.area(), 0);
		assertEquals(12, test.perimeter(), 0);
	}

}
