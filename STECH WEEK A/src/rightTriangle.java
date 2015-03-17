import java.util.Scanner;


public class rightTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println ("How large do you want your triangle to be?");
		
		Scanner initialBox = new Scanner(System.in);
		int boxSize = initialBox.nextInt();
		
		String line = "";
		
		for (int boxCounter = 1; boxCounter <= 1; boxCounter ++) {
			
			for (int loopCounter = 0; loopCounter < boxSize; loopCounter ++) {
				line = line + "*";
				
				System.out.println(line);
			} 
		}
	}
}