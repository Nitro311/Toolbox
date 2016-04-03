package Geometry;
/**
 * Used to create a Rectangle using points
 * @author Alex Dutton
 *
 */
public class Rectangle extends Shape2D {
	public final Point LowerLeft;
	public final Point UpperRight;
	public final double Height;
	public final double Width;
	public Rectangle (double x1, double y1 , double x2, double y2) throws Exception{
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
		this.LowerLeft = new Point (LeftestX, LowestY);
		this.UpperRight = new Point (RightestX, HighestY);
		this.Height = HighestY - LowestY;
		this.Width = RightestX - LeftestX;
	}
	public Rectangle (Point a, Point b) throws Exception
	{
		this(a.X, a.Y, b.X, b.Y);
	}
	public Rectangle (LineSegment a) throws Exception
	{
		this(a.Start, a.End);
	}
	public static Rectangle fromTRBL(double top,double right,double bottom,double left) throws Exception{
		return new Rectangle (left,top,right,bottom);
	}
	public double area (){
		return Height*Width;
		
	}
	public double diagonalDistance (){
		return Math.sqrt(MathX.square(Height)+MathX.square(Width));
		
	}
	public double perimeter(){
		return Height * 2 + Width * 2;
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
	
	public String toString(){
		return "Rectangle[" + this.LowerLeft + " " + this.UpperRight + "]";
		
	}
	public boolean equals(Object obj){
		if (!(obj instanceof Rectangle))
			return false;
		if (this == obj)
			return true;
		
		Rectangle other = (Rectangle) obj;
		if (other == null)
			return false;
		
		return this.Width == other.Width && this.Height == other.Height;
	}
}


