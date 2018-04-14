package data_structures;

import java.util.ArrayList;

public class ArrayOverload {

	ArrayList<Integer> overload = new ArrayList<Integer>();

	public static void main(String[] args) {
		ArrayOverload over = new ArrayOverload();
		over.overload();
		
	}

	public void overload() {
		
	for(int i = 0; i <= 9999; i++)
	{
		overload.add(i);
		overload();
	}
	
	}
}
