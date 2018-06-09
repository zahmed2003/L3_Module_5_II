package algorithms;

import java.util.ArrayList;

public class FibonacciSequenceII {

	ArrayList<Integer> nums = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		
		FibonacciSequenceII fs = new FibonacciSequenceII();
		fs.generateFib(fs.nums, 46);
		
		System.out.println(fs.nums);
		
	}
	
	
	public int fib(int i)
	{
		if(i <= 1)
		{
			return i;
		}
		else
		{
			return fib(i-1) + fib(i - 2);
		}
	}
	
	
	public void generateFib(ArrayList<Integer> a, int n)
	{
		for(int i = 1;  i <= n; i++ )
		{
			a.add(fib(i));
		}
	}
	
	
}
