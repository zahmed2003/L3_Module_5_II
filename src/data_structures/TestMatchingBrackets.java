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

	private boolean doBracketsMatch(String b) {
		for(int i = 0; i < b.length(); i++)
		{
			brackets.push(b.charAt(i));
		}
		
		
		for(int j = 0; j < brackets.size(); j++)
		{
			if(numClosed < 0) {numClosed = 0;}
			if(brackets.pop().toString().equals("}")) {numClosed += 1;}
			if(brackets.pop().toString().equals("{")) {numClosed-= 1;}
		}
		
		
		if(numClosed == 0) {return true;}
		else {return false;}
	}

}