package Geometry;
import java.io.IOException;

import Challenges.Array;
public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println(new Triangle(2,3,4,5,6,7));
	}
	
	public static void RectangleTests() throws Exception {
		Rectangle righty = new Rectangle(0, 0, 3, 4);
		
		AreEqual(4.0, righty.Height);
		AreEqual(3.0, righty.Width);
		AreEqual(5.0, righty.diagonalDistance());
		AreEqual(12.0, righty.area());
		AreEqual(14.0, righty.perimeter());
	}
	
	public static void AreEqual(double expected, double actual) throws Exception {
		if (actual != expected)
			throw new Exception(String.format("Actual %f doesn't match expected %f", actual, expected));
	}
}
