/**
 * 
 */
package GameMechanics;

/**
 * @author Alex Dutton
 *
 */
public class Encounter {
	String Dialog;
	Choices Answers;
	Encounter(String dialog,Choices answers){
		Dialog = dialog;
		Answers = answers;
		
	}
	public String toString(){
		return "Event ["+Dialog+" you can "+Answers+"]";
	}
}
