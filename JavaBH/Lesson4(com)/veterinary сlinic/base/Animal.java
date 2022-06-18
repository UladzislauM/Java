package base;

public abstract class Animal {

	private String food;
	private String location;
	
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void MakeNoise() {
		System.out.println("The animal is making noise!!!");
	}
	public void Eat() {
		System.out.println("The animal eats.");
	}
	public void Sleep() {
		System.out.println("The animal is sleep...");
	}
}
