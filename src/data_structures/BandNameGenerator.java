package data_structures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/data_structures/Nouns"));
			
			String s;
			try {
				s = br.readLine();
				
				while(s != null)
				{
					noun.add(s);
					s = br.readLine();
				}
				br.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public void addAdj()
	{
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("src/data_structures/Adjectives"));
			
			String s;
			try {
				s = br.readLine();
				
				while(s != null)
				{
					adj.add(s);
					s = br.readLine();
				}
				br.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	} 
	
	
	
	public void bandName()
	{
		rAdj = r.nextInt(adj.size());
		rNoun = r.nextInt(noun.size());
		System.out.println(adj.get(rAdj) + " " + noun.get(rNoun));
	}
	
}
