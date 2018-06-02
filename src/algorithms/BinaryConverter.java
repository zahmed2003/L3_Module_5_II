package algorithms;

import java.util.Stack;

public class BinaryConverter 
{

	Stack<Integer> powers = new Stack<Integer>();
	
	
	
	public static void main(String[] args) {
		BinaryConverter bc = new BinaryConverter();
		bc.addPowers(10);
		System.out.print(bc.powers);
	}
	
	
	
	public void addPowers(int i)
	{
		for(int j = 0; j < i; j++)
		{
			powers.push((int) Math.pow(2, j));
		}
	}
	
	
}
