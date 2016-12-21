/**
 * 
 */
package FunAndGames;

/**
 * @author Alex Dutton
 *
 */
public class WarGame {
	public static void main(String[] args) throws Exception {
		
		Deck starterDeck = new Deck();
		CardCollection comPile = new CardCollection();
		CardCollection yourPile = new CardCollection();
		CardCollection spoils = new CardCollection();
		ContinuousDeck yourDeck = new ContinuousDeck(yourPile);
		ContinuousDeck comDeck = new ContinuousDeck(comPile);
		Card comCard;
		Card yourCard;
		
		starterDeck.initializeDeck();
		starterDeck.shuffle();

		while (starterDeck.hasCards()){
			yourDeck.addToTop(starterDeck.deal());
			comDeck.addToTop(starterDeck.deal());
		}
		yourDeck.shuffle();
		comDeck.shuffle();

		int round = 1;
		while (yourDeck.hasCards() && comDeck.hasCards()){	
			yourCard = yourDeck.deal();
			comCard = comDeck.deal();
			System.out.println("Round " + round + ": you have a "+ yourCard +" Computer has a "+ comCard 
					+ " You have " + yourDeck.count() + " cards and the computer has " + comDeck.count());
			round++;
			spoils.add(yourCard);
			spoils.add(comCard);
			if (yourCard.Value>comCard.Value){
				yourPile.combine(spoils);
				System.out.println("you won the battle and "+spoils+" cards");
				spoils = new CardCollection();
			}else if (yourCard.Value < comCard.Value){
				comPile.combine(spoils);
				System.out.println("you lost the battle and "+spoils+" cards");
				spoils = new CardCollection();
			}else{
				if (comDeck.count()>2)
					spoils.add(comDeck.deal());
				if (comDeck.count()>2)
					spoils.add(comDeck.deal());
				if (comDeck.count()>2)
					spoils.add(comDeck.deal());
				if (yourDeck.count()>2)
					spoils.add(yourDeck.deal());
				if (yourDeck.count()>2)
					spoils.add(yourDeck.deal());
				if (yourDeck.count()>2)
					spoils.add(yourDeck.deal());
			}
			if (round > 1000) {
				System.out.println("Too many rounds!");
				break;
			}
			
		}
		
	}
}
