package data_structures;

import java.util.ArrayList;

public class ArrayOverload {

	ArrayList<Integer> overload = new ArrayList<Integer>();

	public static void main(String[] args) {
		ArrayOverload over = new ArrayOverload();
		over.overload();
		System.out.println(over.overload);
	}

	public void overload() {
		for (int i = 0; i <= 999 * 999; i++) {
			overload.add(i);
			for (int j = 0; j <= i * 999; j++) {
				overload.add(j);
			}
		}
	}
}
