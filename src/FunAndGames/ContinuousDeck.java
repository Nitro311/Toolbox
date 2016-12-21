/**
 * 
 */
package FunAndGames;

/**
 * @author Alex Dutton
 *
 */
public class ContinuousDeck extends Deck {
	public CardCollection Pile;
	public ContinuousDeck(CardCollection pile) throws Exception {
		super();
		Pile = pile;
	}
	public Card deal() {
		if (cards.size() == 0){
			System.out.println("Shuffling");
			Pile.shuffle();
			combine(Pile);
			Pile.clear();
		}
		return super.deal();
	}
	public int count(){
		return super.count()+Pile.count();
	}
	
	public boolean hasCards() {
		return super.count()+Pile.count() > 0;
	}
	
}
