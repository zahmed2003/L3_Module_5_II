package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class Plane extends Randomness {

	int numPassengers = 100;
	int totalVenom = 0;
	int deathPer = 0;
	Random r = new Random();
	ArrayList<Snake> snakes = new ArrayList<Snake>();

	public static void main(String[] args) {
		Plane plane = new Plane();

		plane.createSnakes();
		plane.probDeath();
		System.out.println(plane.deathPer);
	}

	public void createSnakes() {
		for (int i = 0; i < 100; i++) {
			snakes.add(new Snake(rI(), rB()));
		}
	}

	public void probDeath() {
		for (int i = 0; i < 100; i++) {
			if (snakes.get(i).getVenomous() == true) {
				totalVenom = totalVenom + snakes.get(i).getViciousness();
			}
		}
		deathPer = (totalVenom * 10) / numPassengers;
	}

}
