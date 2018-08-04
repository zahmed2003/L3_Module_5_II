package algorithms;

public class GCDAlgorithm 
{
	
	public static void main(String[] args) 
	{
		GCDAlgorithm gcda = new GCDAlgorithm();
		System.out.println(gcda.gcd(102384, 918273));
	}
	
	public float gcd(float a, float b)
	{
		float r = Math.round((a/b - Math.floor(a/b))*b);
		
		if(r == 0)
		{
			return b;
		}
		else
		{
			return gcd(b, r);
		}
	}
}
