package Geometry;

/**
 * Used to define a point in space
 * @author Alex Dutton
 * 
 */
public class Point {
	final double X;
	final double Y;
	
	public Point(double x, double y) {
		X = x;
		Y=y;
	}
	public String toString(){
		return "("+ X + "," + Y + ")";
		
	}
	
	public static final Point Origin = new Point(0,0);
}
