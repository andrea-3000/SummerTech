import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class popup extends JFrame{
sidebyside hooah;
	public popup (board wut) {
		setLayout(new BorderLayout());
		ImageIcon woohoo= new ImageIcon("imgres.jpg");
		JLabel hooray = new JLabel(woohoo);
		hooah = new sidebyside(wut, this);
		add (hooah, BorderLayout.SOUTH);
		
		add (hooray, BorderLayout.CENTER);
		setVisible(true);
		pack();
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	public void end () {
		dispose();
	}

}
