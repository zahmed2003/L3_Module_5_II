package other;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Hangman implements KeyListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel text = new JLabel();
	Stack<String> words = new Stack<String>();
	String word = new String();
	String underscore = new String();

	public static void main(String[] args) {
		Hangman hangman = new Hangman();
		hangman.addWords();
		hangman.createUI();
	}

	public void createUI() {

		frame.setVisible(true);
		panel.setVisible(true);
		text.setVisible(true);
		
		word = words.pop();
		underscore = under(underscore, word);

		frame.setSize(500, 100);

		frame.add(panel);
		panel.add(text);
		text.setText(underscore);

		frame.addKeyListener(this);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public void addWords() {
		words.push("one");
		words.push("two");
		words.push("three");
		words.push("four");
		words.push("five");
	}
	
	public String under(String underscore, String word)
	{
		for(int i = 0; i < word.length(); i++)
		{
			underscore = underscore + " _";
		}
		return underscore;

	}

	@Override
	public void keyTyped(KeyEvent e) {
		int keyPressed = e.getKeyChar();
		if (keyPressed == KeyEvent.VK_SPACE) {
			word = words.pop();
			underscore = "";
			underscore = under(underscore, word);

			text.setText(underscore);
		}
		for(int j = 0; j < word.length(); j++) {
		if(keyPressed == word.charAt(j))
		{
			underscore.replace(underscore.charAt(j), word.charAt(j));
		}
	
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
