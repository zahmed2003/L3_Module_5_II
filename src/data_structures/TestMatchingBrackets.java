package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.event.KeyEvent;
import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {
	
	int numOpen = 0;

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
		Stack<Character> check = new Stack<Character> ();
		for(int i = b.length(); i > 0; i--)
		{
			check.push(b.charAt(i));
		}
		for(int j = 0; j < check.size(); j++)
		{
			if(numOpen < 0)
			{
				numOpen = 0;
			}
			if(check.get(j).toString().equals("{"))
			{
				numOpen += 1;
			}
			if(check.get(j).toString().equals("}"))
			{
				numOpen -= 1;
			}
		}
		
		if(numOpen == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}