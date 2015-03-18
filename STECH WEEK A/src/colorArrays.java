import java.util.Scanner;
public class colorArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int entry[] = new int[2];
		System.out.println("What is your favorite color? Press 1 for red. Press 2 for blue.");
		entry[0] = scan.nextInt();
		System.out.println("What is your favorite sport? Press 1 for football. Press 2 for baseball.");
		entry[1] = scan.nextInt();
		
		String color[] = new String[2];
		color[0]="red";
		color[1]="blue";
		String sport[] = new String[2];
		sport[0]="football";
		sport[1]="baseball";
		
		System.out.println("You like the color "+color[entry[0]-1] + " and " +sport[entry[1]-1]);
		/*for (int loopCounter = 0; loopCounter < 2; loopCounter ++){
			if (entry[0] == (loopCounter + 1) && entry [1] == (loopCounter + 1)) {
				System.out.println("You like "+color[loopCounter]+" and "+sport[loopCounter]+".");
			}
		}
		
		if(entry[0]==1 && entry[1]==1){
			System.out.println("You like "+color[0]+" and "+sport[0]+".");
		}
		if(entry[0]==2&&entry[1]==2){
			System.out.println("You like "+color[1]+" and "+sport[1]+".");
		}
		if(entry[0]==1&&entry[1]==2){
				System.out.println("You like "+color[0]+" and "+sport[1]+".");
		}
		if(entry[0]==2&&entry[1]==1){
			System.out.println("You like "+color[1]+" and "+sport[0]+".");
		}*/

	}

}

