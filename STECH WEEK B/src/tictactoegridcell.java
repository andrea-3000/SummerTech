import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;


public class tictactoegridcell extends Button{
	int row;
	int column;
	int state;
	
	public tictactoegridcell(int row, int column, int state) {
		this.row = row;
		this.column = column;
		this.state = state;
		
		
		Button but = new Button();
	
		setVisible(true);
		
	}
	
	public void changebutton(int player) {
		
		state= player;
		
		if(player==1){
			setLabel("X");
		}
		if (player == 2) {
			setLabel("O");
		}
		
	}

	
}