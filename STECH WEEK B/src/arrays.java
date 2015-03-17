import java.util.Scanner;

public class arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String scanScan = scan.nextLine();
		String sportArray[] = new String[2];
		String colorArray[] = new String[2];
		
		System.out.println("What is your favorite sport, baseball or soccer?");
		sportArray[0] = scanScan;
		
		System.out.println("What is your favorite color, green or red?");
		colorArray[0] = scanScan;
		
		System.out.println("You must like " +sportArray[0]+ " and the color "+colorArray[0]+".");
		
		/*if (sportArray[0].equals("baseball") && colorArray[0] == "green") {
			System.out.println("You must like" +sportArray[0]+ "and the color green.");
		} else if ( sportArray[0] == "baseball" && colorArray[0] == "red") {
			System.out.println("You must like baseball and the color red.");
		} else if (sportArray[0] == "soccer" && colorArray[0] == "green") {
			System.out.println("You must like soccer and the color green.");
		} else if (sportArray[0] == "soccer" && colorArray[0] == "red") {
			System.out.println("You must like soccer and the color red.");
		} else {
			System.out.println("Please enter your favorite sport.");
		}*/
		}
}
