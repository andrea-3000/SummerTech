import java.util.Scanner;
public class palindromesclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner happyTime = new Scanner(System.in);
	String reversed = "";
	
	System.out.println ("What word would you like to check?");
	String word = happyTime.nextLine();
	for (int count = word.length(); count >= 1; count --) {
		reversed = reversed + word.charAt(count - 1);
		}
	System.out.println(reversed);
	
	if (word.equals(reversed)) {
		System.out.println("Your word is a palindrome!");
	} else {
		System.out.println ("Sorry your word is not a palindrome.");
	}
	}
}
