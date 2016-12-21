/**
 * 
 */
package GameMechanics;

import java.util.ArrayList;

/**
 * @author Alex Dutton
 *
 */
public class Choices {
	ArrayList<Choice> Possible;
	Choices(ArrayList<Choice> possible){
		Possible = possible;
	}
	public String toString(){
		return "Choices ["+Possible+"]";
	}
}
