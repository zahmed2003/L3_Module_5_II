package algorithms;

public class FibonacciSequenceII {

	
	public static void main(String[] args) {
		FibonacciSequenceII fs = new FibonacciSequenceII();
		System.out.println(fs.fib(10));
	}
	
	public int fib(int n)
	{
	if(n <= 1)
	{
		return n;
	}
	else
	{
		return fib(n - 1) + fib(n-2);
	}
	}
	
}
