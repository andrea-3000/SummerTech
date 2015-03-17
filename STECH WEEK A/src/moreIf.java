import java.util.Scanner;
public class moreIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your name?");
		Scanner nameScan = new Scanner(System.in);
		String yourName = nameScan.nextLine();
		System.out.println("Hello, " + yourName + ". What is your favorite color?");
		System.out.println("Press 1 for red, 2 for purple, 3 for blue, or 4 for green.");
		Scanner colorScan = new Scanner(System.in);
		int favColor = colorScan.nextInt();
		if (favColor == 1) {
			System.out.println("Red is your favorite color!");
		} else if (favColor == 2){
			System.out.println("Purple is your favorite color!");
		} else if (favColor == 3) {
			System.out.println ("Blue is your favorite color!");
		} else if (favColor == 4) {
			System.out.println("Green is your favorite color!");
		} else {
			System.out.println("You must like some other color! What is it?");
			Scanner otherColor = new Scanner(System.in);
			String otherFav= otherColor.nextLine();
			System.out.println(otherFav + " is a nice color!");
		}
	}

}
