package data_structures;

import java.util.ArrayList;

public class Decorator {
	static ArrayList<Ornament> boxOfDecorations = new ArrayList<Ornament>();
	
	
	public static void main(String[] args) {
		
	addOrnament();
		
	for(Ornament i: boxOfDecorations)
	{
		i.hang("red");
	}
	
	}
	
	public static void addOrnament()
	{
		for(int i = 0; i < 10; i++)
		{
			boxOfDecorations.add(new Ornament());
		}
	}
	
	
}
