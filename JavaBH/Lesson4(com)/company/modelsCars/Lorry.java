package modelsCars;

import vehicles.Car;

public class Lorry extends Car{

	private int loadCapacityOfTheBody;
	
	public Lorry(String carBrand, String carClass, int weight, String nameDriver,
			int drivingExperience, int power, String manufacturer, int loadCapacityOfTheBody) {
		super(carBrand, carClass, weight, nameDriver, drivingExperience, power, manufacturer);

		this.loadCapacityOfTheBody = loadCapacityOfTheBody;
	}

	public int getLoadCapacityOfTheBody() {
		return loadCapacityOfTheBody;
	}

	public void setLoadCapacityOfTheBody(int loadCapacityOfTheBody) {
		this.loadCapacityOfTheBody = loadCapacityOfTheBody;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "Load Capacity Of The Body: " + loadCapacityOfTheBody;
	}
	

	
}
