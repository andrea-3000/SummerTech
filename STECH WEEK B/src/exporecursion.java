import java.util.Scanner;

public class exporecursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner question = new Scanner(System.in);
		
		System.out.println("What do you want your base to be?");
		int base = question.nextInt();
		
		System.out.println("What do you want your exponent to be?");
		int exponent = question.nextInt();
			
		exponentmethod em = new exponentmethod();
		System.out.println("The answer is: " + em.multiply(base,exponent-1) + ".");
	}
}