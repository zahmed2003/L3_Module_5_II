package other;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Hangman implements KeyListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel text = new JLabel();
	JLabel Lives = new JLabel();
	int numLives = 9;
	Stack<String> words = new Stack<String>();
	String word = new String();
	String underscore = new String();
	String IWord = new String();

	public static void main(String[] args) {
		Hangman hangman = new Hangman();
		hangman.addWords();
		hangman.createUI();
	}

	public void createUI() {

		frame.setVisible(true);
		panel.setVisible(true);
		text.setVisible(true);
		Lives.setVisible(true);
		
		word = words.pop();
		underscore = under(underscore, word);
		
		Lives.setText(Integer.toString(numLives));
		Lives.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));


		frame.setSize(500, 100);

		frame.add(panel);
		panel.add(text);
		panel.add(Lives);
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
			if(IWord.equals(""))
			{
			IWord = underscore.substring(0, j) + word.charAt(j) + underscore.substring(j, word.length());
			text.setText(IWord);
			}
			else
			{
				IWord = IWord.substring(0, j) + word.charAt(j) + IWord.substring(j, word.length() - 1);
				text.setText(IWord);
			}
			
		}
		
		if(keyPressed != (word.charAt(word.length() - 1) | word.charAt(word.length() - 2) | word.charAt(word.length() - 3)))
		{
			numLives -= 1;
			Lives.setText(Integer.toString(numLives));
		}
		
		if(IWord.equals(word))
		{
			IWord = "";
			word = words.pop();
			underscore = "";
			underscore = under(underscore, word);

			text.setText(underscore);
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
