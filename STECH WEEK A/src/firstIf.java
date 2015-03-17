import java.util.Scanner;
public class firstIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 1 for a noun. Enter 2 for a verb");
		Scanner inputScanner = new Scanner(System.in);
	    int numberInput = inputScanner.nextInt();
	    if(numberInput==1){
	    	System.out.println("Here is a noun!");
	    } else if (numberInput==2) {
	    	System.out.println("Here is a verb!");
	    } else {
	    	System.out.println("You didn't enter 1 or 2.");
	    }
	}

}
