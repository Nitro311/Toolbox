/**
 * 
 */
package FunAndGames;

/**
 * @author Alex Dutton
 *
 */
public class Card {
	    public final int Value;
	    public final Character Code;
	    
	    public final int[] PossibleCards= {1,2,3,4,5,6,7,8,9,10,11,12,13};
	    public final Character[] PossibleCodes = {'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
	   
	    public Card(Character code) throws Exception {
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
	        return Code.toString();
	    }
}
