package animals;

import base.Animal;

public class Dog extends Animal{

	
	private String name;
	private String breed;
	private int heightAtTheWithers;
	
	public Dog(String name, String breed, int heightAtTheWithers, String food, String location) {
		this.name = name;
		this.breed = breed;
		this.heightAtTheWithers = heightAtTheWithers;
		this.setFood(food);
		this.setLocation(location);
	}
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getHeightAtTheWithers() {
		return heightAtTheWithers;
	}
	public void setHeightAtTheWithers(int heightAtTheWithers) {
		this.heightAtTheWithers = heightAtTheWithers;
	}
	
	public void Eat() {
		System.out.println("A dog eats.");
	}
	public void Sleep() {
		System.out.println("A dog sleeps...");
	}
}
