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
	
	public Circle (double diameter, Point center){
		Diameter = diameter;
		Radius = diameter/2;
		Center = center;
	}
	public Circle (double diameter){
		this(diameter, Points.Origin);
	}
	public Circle (Point a, Point b) throws Exception{
		this(new LineSegment (a,b));
	}
	public Circle (LineSegment a){
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
