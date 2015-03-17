
public class certainNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray = new int[11];
		int find = 327;
		
		numArray[0]= 22;
		numArray[1]= 34;
		numArray[2]= 69;
		numArray[3]= 27;
		numArray[4]= 77;
		numArray[5]= 89;
		numArray[6] = 44;
		numArray[7]= 5;
		numArray[8] = 16;
		numArray[9]= 377;
		numArray[10]=327;
		
		System.out.println("This number can be found at numArray[" +getNum(numArray, find)+ "].");
	}
	
	public static int getNum (int[] numArray, int find) {
		int found = 0;
		for (int check = 0; check < 11; check ++) {
			if (numArray[check] == find) {
				found = check;
			}
		}
		return found;
	}

}
