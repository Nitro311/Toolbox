/**
 * 
 */
package GameMechanics;

/**
 * @author Alex Dutton
 *
 */
public class Choice {
	Encounter Reaction;
	String Description;
	Choice (String description,Encounter reaction){
		Reaction = reaction;
		Description = description;
	}
	Choice (String description){
		Reaction = null;
		Description = description;
	}
	public String toString(){
		return "Choice ["+Description+", Response:"+Reaction+"]";
	}
}
