/**
 * 
 */
package GameMechanics;

import java.util.Locale;

/**
 * @author Alex Dutton
 *
 */
public class Player {
	String Name;
	int Level;
	Character Gender;
	String Race;
	String Career;
	/**
	 * 
	 * @param name
	 * @param race
	 * @param career
	 * @param gender
	 * @param level
	 * @throws Exception
	 */
	Player (String name,String race,String career,Character gender,int level) throws Exception{
		Name = name;
		Level = level;
		Gender = gender;
		Race = race;
		Career = career;
		if (Gender!= 'F' && Gender != 'M')
			throw new Exception ("Not a Valid Gender");
		// Check for vaild class?
	}
	public String toString(){
		return "User: [" + Name + " is a " + Gender + ", " + Race + ", " + Career +" and is level " + Level+"]";
	}
}
