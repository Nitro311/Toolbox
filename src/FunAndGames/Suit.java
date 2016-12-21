/**
 * 
 */
package FunAndGames;

/**
 * @author Alex Dutton
 *
 */
public class Suit {
	public final static Suit Hearts = new Suit('♡', "Hearts");
	public final static Suit Clubs = new Suit('♣', "Clubs");
	public final static Suit Diamonds = new Suit('♢', "Diamonds");
	public final static Suit Spades = new Suit('♠', "Spades");
	
	public final Character Symbol;
	public final String Name;
	
	private Suit(Character symbol, String name) {
		Symbol = symbol;
		Name = name;
	}
}
