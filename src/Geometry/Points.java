package Geometry;
/**
 * Used to place multiple points in space
 * @author Alex Dutton
 *
 */
final class Points {
	public static Point midpoint (Point a, Point b){
		return new Point((a.X+b.X)/2, (a.Y+b.Y)/2);
	}
	public static double distance(Point a, Point b){
		double xDistance = a.X - b.X;
		double yDistance = a.Y - b.Y;
		double hypotenuse = Math.sqrt(xDistance*xDistance + yDistance*yDistance);
		System.out.println(xDistance);
		System.out.println(yDistance);
		return hypotenuse;
	}
	public static double slope(Point a, Point b){
		double slope = (a.Y-b.Y)/(a.X-b.X)  ;
		return slope;
		
	}
	
	public static final Point Origin = new Point(0,0);
}
