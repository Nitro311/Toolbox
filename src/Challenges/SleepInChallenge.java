package Challenges;
// This challenge is from	http://codingbat.com/prob/p187868 
//The parameter weekday is true if it is a weekday, 
//and the parameter vacation is true if we are on vacation. 
//We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in. 
public class SleepInChallenge {
	public static boolean sleepIn(boolean weekday, boolean vacation) {
		  if (weekday == true){
			  if(vacation == true){
				  return true;
			  }
			  else{ 
				  return false;
			  }
		  }
		  else if(vacation == true){
			  return true;
		  }
		  else{
			  return true;
		  }
	}
}
