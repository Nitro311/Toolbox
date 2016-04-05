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
	/**
	 * creates a Line using the slope of the Line and the Y-Intercept
	 * @param slope
	 * @param yIntercept
	 * @throws Exception if the slope or Y-Intercept aren't a number
	 */
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
	/**
	 * creates a Line using a LineSegments slope  and projected Y-Intercept
	 * @param LineSegment
	 */
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
	/**
	 * creates a Line using a LineSegment based on 2 Points
	 * @param Point1
	 * @param Point2
	 */
	public Line (Point a, Point b) throws Exception{
		this(new LineSegment (a,b));
	}
	/**
	 * creates a Line using 4 integers to create Points used to make a LineSegment
	 * @param x
	 * @param y
	 * @param x2
	 * @param y2
	 * @throws Exception
	 */
	public Line (double x,double y,double x2,double y2) throws Exception{
		this(new Point (x,y), new Point (x2,y2));
	}
	public String toStandardForm(){
		
		return (Slope*-1)+"x+y ="+YIntercept;
		
	}
	public String toString(){
		String equation = "";
		if (!(Double.isNaN(Slope))){
			if (YIntercept != 0 && Slope !=0) {
				equation = "y=" + Slope+"x + " + YIntercept;
			} else if (YIntercept != 0 && Slope ==0) {
				equation = "y=" + YIntercept;
			} else if (YIntercept == 0 && Slope !=0) {
				equation = "y=" + Slope+"x";
			} else {
				equation = "y=0";
			}
		}else{
			equation = "x="+XIntercept;
		}
		return "Line[Slope "+Slope+", Y-Intercept "+YIntercept+", X-Intercept "+XIntercept+", y=mx+b format:"+equation+"]";
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
			return !isParallel(a);
	}
	public boolean isParallel	(Line a){
		return Slope == a.Slope || (Double.isNaN(Slope) && Double.isNaN(a.Slope));
	}
	public boolean isPerpendicular(Line a){
		return (Double.isNaN(Slope)&& a.Slope == 0)
				|| Double.isNaN(a.Slope)&& Slope == 0
				|| -1/Slope == a.Slope ;
	}
	public double distanceToPoint(Point p) throws Exception{
		if (Double.isNaN(Slope))
			return Math.abs(XIntercept-p.X);
		return Math.abs(Slope*p.X-p.Y+YIntercept)/Math.sqrt(1+MathX.square(Slope));
		}
}
