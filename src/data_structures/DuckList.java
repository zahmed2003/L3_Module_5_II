package data_structures;

import java.util.ArrayList;

public class DuckList 
{

	
	ArrayList<Duck> ducks = new ArrayList<Duck>();
	
	public static void main(String[] args) 
	{
		DuckList dl = new DuckList();
		dl.addDucks();
		dl.feedDucks();
	}
	
	public void addDucks()
	{
		ducks.add(new Duck("Daffy"));
		ducks.add(new Duck("Waddles"));
		
	}
	
	public void feedDucks()
	{
		for(Duck i : ducks)
		{
			i.feed();
			System.out.println("Duck Fed");
		}
	}
	
}
