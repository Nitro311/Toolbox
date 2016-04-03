package Challenges;
public class Array {
	
	public static String toString(int[] data) {
		String output = "int[] { ";
		for(int i = 0; i < data.length; i++) {
			output = output + data[i];
		if (i < data.length - 1) {
			output = output + ", ";
		} else {
			output = output + " }";
		}
	}

	return output;
	}
}
