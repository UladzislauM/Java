package modelsCars;

import details.Engine;
import professions.DriverName;
import vehicles.Car;

public class Lorry extends Car{

	private int loadCapacityOfTheBody;
	
	public Lorry(String carBrand, String carClass, int weight, DriverName driver, Engine engine,
			int loadCapacityOfTheBody) {
		super(carBrand, carClass, weight, driver, engine);
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
