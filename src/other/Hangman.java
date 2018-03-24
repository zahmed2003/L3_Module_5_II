package other;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hangman implements KeyListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text = new JTextField();
	String word = new String();
	Stack<String> words = new Stack<String>();

	public static void main(String[] args) {
		Hangman hangman = new Hangman();
		hangman.addWords();
		hangman.createUI();
	}

	public void createUI() {

		frame.setVisible(true);
		panel.setVisible(true);
		text.setVisible(true);

		frame.setSize(500, 100);

		frame.add(panel);
		panel.add(text);
		text.setText(word);

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

	@Override
	public void keyTyped(KeyEvent e) {
		int keyPressed = e.getKeyCode();
		if (keyPressed == KeyEvent.VK_SPACE) {
			System.out.println("x");
			word = words.pop();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
