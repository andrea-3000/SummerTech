import java.util.Scanner;
public class line {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("How long do you want your line to be?");
		Scanner intLine = new Scanner(System.in);
		int lineSize = intLine.nextInt();
		String line = "";
		for (int loopCounter = 0; loopCounter < lineSize; loopCounter ++) {
			System.out.print("*");
		}
		
	}
}
