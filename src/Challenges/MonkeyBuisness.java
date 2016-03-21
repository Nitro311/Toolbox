package Challenges;
/*
 * http://codingbat.com/prob/p181646
 */
public class MonkeyBuisness {
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if (aSmile==true && bSmile==true){
			return true;
		  
		}
		else if (aSmile == false && bSmile == false){
			return true;
		}
		else{
			return false;
		}
	}
}
