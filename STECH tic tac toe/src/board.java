import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class board extends JFrame{
	int playerturn = 0;
	Button [][] xo = new Button[3][3];
	String happy;
	JLabel but;
	board thisBoard;
	public board (){
		setLayout(new GridLayout(4,3));
		String[] letter = new String[1];
		thisBoard= this;
		
		ActionListener bam = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Button b = (Button) arg0.getSource();
				// TODO Auto-generated method stub
				if (playerturn % 2 == 0) {
					b.setLabel("X");
				} else {
					b.setLabel("O");
				}
				b.setEnabled(false);
				playerturn ++;
				if(win(xo)) {
					popup blah = new popup(thisBoard);
					for (int loopy = 0; loopy <3; loopy ++) {
						for (int loop = 0; loop < 3; loop ++) {
							xo[loopy][loop].setEnabled(false);
						}
					}
				} else if (tie(xo)){
					tiepopup eh = new tiepopup(thisBoard);
					for (int loopy = 0; loopy <3; loopy ++) {
						for (int loop = 0; loop < 3; loop ++) {
							xo[loopy][loop].setEnabled(false);
						}
					}
				}
			}
		};
		
		for (int looper = 0; looper <= 2; looper++){
			for (int looploop = 0; looploop <=2; looploop ++) {
				Button b = new Button();
				xo[looper][looploop] = b;
				add(b);
				b.addActionListener(bam);
			}
		}
	
		setVisible(true);
		pack();
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
			
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		board wut = new board();
	}
	public boolean win(Button[][] xo) {
		//checks wins vertically
		for (int lol = 1; lol <=2; lol ++){
			if (lol == 1) {
				happy = "X";
			} else {
				happy = "O";
			}
			for (int omfg = 0; omfg < 3; omfg++) {
				if (xo[0][omfg].getLabel().equals(happy) && xo[1][omfg].getLabel().equals(happy) && xo[2][omfg].getLabel().equals(happy)) {
					return true;
				}
			}
			//checks for wins horizontally
			for (int omfg = 0; omfg < 3; omfg++) {
				if (xo[omfg][0].getLabel().equals(happy) && xo[omfg][1].getLabel().equals(happy) && xo[omfg][2].getLabel().equals(happy)) {
					return true;
				}
			}
			//checks for wins vertically
			for (int omfg = 0; omfg < 3; omfg++) {
				if (xo[0][omfg].getLabel().equals(happy) && xo[1][omfg].getLabel().equals(happy) && xo[2][omfg].getLabel().equals(happy)) {
					return true;
				}
			}
			//checks for wins diagonally (l --> r)
			for (int omfg = 0; omfg < 1; omfg ++) {
				if (xo[omfg][omfg].getLabel().equals(happy) && xo[omfg + 1][omfg + 1].getLabel().equals(happy) && xo[omfg + 2][omfg + 2].getLabel().equals(happy)) {
					return true;
				}
			}
			//checks for wins diagonally (r --> l)
			for (int omfg = 0; omfg < 1; omfg ++) {
				if (xo[omfg][omfg + 2].getLabel().equals(happy) && xo[omfg + 1][omfg + 1].getLabel().equals(happy) && xo[omfg + 2][omfg].getLabel().equals(happy)) {
					return true;
				}
			}
		}
		return false;
	}
	public boolean tie (Button[][] xo) {
		for (int blah = 0; blah <3; blah ++) {
			for (int yay = 0; yay < 3; yay ++) {
				if (xo[yay][blah].getLabel().equals("")) {
					return false;
				}
			}
		}
	return true;
	}
	public void end () {
		dispose();
	}
}

