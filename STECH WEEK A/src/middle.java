import java.util.Scanner;


public class middle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner question = new Scanner(System.in);
		System.out.println("What word would you like to find the middle letter(s) of?");
		String what = question.nextLine();
		int length = what.length();
		int middle = length - (length/2);
		
		if (length%2 == 1) {
			System.out.println("The middle characters are- " + what.substring(middle+1, middle+2));
		} else {
			System.out.println("The middle characters are- " + what.substring(middle, middle +2));
		}

	}
	
	

}
