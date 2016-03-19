package Geometry;

public class LineSegment {
	public final Point Start;
	public final Point End;
	
	public LineSegment(Point start, Point end)
	{
		Start = start;
		End = end;
	}
	
	public Point midpoint(){
		return new Point((Start.X+End.X)/2, (Start.Y+End.Y)/2);
	}
	public static double distance(Point Start, Point End){
		double xDistance = Start.X - End.X;
		double yDistance = Start.Y - End.Y;
		double hypotenuse = Math.sqrt(MathX.square (xDistance) + MathX.square(yDistance));
		System.out.println(xDistance);
		System.out.println(yDistance);
		return hypotenuse;
	}
	public static double slope(Point Start, Point End){
		double slope = (Start.Y-End.Y)/(Start.X-End.X)  ;
		return slope;
		
	}
}
