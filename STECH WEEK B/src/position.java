import java.util.Scanner;


public class position {
	public static void position (String [][] tictactoe, int gameTime, String [] xo) {
		Scanner xyScan = new Scanner(System.in);
		board ticboard = new board();
		repeat ticrep= new repeat();
		
		System.out.println("Player " +((gameTime % 2) + 1) + ":");
		System.out.println("Enter the x position.");
		int xVar = xyScan.nextInt();
		System.out.println("Enter the y position.");
		int yVar = xyScan.nextInt();
		
		if(ticrep.repeat(tictactoe, xVar, yVar)) {
			System.out.println("Sorry you can't put your letter in that position");
			System.out.println();
			position(tictactoe, gameTime, xo);
		} else {
			ticboard.boardDraw(tictactoe, xVar, yVar, xo, gameTime);
		}
	}

}
