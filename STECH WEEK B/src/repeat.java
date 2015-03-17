
public class repeat {
	public static boolean repeat (String [][] tictactoe, int xVar, int yVar) {
		if (!tictactoe[xVar][yVar].equals("-")){
			return true;
		} 
		return false;
	}

}
