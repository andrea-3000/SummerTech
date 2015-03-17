import java.util.Scanner;

public class equilTriangles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("How big do you want your triangle to be?");
		
		Scanner initialBox = new Scanner(System.in);
		int enteredNumber = initialBox.nextInt();
		int rowNum = (enteredNumber + 1) / 2;
		
		//affects height
		for (int boxCounter = 1; boxCounter <= rowNum; boxCounter ++) {
			//affects width
			for (int spaces = 0; spaces < ((enteredNumber-boxCounter)-1); spaces ++) {
				System.out.print(" ");
				
			} 
			for (int stars = 0; stars < ((boxCounter*2)-1); stars ++) {
				System.out.print("*");
			} 
			System.out.println();
		}
	}
}