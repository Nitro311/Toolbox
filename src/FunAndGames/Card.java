/**
 * 
 */
package FunAndGames;

import Geometry.Point;

/**
 * @author Alex Dutton
 *
 */
public class Card {
    public final int Value;
    public final Character Code;
    public final Suit Suit;
    
    public final int[] PossibleCards= {1,2,3,4,5,6,7,8,9,10,11,12,13};
    public final Character[] PossibleCodes = {'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
   
    public Card(Character code, Suit suit) throws Exception {
    	Suit = suit;
    	code = Character.toUpperCase(code);
    	for (int i = 0; i < PossibleCodes.length; i++){
    		if (PossibleCodes[i] == code){
    			Value = i + 1;
    			Code = code;
    			return;
    		}
    	}
    	
    	throw new Exception("Did not recognize code " + code);
    }
    
	public String toString(){
        return Code+Suit.Symbol.toString();
    }
	public boolean equals(Object obj){
		if (!(obj instanceof Card))
			return false;
		if (this == obj)
			return true;
		
		Card other = (Card) obj;
		if (other == null)
			return false;
		
		return this.Code == other.Code && this.Suit == other.Suit;
	}
	public boolean isSameValue(Card other){
		if (other == null)
			return false;
		
		return this.Value == other.Value;
	}
	public boolean isSameSuit(Card other){
		if (other == null)
			return false;
		
		return this.Suit == other.Suit;
	}
	
}

