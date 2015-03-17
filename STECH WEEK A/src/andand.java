import java.util.Scanner;
public class andand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your favorite color?");
		System.out.println("Press 1 for green or 2 for red.");
		Scanner colorScan = new Scanner(System.in);
		int favColor = colorScan.nextInt();
		System.out.println("What is your favorite sport?");
		System.out.println("Press 1 for soccer or 2 for baseball.");
		Scanner sportScan = new Scanner(System.in);
		int favSport = sportScan.nextInt();
		
		if (favColor == 1 && favSport == 1) {
			System.out.println("You really like the color green and soccer!");
		}
		else if (favColor == 1 && favSport == 2) {
			System.out.println("You really like the color green and baseball!");
		} else if (favColor == 2 && favSport == 1) {
			System.out.println("You really like the color red and soccer!");
		} else if (favColor == 2 & favSport == 2) {
			System.out.println("You really like the color red and baseball!");
		} else {
			System.out.println("You must not like any of these things.");
		}
			

	}

}
