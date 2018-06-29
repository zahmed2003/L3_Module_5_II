package algorithms;

import java.util.ArrayList;

public class GCDAlgorithm 
{
	ArrayList<Integer> remainder;
	float r;
	
	public static void main(String[] args) 
	{
		GCDAlgorithm gcda = new GCDAlgorithm();
		System.out.println(gcda.gcd(100, 90));
	}
	
	public float gcd(float a, float b)
	{
		float remainder = Math.round((a/b - Math.floor(a/b))*b);
		if(remainder == 0)
		{
			
		}
	}
}
