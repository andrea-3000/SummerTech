import java.util.Scanner;

public class nestedLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println ("How big do you want your box to be?");
		
		Scanner initialBox = new Scanner(System.in);
		int boxSize = initialBox.nextInt();
		
		for (int boxCounter = 1; boxCounter <= boxSize; boxCounter ++) {
			String line = "";
			
			for (int loopCounter = 0; loopCounter < boxSize; loopCounter ++) {
				line = line + "*";
			} 
			System.out.println(line);
		}
	}
}
