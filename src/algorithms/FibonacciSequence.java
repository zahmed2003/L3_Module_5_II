package algorithms;

public class FibonacciSequence {
	
	double phi = (1 + Math.sqrt(5))/2;
	double Phi = (1 - Math.sqrt(5))/2;
	double fib;
	int num;
	
	public static void main(String[] args) {
		FibonacciSequence fs = new FibonacciSequence();
		fs.generateNums(94);
		
	}
	
	public void generateNums(int numTimes)
	{
		for(int i = 0; i < numTimes; i++)
		{
		fib = (Math.pow(phi, i) - Math.pow(Phi, i))/Math.sqrt(5);
		fib = Math.round(fib);
		System.out.println(fib);
		}
	}

}
