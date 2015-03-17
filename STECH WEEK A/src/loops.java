import java.util.Scanner;
public class loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How big do you want your box to be?");
		Scanner countScan = new Scanner(System.in);
		int boxSize = countScan.nextInt();
		boxSize -= 3;
		int loopCount = 0;
		String boxSide = "*   *";
		if (boxSize == -2) {
			System.out.println("*****");
		} else if (boxSize == -1) {
			System.out.println("*****");
			System.out.println("*****");
		} else {
			System.out.println("*****");
			while (loopCount <= boxSize) {
			System.out.println (boxSide);
			loopCount++;
			} 
			System.out.println("*****");
		}
	}
	

} 
