package Geometry;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//System.out.println ("Hello World");
		//Scanner input = new Scanner( System.in );
		//String s = input.next();
		//System.out.println(s);
		//float x = Float.parseFloat(s);
		//Point p = (x,2.965);
		//System.out.println (p.toString());
		Point p1 = Point.Origin;
		Point p2 = new Point(10, 10);
		LineSegment ls = new LineSegment(p1, p2);
		
		System.out.println (ls.midpoint());
		
		
		System.out.println(Points.distance(new Point(1,6), new Point (2,5)));
		
		
	}

}
