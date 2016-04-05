import static org.junit.Assert.*;

import org.junit.Test;

import Geometry.Line;
import Geometry.Rectangle;

public class RectangleTest {
	@Test
	public void stuffWorksTest() throws Exception {
		Rectangle righty = new Rectangle(0, 0, 3, 4);
		
		assertEquals(4.0, righty.Height, 0);
		assertEquals(3.0, righty.Width, 0);
		assertEquals(5.0, righty.diagonalDistance(), 0);
		assertEquals(12.0, righty.area(), 0);
		assertEquals(14.0, righty.perimeter(), 0);
		
		
	}
	
	@Test(expected = Exception.class)
	public void lineCannotBeMadeOfSamePoints() throws Exception {
		new Line(0,0, 0,0);
	}

	@Test
	public void testPerimeter() {
		fail("Not yet implemented");
	}

	@Test
	public void testRectangleDoubleDoubleDoubleDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testRectanglePointPoint() {
		fail("Not yet implemented");
	}

	@Test
	public void testRectangleLineSegment() {
		fail("Not yet implemented");
	}

	@Test
	public void testFromTRBL() {
		fail("Not yet implemented");
	}

	@Test
	public void testDiagonalDistance() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsSquare() {
		fail("Not yet implemented");
	}

	@Test
	public void testCenter() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

}
