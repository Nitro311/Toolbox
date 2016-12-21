package Geometry;

import java.util.Arrays;
import java.util.Random;

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
	public static int randInt(int min, int max) {

	    // NOTE: This will (intentionally) not run as written so that folks
	    // copy-pasting have to think about how to initialize their
	    // Random instance.  Initialization of the Random instance is outside
	    // the main scope of the question, but some decent options are to have
	    // a field that is initialized once and then re-used as needed or to
	    // use ThreadLocalRandom (if using at least Java 1.7).
	    Random rand = null;

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
}
