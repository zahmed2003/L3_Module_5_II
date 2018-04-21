package data_structures;

import java.util.ArrayList;

public class ListIterationFluent 
{

	ArrayList<Egg> carton = new ArrayList<Egg>();
	{
	
	for(Egg i: carton)
	{
		i.crack();
	}
	
	
}



class Egg {
void crack(){} 
}
}

