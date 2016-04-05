package Geometry;
/**
 *
 * @author Alex Dutton
 *
 */
public class LineSegment {
	public final Point Start;
	public final Point End;
	/**
	 * creates a LineSegement using two points as the start and the end
	 * @param start Point
	 * @param end Point
	 * @throws Exception if the start and end Points are the same
	 */
	public LineSegment(Point start, Point end) throws Exception
	{
		if (start.equals(end))
			throw new Exception ("Start and End must be different");
		Start = start;
		End = end;
	}
	/**
	 * creates a LineSegment using 4 integers used to create 2 Points as the start and end of the segment 
	 * @param x
	 * @param y
	 * @param x2
	 * @param y2
	 * @throws Exception
	 */
	public LineSegment(double x, double y, double x2, double y2) throws Exception
	{
		this(new Point (x,y), new Point (x2,y2));
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
	public LineSegment divide (double a) throws Exception{
		return new LineSegment((Start.X/a),(Start.Y/a),(End.X/a),(End.Y / a));
	}
	public LineSegment subtract (LineSegment a) throws Exception{
		return new LineSegment((Start.X-a.Start.X),(Start.Y-a.Start.Y),(End.X- a.End.X),(End.Y - a.End.Y));
	}
	public LineSegment multiply (double a) throws Exception{
		return new LineSegment((Start.X*a),(Start.Y*a),(End.X* a),(End.Y * a));
	}
	public LineSegment add (LineSegment a) throws Exception{
		return new LineSegment((Start.X),(Start.Y),(End.X+ a.End.X - a.Start.X),(End.Y + a.End.Y- a.Start.Y));
		
	}
}
