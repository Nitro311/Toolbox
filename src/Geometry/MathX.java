package Geometry;
public class MathX {
	public static double square(double x){
		return x*x;
	}
	public static boolean leapyear (int year){
		if (year%4 == 0) {
			 if  (year%100>0){
				 return true;
			 }
			 else{
				 if (year%400==0){
					 return true;
				 }
				 
				 else{
					 return false;
				 }
			 }
		}
		else{
			return false;
		}
	}
}
