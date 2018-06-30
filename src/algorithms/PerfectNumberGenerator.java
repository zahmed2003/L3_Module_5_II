package algorithms;

import java.util.ArrayList;

public class PerfectNumberGenerator 
{
	
	ArrayList<Integer> divisors;
	int sum;
	
public static void main(String[] args) 
{
	PerfectNumberGenerator png = new PerfectNumberGenerator();
	png.isPerfect(10);
}


public void isPerfect(int k)
{
	sum = 0;
	
	divisors = new ArrayList<Integer>();
	
	
	for(int n = 1; n <= k; k++)
	{
		
	for(int i = 1; i <= n/2; i++)
	{
		if(n%i == 0) {divisors.add(i);}
	}
	
	for(int j = 0; j < divisors.size(); j++)
	{
		sum += divisors.get(j);
	}
	
	if(sum == n)
	{
		System.out.println(n);
	}
	
	
	//redo
	sum = 0;
	
	for(int l = 0; l < divisors.size(); l++)
	{
		divisors.remove(l);
	}
	
	}
	
}

}
