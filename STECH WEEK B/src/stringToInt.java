import java.util.Scanner;


public class stringToInt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner question = new Scanner(System.in);
		System.out.println("What word would you like to find the integer values for?");
		String what = question.nextLine();
		int length = what.length();
		
		for (int letter = 0; letter < length; letter ++) {
			char part = what.charAt(letter);
			System.out.print(what.charAt(letter) + "- ");
			System.out.println((int)part);
		}
	}

}
