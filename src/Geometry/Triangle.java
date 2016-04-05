/**
 * 
 */
package Geometry;

/**
 * @author Alex Dutton
 *
 */
public class Triangle extends Polygon{
	public final Point A;
	public final Point B;
	public final Point C;
	public final double AB;
	public final double BC;
	public final double CA;
	public final double AngleA;
	public final double AngleB;
	public final double AngleC;
	public final LineSegment Hypotenuse;
	public final double Base;
	public final double Height;
	/**
	 * creates a Triangle using 3 points as the tip, right, and left corner of the triangle
	 * @param a Point
	 * @param b Point
	 * @param c Point
	 * @throws Exception if any of the Points are equal
	 */
	public Triangle (Point a, Point b, Point c) throws Exception{
		super(new Point[] {a,b,c});
		if (a.equals(b)||a.equals(c)||b.equals(c))
			throw new Exception ("Not a Valid Triangle!");
		A=a;
		B=b;
		C=c;
		AB= Points.distance(A, B);
		BC = Points.distance(B, C);
		CA = Points.distance(C, A);
		AngleA = Math.toDegrees(Math.acos((AB*AB+CA*CA-BC*BC)/(2*CA*AB)));
		AngleB = Math.toDegrees(Math.acos((AB*AB+BC*BC-MathX.square(CA))/(2*BC*AB)));
		AngleC= Math.toDegrees(Math.acos((BC*BC+CA*CA-AB*AB)/(2*BC*CA)));
		double[] AllSides = {CA, BC, AB};
		Base = MathX.max(AllSides);
		if (Base == AB){
			Hypotenuse = new LineSegment(A,B);
			
			Height = new Line(Hypotenuse).distanceToPoint(C);
			System.out.println(Hypotenuse);
			System.out.println(new Line(Hypotenuse));
			System.out.println(C);
		} else if (Base == CA){
			Hypotenuse = new LineSegment(C,A);
			Height = new Line(Hypotenuse).distanceToPoint(B);
		} else {
			Hypotenuse = new LineSegment(B,C);
			Height = new Line(Hypotenuse).distanceToPoint(A);
		}
	}
	/**
	 * creates a Triangle using 6 integers which are used as the x and ys of the Points of the tip,left and right corners of the Triangle
	 * @param x
	 * @param y
	 * @param x2
	 * @param y2
	 * @param x3
	 * @param y3
	 * @throws Exception if any of the Points are equal
	 */
	public Triangle (double x,double y,double x2,double y2,double x3,double y3) throws Exception{
		this(new Point(x,y) , new Point (x2,y2), new Point (x3,y3));
	}
	public String toString (){
		return "Triangle [A: "+A+", B: "+B+", C: "+C+", Side-AB: "+AB+", Side-BC: "+BC+", Side-CA: "+CA+", Angle-A: "+AngleA+", Angle-B: "+AngleB+", Angle-C: "+AngleC+"]";
	}
}
