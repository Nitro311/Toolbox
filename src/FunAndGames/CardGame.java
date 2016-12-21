/**
 * 
 */
package FunAndGames;

/**
 * @author Alex Dutton
 *
 */
public class CardGame {
	public static void main(String[] args) throws Exception {
		System.out.println(new Hand());
		Hand hand = new Hand();
		Deck deck = new Deck();

		for (int i = 0;i<5; i++){
			deck.shuffle();
			System.out.println(hand);
			System.out.println(deck);
			hand.add(deck.deal());

		}
		System.out.println(hand);
		System.out.println(deck);
	}

}
