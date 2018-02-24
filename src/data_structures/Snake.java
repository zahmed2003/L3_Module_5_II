package data_structures;

public class Snake{

	int viciousness;
	boolean venomous;
	
	public Snake(int viciousness, boolean venemous)
	{
		this.viciousness = viciousness;
		this.venomous = venemous;
	}
	
	public int getViciousness()
	{
		return viciousness;
	}
	
	public boolean getVenomous()
	{
		return venomous;
	}
	
}
