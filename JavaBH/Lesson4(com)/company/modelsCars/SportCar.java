package modelsCars;

import vehicles.Car;

public class SportCar extends Car {

	private int maxSpeed;
	
	public SportCar(String carBrand, String carClass, int weight, String nameDriver, int drivingExperience, int power,
			String manufacturer, int maxSpeed) {
		super(carBrand, carClass, weight, nameDriver, drivingExperience, power, manufacturer);
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
