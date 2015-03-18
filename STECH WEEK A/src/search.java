
public class search {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] createArray = new int[10];
		int highest = 0;

		createArray[0]= 22;
		createArray[1]= 34;
		createArray[2]= 69;
		createArray[3]= 27;
		createArray[4]= 77;
		createArray[5]= 89;
		createArray[6] = 44;
		createArray[7]= 5;
		createArray[8] = 16;
		createArray[9]= 377;
		
		System.out.println(getHigh(createArray, highest));
				
	}
	
	public static int getHigh (int[] createArray, int highest) {
		for (int first=0; first<10; first++) {
			if (highest - createArray[first] < 0) {
				highest = createArray[first];
			}
		}
		return highest;
	}
}
