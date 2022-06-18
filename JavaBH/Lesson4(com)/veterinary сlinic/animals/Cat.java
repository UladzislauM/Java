package animals;

import base.Animal;

public class Cat extends Animal {

	
	private String name;
	private String color;
	private int age;
	
	public Cat(String name, String color, int age, String food, String location) {
		this.name = name;
		this.color = color;
		this.age = age;
		this.setFood(food);
		this.setLocation(location);
	}

	@Override
	public String getFood() {
		return super.getFood();
	}

	@Override
	public void setFood(String food) {
		super.setFood(food);
	}

	@Override
	public String getLocation() {
		return super.getLocation();
	}

	@Override
	public void setLocation(String location) {
		super.setLocation(location);
	}

	@Override
	public void MakeNoise() {
		super.MakeNoise();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void Eat() {
		System.out.println("A cat eats.");
	}
	public void Sleep() {
		System.out.println("A cat sleeps...");
	}
	
	public String toString() {
		return "Name Cat: " + name + "\n" + "Color Cat: " + color + "\n"
				+ "Age Cat: " + age;
	}


}
