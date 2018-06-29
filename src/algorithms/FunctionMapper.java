package algorithms;

import java.util.HashMap;

public class FunctionMapper 
{
	
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	
	public static void main(String[] args) {
		
		FunctionMapper fm = new FunctionMapper();
		fm.squared(-10, 10);
		System.out.println(fm.map);
		
	}
	
	public void squared(int start, int stop)
	{
		for(int i = start; i <= stop; i++)
		{
			map.put(i, (int) Math.pow(i, 2));
		
		}
	}
	

}
