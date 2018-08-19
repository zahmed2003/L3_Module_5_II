package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.event.KeyEvent;
import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {
	
	int numClosed = 0;

	Stack <Character> brackets = new Stack <Character>();

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}")); 
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS
	// A MATCHING CLOSING BRACKET

	private boolean doBracketsMatch(String s) {
	
		int sum = 0;
		Stack<Character> c = new Stack<Character>();
		char[] text = s.toCharArray();
		
		for(int i = 0; i < text.length; i++)
		{
			if(text[i] == '{' || text[i] == '}') {c.push(text[i]);}
		}
		
		int length = c.size();
		
		if(c.get(0) == '}') {return false;}
		
		
		for(int j = 0; j < length; j++)
		{
			char ch = c.pop();
			
			if(ch == '}') {sum++;}
			else if(ch == '{') {sum--;}
			
		}
		
		if(sum == 0) {return true;}
		else {return false;}
		
	}
	
}