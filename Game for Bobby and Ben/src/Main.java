import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Main {
	
	Random rand;
	JFrame frame;
	JTextArea textArea;
	KeyListener key;
	
	public Main() {
		rand = new Random();
		frame = new JFrame("Plight of Lord Grundy");
		textArea = new JTextArea();
		key = new KeyListener() {
			public void keyReleased(KeyEvent arg0) {
				if (arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					textArea.append("You hit Lord Grundy for " + rand.nextInt(100) + " damage!");
					textArea.append("\n\n");
				}
			}
			public void keyPressed(KeyEvent arg0) {}
			public void keyTyped(KeyEvent arg0) {}
		};
		
		textArea.setFont(new Font("Courier New", Font.BOLD, 12));
		textArea.append("Oh no...Lord Grundy approaches!");
		textArea.append("\n\n");
		textArea.addKeyListener(key);
		textArea.setCaretPosition(textArea.getText().length());
		
		frame.setSize(500,700);
		frame.setResizable(false);
		frame.add(textArea);
		frame.setVisible(true);
	}

	public static void main (String[] args){
		Main m = new Main();
	}
}