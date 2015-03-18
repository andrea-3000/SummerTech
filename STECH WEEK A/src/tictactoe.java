import java.util.Scanner;
public class tictactoe {
	static int gameTime = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tictactoe[][] = new String[3][3];
		String xo[] = new String[2];
		tictactoeboard board = new tictactoeboard();
		
		xo[0] = "X";
		xo[1] = "O";
		//prints grid
	//	ticboard.grid(tictactoe);
		
		boolean game = true;
		//starts game loop
		for (gameTime= 0; gameTime < 9; gameTime ++, game = true) {
		//player turns
		/*for(int outerLoop = 0;outerLoop > 2;outerLoop++)*/
			position(tictactoe, gameTime, xo);
			//repeat check
			if(win(tictactoe,xo[(gameTime % 2)])){	
				game = false;
				System.out.println("congratulations Player " + (gameTime % 2 + 1) + ", you won!");
					System.exit(0);
			}
		}
		System.out.println("it's a tie game.");
		System.exit(0);
	}
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
	public static void position (String [][] tictactoe, int gameTime, String [] xo) {
		board ticboard = new board();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Player " +((gameTime % 2) + 1) + ":");
		System.out.println("Enter the x position.");
		int xVar = scan.nextInt();
		System.out.println("Enter the y position.");
		int yVar = scan.nextInt();
		
		if(repeat(tictactoe, xVar, yVar)) {
			System.out.println("Sorry you can't put your letter in that position");
			System.out.println();
			position(tictactoe, gameTime, xo);
		} else {
			boardDraw(tictactoe, xVar, yVar, xo, gameTime);
		}
	}
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
	public static boolean win (String[][] tictactoe, String xo){
		//checks for wins horizontally
		for (int omfg = 0; omfg < 3; omfg++) {
			if (tictactoe[omfg][0].equals(xo) && tictactoe[omfg][1].equals(xo) && tictactoe[omfg][2].equals(xo)) {
				return true;
			}
		}
		//checks for wins vertically
		for (int omfg = 0; omfg < 3; omfg++) {
			if (tictactoe[0][omfg].equals(xo) && tictactoe[1][omfg].equals(xo) && tictactoe[2][omfg].equals(xo)) {
				return true;
			}
		}
		//checks for wins diagonally (l --> r)
		for (int omfg = 0; omfg < 1; omfg ++) {
			if (tictactoe[omfg][omfg].equals(xo) && tictactoe[omfg + 1][omfg + 1].equals(xo) && tictactoe[omfg + 2][omfg + 2].equals(xo)) {
				return true;
			}
		}
		//checks for wins diagonally (r --> l)
		for (int omfg = 0; omfg < 1; omfg ++) {
			if (tictactoe[omfg][omfg + 2].equals(xo) && tictactoe[omfg + 1][omfg + 1].equals(xo) && tictactoe[omfg + 2][omfg].equals(xo)) {
				return true;
			}
		}
		return false;
	}
	public static boolean repeat (String [][] tictactoe, int xVar, int yVar) {
		if (!tictactoe[xVar][yVar].equals("-")){
			return true;
		} 
		return false;
	}

}
	