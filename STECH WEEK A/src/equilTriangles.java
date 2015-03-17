import java.util.Scanner;

public class equilTriangles {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println ("How big do you want your triangle to be? It must be odd.");
		
		Scanner scan = new Scanner(System.in);
		int base = scan.nextInt();
		int height = (base + 1) / 2;
		int spaces = height;
		int star = 1;
		
		String space = "";
		
		//affects height
		for(int i = 0; i < height; i ++) {
			//spaces
			for (int s = 0; s < spaces; s++) {
				System.out.print(" ");
			}
			for (int n = 0; n < star; n ++) {
				System.out.print("*");
			}
			star = star + 2;
			spaces = spaces - 1;
			System.out.println();
		}
	
	}
}