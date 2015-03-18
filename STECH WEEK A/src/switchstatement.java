import java.util.Scanner;
public class switchstatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner question = new Scanner(System.in);
		System.out.println("What is your favorite color: a) red, b) blue, or c) purple?");
		String answer = question.nextLine();
		
		char letter = answer.charAt(0);
		switch(letter){
		case 'a': System.out.println("You like the color red!");
			break;
		case 'b': System.out.println("You like the color blue!");
			break;
		case 'c': System.out.println("You like the color purple!");
			break;
		default: System.out.println("Then what is your favorite color?");
			String othercolor = question.nextLine();
			System.out.println("That color sucks.");
			break;
		}
	}
}
