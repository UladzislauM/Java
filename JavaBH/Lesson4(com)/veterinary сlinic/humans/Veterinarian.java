package humans;

import base.Animal;

public class Veterinarian {

	public void theatAnimal(Animal animal) {
		System.out.println( "The animal eats: " + animal.getFood() + "\n" 
	+ "Origin of the animal: " + animal.getLocation());
	}
}
