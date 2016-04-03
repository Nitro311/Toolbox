/**
 * 
 */
package Geometry;

/**
 * @author Alex Dutton
 *
 */
public class Triangle {
	public Point A;
	public Point B;
	public Point C;
	public double AB;
	public double BC;
	public double CA;
	public double AngleA;
	public double AngleB;
	public double AngleC;
	public LineSegment Hypotenuse;
	public double Base;
	public double Height;
	public Triangle (Point a, Point b, Point c) throws Exception{
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
	public Triangle (double x,double y,double x2,double y2,double x3,double y3) throws Exception{
		this(new Point(x,y) , new Point (x2,y2), new Point (x3,y3));
	}
	public String toString (){
		return "Triangle [A: "+A+", B: "+B+", C: "+C+", Side-AB: "+AB+", Side-BC: "+BC+", Side-CA: "+CA+", Angle-A: "+AngleA+", Angle-B: "+AngleB+", Angle-C: "+AngleC+"]";
	}
	public double area(){
		double semi = (AB+BC+CA) /2;
		
		return Math.sqrt(semi*(semi-AB)*(semi - BC)*(semi-CA));
		
	}
	public double perimeter(){
		return AB+CA+BC;
		
	}
}
