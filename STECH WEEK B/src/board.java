
public class board {
	public static void boardDraw(String[][] tictactoe, int xVar, int yVar, String [] xo, int gameTime) {
		tictactoe[xVar][yVar] = xo[(gameTime % 2)];
		System.out.println("  012");
		for (int tPrint = 0; tPrint < 3; tPrint ++) {
			System.out.print(tPrint + " ");
			for (int loopCount = 0; loopCount < 3; loopCount ++){;
				System.out.print(tictactoe[tPrint][loopCount]);
			}
			
			//prints out altered tictactoe[]
			System.out.println();
			}
	}

}
