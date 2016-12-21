/**
 * 
 */
package GameMechanics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Alex Dutton
 *
 */
public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to this basic game!");
		System.out.println(new Item("Skull","Just a human skull",2,"Junk"));
		Player Aaron = new Player ("Aaron","Gnome","Thief",'M',10);
		System.out.println(Aaron);
		Choice Goodbye = new Choice ("Yell Good-Bye");
		Choice Hello = new Choice("Hello");
		ArrayList<Choice> funny = new ArrayList<Choice>(Arrays.asList(Goodbye,Hello));
		System.out.println(new Inventory(Aaron, 10));
		Encounter River = new Encounter ("You see a River rushing under a bridge",new Choices (funny));
		Encounter Bridge = new Encounter ("You see a Bridge thats made of wood and is 30 ft across",new Choices ((new ArrayList<Choice> (funny))));
		System.out.println(Bridge);
		System.out.println(River);
	}
}
