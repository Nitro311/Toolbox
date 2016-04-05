/**
 * 
 */
package Geometry;

import java.util.Arrays;

/**
 * @author Alex Dutton
 *
 */
public class Polygon extends Shape2D{
	public final Point[] Verticies;
	public final Double[] Lengths;
	public final double Perimeter;
	public String Name = "Polygon";
	/**
	 * 
	 * @param allPoints requires the Points of the all the verticies of the Polygon
	 * @throws Exception if there are less than 3 points
	 */
	public Polygon (Point[] allPoints) throws Exception{

		Verticies = allPoints;
		if (Verticies.length < 3)
			throw new Exception ("Poygon must have 3 verticies");
		Lengths = new Double[allPoints.length];
		double Perim = 0;
		for(int i = 0; i < allPoints.length; i++) {
			if (i != allPoints.length - 1) {
				Lengths [i] =Points.distance(allPoints[i], allPoints[i+1]);
			} else {
				Lengths[i] = Points.distance(allPoints[i], allPoints[0]);
			}
			Perim += Lengths[i];
		}
		Perimeter = Perim;
	}
	public String toString(){
		return Name +" [Verticies: "+Arrays.toString(Verticies)+", Lengths: "+Arrays.toString(Lengths)+", Perimeter: "+ Perimeter+", Area: " +area()+"]";
	}
	public double area() 
	{ 
	  double a = 0;         // Accumulates area in the loop
	  int j = Verticies.length-1;  // The last vertex is the 'previous' one to the first

	  for (int i=0; i<Verticies.length; i++) { 
		  a = a +  (Verticies[j].X+Verticies[i].X) * (Verticies[j].Y-Verticies[i].Y); 
	      j = i;  //j is previous vertex to i
	    }
	  return Math.abs(a/2);
	}
	public double perimeter(){
		return Perimeter;
	}
	
	public boolean equals(Object obj){
		if (!(obj instanceof Polygon))
			return false;
		if (this == obj)
			return true;
		
		Polygon other = (Polygon) obj;
		if (Verticies.length != other.Verticies.length)
			return false;
		
		for(int i = 0; i < Verticies.length; i++) {
			if (!Verticies[i].equals(other.Verticies[i]))
				return false;
		}
		return true;
	}
	public boolean isCongruent(Polygon a){
		for(int i = 0; i < Verticies.length; i++) {

			if (Verticies[i].equals(a.Verticies[i])){
				
			}else{
				return false;
			
				}
		}
		return a.area() == area();
				
	}
}
