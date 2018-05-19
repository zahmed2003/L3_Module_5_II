package SnakesOnPlane;

import java.util.ArrayList;

public class Plane extends Randomness
{
	ArrayList<Snake> snakes = new ArrayList<Snake>();
	
	public static void main(String[] args) {
		Plane p = new Plane();
		p.createSnakes(p.snakes);
		System.out.println(p.probDeath(100));
	}
	
	
	
	public void createSnakes(ArrayList<Snake> s)
	{
		for(int i = 0; i < 100; i++)
		{
			snakes.add(new Snake(rI(), rB()));
		}
	}
	
	public int probDeath(int numPassengers)
	{
		int sumViVe = 0;
		
		for(Snake s: snakes)
		{
			if(s.getVe() == true) {sumViVe += s.getVi(); }
		}
		return ((sumViVe*10)/numPassengers);
		
	}
	
}
