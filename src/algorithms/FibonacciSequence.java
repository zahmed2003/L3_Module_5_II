package algorithms;

import java.util.ArrayList;

public class FibonacciSequence {
	
	ArrayList<Integer> nums = new ArrayList<Integer>();
	
	
public static void main(String[] args) {
	
	FibonacciSequence fs = new FibonacciSequence();
	fs.addTerms(30, fs.nums);
	System.out.println(fs.nums);
}
	
	
public int fib(int a)
{
	if(a <= 1)
	{
		return a;
	}
	else
	{
		return fib(a - 1) + fib(a - 2);
	}
}


public void addTerms(int i, ArrayList<Integer> a)
{
	for(int j = 1; j <= i; j++)
	{
		nums.add(fib(j));
	}
}



}
