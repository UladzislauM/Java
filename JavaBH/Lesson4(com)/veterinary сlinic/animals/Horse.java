package animals;

import base.Animal;

public class Horse extends Animal {

	
	private String name;
	private boolean manual;
	private int weight;
	
	public Horse(String name, boolean manual, int weight, String food, String location) {
		super(food, location);
		this.name = name;
		this.manual = manual;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isManual() {
		return manual;
	}
	public void setManual(boolean manual) {
		this.manual = manual;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void Eat() {
		System.out.println("A horse eats.");
	}
	public void Sleep() {
		System.out.println("A horse sleeps...");
	}
}
