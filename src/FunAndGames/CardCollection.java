/**
 * 
 */
package FunAndGames;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Alex Dutton
 *
 */
public class CardCollection {
	protected List<Card> cards;
	
	/**
	 * Empty collection
	 */
	public CardCollection(){
		cards = new ArrayList<Card>();
	}
	
	public CardCollection(CardCollection collection){
		cards = new ArrayList<Card>(collection.getCards());
	}	
	
	public List<Card> getCards() {
		return cards;
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public void combine(CardCollection collection) {
		for (Card card : collection.getCards()) {
			cards.add(card);
		}
	}
	public boolean hasCards() {
		return count() > 0;
	}
	public void add(Card card) {
		cards.add(0, card);
	}
	public String toString(){
		return "Cards "+cards;
	}

	/**
	 * 
	 */
	public void clear() {
		cards.clear();
		
	}
	public int count(){
		return cards.size();
		
	}
}
