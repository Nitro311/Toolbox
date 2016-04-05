package Geometry;

/**
 * Used to define a point in space
 * @author Alex Dutton
 * 
 */
public class Point {
	final double X;
	final double Y;
	/**
	 * creates a Point using 2 integers as the X and Y
	 * @param x
	 * @param y
	 */
	public Point(double x, double y) {
		X = x;
		Y=y;
	}
	/**
	 * Converts a point to a string for displaying
	 */
	public String toString(){
		return "("+ X + "," + Y + ")";
	}
	/**
	 * Checks if one point is equal to another
	 * @return a boolean answer
	 */
	public boolean equals(Object obj){
		if (!(obj instanceof Point))
			return false;
		if (this == obj)
			return true;
		
		Point other = (Point) obj;
		if (other == null)
			return false;
		
		return this.X == other.X && this.Y == other.Y;
	}
}
