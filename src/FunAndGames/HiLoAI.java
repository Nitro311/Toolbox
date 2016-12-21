/**
 * 
 */
package FunAndGames;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Alex Dutton
 *
 */
public final class HiLoAI {
	public static void main(String[] args) throws Exception {
		int objective = 20;
		int numberofgames = 0;
		Random rand = new Random();
		int randomNumber = rand.nextInt(10)+1;
		int score = 0;
		final int UNSET = 0;
		int highScore = UNSET;
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(randomNumber);
		boolean StillPlaying = true;
		while (StillPlaying){
			int lastNumber = randomNumber;
			boolean isHigher = askHiLo(randomNumber);
			while (randomNumber == lastNumber || numbers.contains(randomNumber)){
				randomNumber = rand.nextInt(10)+1;
			}
			
			numbers.add(randomNumber);
			if (numbers.size()>5)
				numbers.remove(0);
			if ((randomNumber > lastNumber && isHigher) || (randomNumber < lastNumber && !isHigher)){
				score ++;
				
			}else{
				if (score>highScore){

					if(highScore>objective){//highScore != UNSET || ) {
						System.out.println("Games played:" + numberofgames);
						System.out.println("you beat the old highscore "+ highScore);
						
					}
					highScore = score;
				}else{;
				}
				if (highScore > objective) {
					StillPlaying = askYesNo("Continue?");
				}
				numberofgames ++;
				numbers = new ArrayList<Integer>();
				score = 0;
			}
		}
	}
	
	private static boolean askYesNo(String message) {
		memory = new ArrayList<Integer>();

		Scanner scanner = new Scanner( System.in );
		try {
			while (true) {
				System.out.println(message);
				String again = scanner.nextLine();
				if (again == null)
					continue;
				if (again.toLowerCase().startsWith("y"))
					return true;
				if (again.toLowerCase().startsWith("n"))
					return false;
			}
		} finally {
			//scanner.close();
		}
	}
	
	static List<Integer> memory = new ArrayList<Integer>();
	private static boolean askHiLo(int randomNumber) {
		int countBelow = 0;
		int countAbove = 0;
		memory.add(randomNumber);
		if (memory.size()>5)
			memory.remove(0);
		for(int i = 0; i < 11; i++){
			if (!memory.contains(i) && i != randomNumber) {
				if (i<randomNumber){
					countBelow ++;
				}else{
					countAbove ++;
				}
			}
		}
		boolean guessHigh = countAbove >= countBelow;
		return guessHigh;		
	}
	private static int askInt(String message) {
		Scanner scanner = new Scanner( System.in );
		try {
			while (true) {
				System.out.println(message);
				String input = scanner.nextLine();
				if (input == null)
					continue;
				try{
					return Integer.parseInt(input);
				}
				catch (NumberFormatException ex){
					continue;
				}
			}
		} finally {
			//scanner.close();
		}
	}
}
