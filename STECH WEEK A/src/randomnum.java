import java.util.Random;
import java.util.Scanner;


public class randomnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randGenerator = new Random();
		boolean game = true;
		Scanner question = new Scanner(System.in);
		
		//creates random number
		int randomNumber = randGenerator.nextInt(10);
		
		//asks question
		System.out.println("I'm thinking of a number from 0 to 10... guess what it is!");
		
		//begin game loop
		while (game){
			//input guess
			int answer = question.nextInt();
			//checks for correct number
			if (answer == randomNumber) {
				System.out.println("You got it!");
				game = false;
			} else {
				System.out.println("That wasn't the number I was thinking of... try again--");
			}
		}
	}
}
