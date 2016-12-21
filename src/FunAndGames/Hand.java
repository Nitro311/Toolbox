/**
 * 
 */
package FunAndGames;

/**
 * @author Alex Dutton
 *
 */
public class Hand extends CardCollection {
	/**
	 * Creates an empty hand
	 */
	public Hand (){
		super();
	}
	public void add(Card card) {
		cards.add(0, card);
	}
	public Card discard(int index){
		return cards.remove(index+1);
	}
	public String toString(){
		return "Hand "+cards;
	}
}
