package vehicles;

import details.Engine;
import professions.DriverName;

public class Car{

	private String carBrand;
	private String carClass;
	private int weight;
	private DriverName driver;
	private Engine engine;

	public Car(String carBrand, String carClass, int weight, DriverName driver, Engine engine) {
		this.carBrand = carBrand;
		this.carClass = carClass;
		this.weight = weight;
		this.driver = driver;
		this.engine = engine;

	}
	
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	
	public String getCarClass() {
		return carClass;
	}
	public void setCarClass(String carClass) {
		this.carClass = carClass;
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public DriverName getDriver() {
		return driver;
	}
	public void setDriver(DriverName driver) {
		this.driver = driver;
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	

	
	public void Start() {
		System.out.println("Going!");
	}
	public void Stop() {
		System.out.println("Stoped!");
	}
	public void TernRight() {
		System.out.println("Tern Right!");
	}
	public void TernLeft() {
		System.out.println("Tern Left!");
	}
	
	public String toString() {
		return "Car Brend - " + carBrand + "\n" + "Car Class - " + carClass + "\n"
	+ "Weight - " + weight + "\n" + "Driver - " + driver.ToString() + "\n" 
				+ "Engine - " + engine.toString();
	}

	
}
