package Geometry;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println ("Hello World");
		Scanner input = new Scanner( System.in );
		String s = input.next();
		System.out.println(s);
		float x = Float.parseFloat(s);
		Point p = new Point(x,2.965);
		System.out.println (p.toString());
		
	}

}
