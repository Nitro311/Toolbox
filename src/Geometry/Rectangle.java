package Geometry;
/**
 * Used to create a Rectangle using points
 * @author Alex Dutton
 *
 */
public class Rectangle extends Polygon {
	public final Point LowerLeft;
	public final Point UpperRight;
	public final double Height;
	public final double Width;
	/**
	 * creates a Rectangle using 4 integers as x and ys for 2 Points; the upper left and low left corners of the Rectangle
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @throws Exception if Xs or Ys can't be equal
	 */
	public Rectangle (double x1, double y1 , double x2, double y2) throws Exception{
		super(PointsFromCoords(x1, y1, x2, y2));

		Name = "Rectangle";
		LowerLeft = Verticies[0];
		UpperRight = Verticies[2];
		Height = UpperRight.Y - LowerLeft.Y;
		Width = UpperRight.X - LowerLeft.X;
	}
	/**
	 * creates a Rectangle using the Points as the upper left and low left corners of the Rectangle
	 * @param a
	 * @param b
	 * @throws Exception if Xs or Ys can't be equal
	 */
	public Rectangle (Point a, Point b) throws Exception {
		this(a.X, a.Y, b.X, b.Y);
	}
	/**
	 * creates a Rectangle using a LineSegments start and end Points as the the upper left and low left corners of the Rectangle 
	 * @param LineSegment
	 * @throws Exception if Xs or Ys can't be equal
	 */
	public Rectangle (LineSegment a) throws Exception {
		this(a.Start, a.End);
	}
	public static Rectangle fromTRBL(double top,double right,double bottom,double left) throws Exception{
		return new Rectangle (left,top,right,bottom);
	}
	private static Point[] PointsFromCoords(double x1, double y1 , double x2, double y2) throws Exception {
		if (y2 == y1){
			throw new Exception("Y's are equal");
		}
		if (x2 == x1){
			throw new Exception("X's are equal");
		}
		double HighestY = Math.max(y1, y2);
		double LowestY = Math.min(y1, y2);
		double LeftestX = Math.min(x1, x2);
		double RightestX = Math.max(x1, x2);
		return new Point[] {
			new Point (LeftestX, LowestY),
			new Point (LeftestX, HighestY),
			new Point (RightestX, HighestY),
			new Point (RightestX, LowestY)
		};
	}
	public double diagonalDistance (){
		return Math.sqrt(MathX.square(Height)+MathX.square(Width));
		
	}
	public boolean isSquare (){
		if (Width == Height){
			return true;
		}
		else{
			return false;
		}
	}
	
	public Point center() {
		return new Point((UpperRight.X - LowerLeft.X) / 2.0 + LowerLeft.X, (UpperRight.Y - LowerLeft.Y) / 2.0 + LowerLeft.Y);
	}
}


