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
public final class HiLo {
	public static void main(String[] args) throws Exception {
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
			boolean isHigher = askHiLo("The number is "+randomNumber +" is the next number higher or lower?");
			while (randomNumber == lastNumber || numbers.contains(randomNumber)){
				randomNumber = rand.nextInt(10)+1;
			}
			
			numbers.add(randomNumber);
			if (numbers.size()>5)
				numbers.remove(0);
			System.out.println("DEBUG: Numbers "+ numbers.toString());
			System.out.println("The last number was "+ lastNumber);
			System.out.println("The new number is "+ randomNumber);
			if ((randomNumber > lastNumber && isHigher) || (randomNumber < lastNumber && !isHigher)){
				score ++;
				System.out.println("Congratz you guessed correctly your score is now "+ score);
				
			}else{
				System.out.println("Game Over! your score was "+ score);
				if (score>highScore){
					if(highScore != UNSET) {
						System.out.println("you beat the old highscore "+ highScore);
					}
					highScore = score;
				}
				StillPlaying = askYesNo("Do you want to play again?");
				numbers = new ArrayList<Integer>();
				score = 0;
			}
		}
	}
	
	private static boolean askYesNo(String message) {
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
	private static boolean askHiLo(String message) {
		Scanner scanner = new Scanner( System.in );
		try {
			while (true) {
				System.out.println(message);
				String again = scanner.nextLine();
				if (again == null)
					continue;
				if (again.toLowerCase().startsWith("h"))
					return true;
				if (again.toLowerCase().startsWith("l"))
					return false;
			}
		} finally {
			//scanner.close();
		}
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
