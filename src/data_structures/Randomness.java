package data_structures;

import java.util.Random;

public abstract class Randomness {
	
	public boolean rB()
	{
		int i;
		Random r = new Random();
		i = r.nextInt(1);
		if(i == 0) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int rI()
	{
		int i1;
		Random r1 = new Random();
		i1 = r1.nextInt(9) + 1;
		return i1;
	}

}
