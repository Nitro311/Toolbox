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
public class Deck extends CardCollection {
	public Deck() throws Exception{
		super();

	}
	
	public Deck(CardCollection collection){
		super(collection);
	}	
	
	public Card deal() {
		Card card = cards.remove(0);
		
		return card;
	}
	
	public void addToTop(Card card) {
		cards.add(0, card);
	}
	public String toString(){
		return "Deck "+cards;
	}
	public void initializeDeck() throws Exception{
		cards = new ArrayList <Card>();
		for (Suit suite : new Suit[] { Suit.Hearts, Suit.Diamonds, Suit.Clubs, Suit.Spades }) {
			for (Character value : "A23456789TJQK".toCharArray()) {
				cards.add(new Card(value, suite));
			}				
		}
	}

}
