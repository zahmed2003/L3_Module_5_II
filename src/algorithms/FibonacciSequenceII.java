package algorithms;

public class FibonacciSequenceII {

	String format;
	
	public static void main(String[] args) {
		FibonacciSequenceII fs = new FibonacciSequenceII();
		String formatted = fs.formatFib(100);
		System.out.println(formatted);
	}
	
	
	public String formatFib(int nums)
	{
		for(int i = 0; i < nums; i++)
		{
			format = format + System.lineSeparator() + fib(i);
		}
		return format;
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
