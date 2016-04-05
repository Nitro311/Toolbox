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
public class PolygonTestFixture {

	@Test
	public void testEquals() throws Exception {
		Polygon a = new Polygon (new Point[] {new Point(0,0),new Point(4,3),new Point(4,0)});
		Polygon b = new Polygon (new Point[] {new Point(0,0),new Point(4,3),new Point(4,0)});
		Polygon c = new Polygon (new Point[] {new Point(1,1),new Point(5,4),new Point(5,1)});
		assertEquals(true , a.equals(b));
		assertEquals(false , a.equals(c));
		assertEquals(true , b.equals(a));
		assertEquals(false , c.equals(a));
	}

}
