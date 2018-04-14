package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class BandNameGenerator 
{

	ArrayList<String> adj = new ArrayList<String>();
	ArrayList<String> noun = new ArrayList<String>();
	Random r = new Random();
	int rAdj;
	int rNoun;
	
	public static void main(String[] args) {
		BandNameGenerator bng = new BandNameGenerator();
		bng.addNouns();
		bng.addAdj();
		bng.bandName();
	}
	
	
	
	public void addNouns()
	{
		
	}
	
	public void addAdj()
	{
		
	}
	
	public void bandName()
	{
		rAdj = r.nextInt(adj.size());
		rNoun = r.nextInt(noun.size());
		System.out.println(adj.get(rAdj) + " " + noun.get(rNoun));
	}
	
}
