import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class tiepopup extends JFrame{
	sidebyside hooah;
	
	public tiepopup(board wut) {
		setLayout(new BorderLayout());
		JLabel tie = new JLabel("It's a tie game.");
		hooah = new sidebyside(wut, this);
		add (hooah, BorderLayout.SOUTH);		
		
		add(tie, BorderLayout.CENTER);
		setVisible(true);
		pack();
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void end() {
		dispose();
		
	}

}
