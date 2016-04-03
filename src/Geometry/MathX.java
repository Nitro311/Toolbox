package Geometry;

import java.util.Arrays;

/**
 * Just so extra math functions I made for fun
 * @author Alex Dutton
 *
 */
public class MathX {
	public static double square(double x){
		return x*x;
	}
/**
 * 	checks if year is a leapyear
 * @param year
 * @return	boolean
 */
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
	public static double max (double[] args){
		Arrays.sort(args);
		return args[args.length-1];
	}
}
