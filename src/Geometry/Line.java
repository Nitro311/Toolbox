package Geometry;
/**
 * Creates a line
 * which a straight or curved continuous extent of length without breadth.
 * 
 * @author Alex Dutton
 *
 */
public class Line {
	public final double Slope;
	public final double YIntercept;
	public final double XIntercept;
	public Line(double slope, double yIntercept) throws Exception{
		if (Double.isNaN(slope))
			throw new Exception ("slope is undefined");
		if (Double.isNaN(yIntercept))
			throw new Exception ("yIntercept is undefined");
		Slope = slope;
		YIntercept = yIntercept;
		if (Slope == 0) {
			XIntercept = Double.NaN;
		}
		else{
			XIntercept = (-1*YIntercept) / Slope;
		}
	}
	
	public Line(LineSegment a){
		Slope = a.slope();
		if (Double.isNaN(Slope)){
			YIntercept = Double.NaN;
			XIntercept = a.Start.X;
		}
		else{
			YIntercept = a.Start.Y - Slope * a.Start.X;	
			if (Slope == 0) {
				XIntercept = Double.NaN;
			}
			else{
				XIntercept = (-1*YIntercept) / Slope;
			}
		}
		
	}
	public Line (Point a, Point b) throws Exception{
		this(new LineSegment (a,b));
	}
	public Line (double x,double y,double x2,double y2) throws Exception{
		this(new Point (x,y), new Point (x2,y2));
	}
	public String toString(){
		return "Line[Slope "+Slope+", Y-Intercept "+YIntercept+", X-Intercept "+XIntercept+"]";
	}
	public boolean contains(Point p){
		if (Double.isNaN(Slope)){
			return p.X == XIntercept;
		}
		
		if (p.X*Slope+YIntercept == p.Y)
			return true;
		return false;
	}
	public boolean equals(Object obj){
		if (!(obj instanceof Line))
			return false;
		if (this == obj)
			return true;
		
		Line other = (Line) obj;
		if (other == null)
			return false;
		
		return this.YIntercept == other.YIntercept && this.XIntercept == other.XIntercept && this.Slope == other.Slope;
	}
	public LineSegment toLineSegment(Line a, double x1, double x2) throws Exception{
		Point point1 = new Point (x1 , x1*Slope+YIntercept);
		Point point2 = new Point (x2, x2*Slope+YIntercept);
		return new LineSegment(point1,point2);
	}
	/**
	 * Finds the intercept of two lines
	 * @return the intercept point returns null if lines are parallel
	 */
	public Point intercept (Line a){
		if (Slope != a.Slope || (Double.isNaN(Slope) && Double.isNaN(a.Slope))){
			double x;
			double y;
			if (Double.isNaN(Slope)) {
				x = XIntercept;
				y = a.Slope*XIntercept+a.YIntercept;
			} else if (Double.isNaN(a.Slope)) {
				x = a.XIntercept;
				y = Slope*a.XIntercept+YIntercept;
			} else {
				x = (a.YIntercept - YIntercept)/(Slope - a.Slope);
				y = (Slope * a.YIntercept - a.Slope * YIntercept)/ (Slope * a.Slope);
			}
			return new Point (x,y);	
			
		}
		else{
			return null;
		}
	}
	public boolean isIntercept (Line a){
			return Slope != a.Slope || (Double.isNaN(Slope) && Double.isNaN(a.Slope));
	}
	public boolean isParallel	(Line a){
		return !(Slope != a.Slope || (Double.isNaN(Slope) && Double.isNaN(a.Slope)));
	}
	public double distanceToPoint(Point p) throws Exception{
		if (Double.isNaN(Slope))
			return Math.abs(XIntercept-p.X);
		return Math.abs(Slope*p.X-p.Y+YIntercept)/Math.sqrt(1+MathX.square(Slope));
		}
}
