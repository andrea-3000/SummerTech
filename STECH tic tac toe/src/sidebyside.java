import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class sidebyside extends JComponent{
board awut;
popup ablah;
tiepopup heyhey;
	public sidebyside (board wut, popup blah) {
		setLayout(new BorderLayout());
		Button yeah = new Button ("yeah I do!");
		Button nope = new Button ("nah");
		awut = wut;
		ablah = blah;
		
		add (yeah, BorderLayout.WEST);
		add (nope, BorderLayout.EAST);
	
	ActionListener yup = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			board heyboard = new board();
			awut.end();
			ablah.end();

		}
		
	};
	ActionListener no = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
	};
	yeah.addActionListener(yup);
	nope.addActionListener(no);
	}
	
	public sidebyside (board wut, tiepopup eh) {
		setLayout(new BorderLayout());
		Button yeah = new Button ("yeah I do!");
		Button nope = new Button ("nah");
		awut = wut;
		heyhey = eh;
		
		add (yeah, BorderLayout.WEST);
		add (nope, BorderLayout.EAST);
	
	ActionListener yup = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			board heyboard = new board();
			awut.end();
			heyhey.end();
		}
		
	};
	ActionListener no = new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
		
	};
	yeah.addActionListener(yup);
	nope.addActionListener(no);
	}
}