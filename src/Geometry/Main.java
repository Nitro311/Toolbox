package Geometry;
import java.io.IOException;

import Challenges.Array;
public class Main {
	public static void main(String[] args) throws Exception {
		int[] data = new int[] { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		System.out.println(new Rectangle(0,10,20,20).center());
		//System.out.println(MathX.leapyear(100));
		RectangleTests();
		Line l = new Line(new LineSegment(new Point(0, 5),new Point(0,10)));
		System.out.println(l);
		System.out.println(l.contains(new Point (0,5)));
		//new LineSegment(new Point(0,0),new Point(0,0));
		System.out.println(new Circle(new LineSegment(new Point(0,0),new Point(5,0))).perimeter());
		System.out.println(new Circle(5).equals(new Circle (2)));
		System.out.println(new Line(0,0,1,1));
		System.out.println(new Line(0,0,0,1));
		System.out.println(new Line(0,0,1,1).intercept(new Line (5,0,5,1)));
		System.out.println(new Line(5,0,5,1).intercept(new Line (0,0,1,1)));
		System.out.println(Rectangle.fromTRBL(3, 5, 0, 0));
		//System.out.println(new Triangle(0,0,0,0,0,0).Height);
		//System.out.println(new Line(1,0).distanceToPoint(new Point(5,-5)));
		System.out.println(new Line(0,0,0,5).distanceToPoint(new Point(5,-5)));
		
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
