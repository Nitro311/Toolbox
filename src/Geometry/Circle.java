package Geometry;
/**
 * Creates a Circle
 * a round plane figure whose boundary 
 * (the circumference) consists of points 
 * equidistant from a fixed point (the center).
 * @author Alex Dutton
 *
 */
public class Circle extends Shape2D {
	public final double Diameter;
	public final double Radius;
	public final Point Center;
	/**
	 * creates a Circle using the diameter and the center point of the Circle 
	 * @param diameter
	 * @param center point
	 * @throws Exception if the Circle has a diameter of 0
	 */
	public Circle (double diameter, Point center) throws Exception{
		if (diameter == 0){
			throw new Exception ("a circle can't have a diameter of 0");
		}
		Diameter = diameter;
		Radius = diameter/2;
		Center = center;
	}
	/**
	 * creates a Circle using just the diameter stating at the Origin
	 * @param requires the diameter
	 * @throws Exception if the Circle has a diameter of 0
	 */
	public Circle (double diameter) throws Exception{
		this(diameter, Points.Origin);
	}
	/**
	 * creates a Circle using 2 Points which is used to create a LineSegment 
	 * which is used as the diameter
	 * @param requires 2 Points
	 * @throws Exception if the Circle has a diameter of 0
	 */
	public Circle (Point a, Point b) throws Exception{
		this(new LineSegment (a,b));
	}
	/**
	 * creates a Circle using a LineSegment for the diameter
	 * @param requires LineSegment
	 * @throws Exception if the Circle has a diameter of 0
	 */
	public Circle (LineSegment a) throws Exception{
		this(a.distance(), a.midpoint());
	}
	public double perimeter(){
		return Diameter*Math.PI;
	}
	public double circumference(){
		return perimeter();
	}
	public double area(){
		return MathX.square(Radius)* Math.PI;
	}
	public String toString(){
		return "Circle[ Radius "+Radius+", Center Point "+Center.toString()+"]";
	}
	public boolean equals(Object obj){
		if (!(obj instanceof Circle))
			return false;
		if (this == obj)
			return true;
		
		Circle other = (Circle)obj;
		if (other == null)
			return false;
		
		return this.Radius == other.Radius && this.Center == other.Center;
	}
}
