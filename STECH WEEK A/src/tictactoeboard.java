import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


public class tictactoeboard extends JFrame{
	
	tictactoegridcell[][] xo = new tictactoegridcell[3][3];

	/**
	 * @param args
	 */
	public tictactoeboard(){

		setLayout(new GridLayout(3,3));

		tictactoegridcell[][] xo= new tictactoegridcell[3][3];
		for (int loopCount = 0; loopCount < 3; loopCount ++) {
			for (int looper = 0; looper < 3; looper ++) {
				tictactoegridcell b = new tictactoegridcell(loopCount, looper, 0);
				xo[loopCount][looper] = b;
				add(b);
			}
		}

		setVisible(true);
		pack();


		ActionListener a = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				tictactoegridcell b = (tictactoegridcell) arg0.getSource();
				b.changebutton(tictactoe.gameTime%2+1);
				tictactoe.gameTime++;
				System.out.println("whatupdawg");


			}



		};

		for (int blah = 0; blah < 3; blah ++) {
			for (int lol = 0; lol < 3; lol ++) {
				xo[blah][lol].addActionListener(a);
			}
		}
	}


	
	public boolean checkwin () {
		
		for (int omfg = 0; omfg < 3; omfg++) {
			if (xo[omfg][0].state == 1 && xo[omfg][1].state == 1 && xo[omfg][2].state == 1) {
				return true;
			}
		}
		//checks for wins vertically
		for (int omfg = 0; omfg < 3; omfg++) {
			if (xo[0][omfg].state == 1 && xo[1][omfg].state == 1 && xo[2][omfg].state == 1) {
				return true;
			}
		}
		//checks for wins diagonally (l --> r)
		for (int omfg = 0; omfg < 1; omfg ++) {
			if (xo[omfg][omfg].state == 1 && xo[omfg + 1][omfg + 1].state == 1 && xo[omfg + 2][omfg + 2].state == 1) {
				return true;
			}
		}
		//checks for wins diagonally (r --> l)
		for (int omfg = 0; omfg < 1; omfg ++) {
			if (xo[omfg][omfg + 2].state == 1 && xo[omfg + 1][omfg + 1].state == 1 && xo[omfg + 2][omfg].state == 1) {
				return true;
			}
		}
		return false;
	}
	
	
	

}



		

