package Geometry;
/**
 * a line segment is a part of a 
 * line that is bounded by two distinct 
 * end points, and contains every point 
 * on the line between its endpoints. 
 * A closed line segment includes both 
 * endpoints, while an open line segment 
 * excludes both endpoints; a half-open 
 * line segment includes exactly one of 
 * the endpoints.
 * @author Alex Dutton
 *
 */
public class LineSegment {
	public final Point Start;
	public final Point End;
	
	public LineSegment(Point start, Point end) throws Exception
	{
		if (start.equals(end))
			throw new Exception ("Start and End must be different");
		Start = start;
		End = end;
	}
	
	public Point midpoint(){
		return new Point((Start.X+End.X)/2, (Start.Y+End.Y)/2);
	}
	public double distance(){
		double xDistance = Start.X - End.X;
		double yDistance = Start.Y - End.Y;
		double hypotenuse = Math.sqrt(MathX.square (xDistance) + MathX.square(yDistance));
		return hypotenuse;
	}
	public static double distance(Point Start, Point End){
		double xDistance = Start.X - End.X;
		double yDistance = Start.Y - End.Y;
		double hypotenuse = Math.sqrt(MathX.square (xDistance) + MathX.square(yDistance));
		return hypotenuse;
	}
	public static double slope(Point Start, Point End){
		if (Start.X-End.X == 0)
			return Double.NaN;
		double slope = (Start.Y-End.Y)/(Start.X-End.X)  ;
		return slope;
		
	}
	public double slope(){
		if (Start.X-End.X == 0)
			return Double.NaN;
		double slope = (Start.Y-End.Y)/(Start.X-End.X)  ;
		return slope;
	}
	public boolean equals(Object obj){
		if (!(obj instanceof LineSegment))
			return false;
		if (this == obj)
			return true;
		
		LineSegment other = (LineSegment) obj;
		if (other == null)
			return false;
		
		return this.Start == other.Start && this.End == other.End;
	}
	public String toString (){
		return "Line Segment [Start: "+Start+", End: "+End+"]";
	}
}
