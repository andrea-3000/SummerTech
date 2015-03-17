
public class win {
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
}
