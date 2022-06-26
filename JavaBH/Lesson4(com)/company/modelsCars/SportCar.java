package modelsCars;

import details.Engine;
import professions.DriverName;
import vehicles.Car;

public class SportCar extends Car {

	private int maxSpeed;
	
	public SportCar(String carBrand, String carClass, int weight, DriverName driver, Engine engine, int maxSpeed) {
		super(carBrand, carClass, weight, driver, engine);
		this.maxSpeed = maxSpeed;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Max Speed: " + maxSpeed;
	}

	
}
