
public class grid {
	public static void grid (String [][] tictactoe) {
		System.out.println("  012");
		for (int tttCount = 0; tttCount < 3; tttCount ++) {
			System.out.print(tttCount + " ");
			for (int loopCount = 0; loopCount < 3; loopCount ++){
				tictactoe[tttCount][loopCount] = "-";
				System.out.print(tictactoe[tttCount][loopCount]);
			}
			System.out.println();
		}
	}

}
