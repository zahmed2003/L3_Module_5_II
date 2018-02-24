package data_structures;

import java.util.ArrayList;

public class Plane extends Randomness{
	
	int numPassengers;
	int venom = 0;
	ArrayList <Snake> snakes = new ArrayList <Snake>();
	
	
	
	public void createSnakes()
	{
		for(int i = 0; i < 100; i++)
		{
			snakes.add(new Snake(rI(), rB()));
		}
	}

	public void probDeath()
	{
		
	}
	
}
