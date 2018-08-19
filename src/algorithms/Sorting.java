package algorithms;

import java.util.ArrayList;
import java.util.Random;

public class Sorting 
{
	
	static boolean isSwitch = false;
	
	public static void main(String[] args) {
		
		ArrayList<Integer> r = new ArrayList<Integer>();
		int length = 1000;
		
		for(int i = 0; i < length; i++)
		{
			r.add(new Random().nextInt(length*5));
		}
		
		System.out.println(sort(r));
		
	}
	
	public static ArrayList<Integer> sort(ArrayList<Integer> s)
	{
		
		for(int i = 0; i < s.size() - 1; i++)
		{
			if(s.get(i) > s.get(i+1)) 
			{
				int n = s.get(i);
				int m = s.get(i + 1);
				
				s.set(i, m);
				s.set(i + 1, n);
				
				isSwitch = true;
			}
		}
		
		if(isSwitch == false) {return s;}
		
		isSwitch = false;
		
		return sort(s);
	}
	
}
