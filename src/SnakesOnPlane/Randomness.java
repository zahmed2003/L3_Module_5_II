package SnakesOnPlane;

import java.util.Random;

public abstract class Randomness 
{

	public boolean rB()
	{
		Random r = new Random();
		return r.nextBoolean();
	}
	
	public int rI()
	{
		Random r = new Random();
		return (r.nextInt(9) + 1);
	}
	
}
