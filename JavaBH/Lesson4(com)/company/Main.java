import java.sql.Driver;

import details.Engine;
import modelsCars.Lorry;
import modelsCars.SportCar;
import professions.DriverName;
import vehicles.Car;

public class Main {

	public static void main(String[] args) {
		
		Engine eng1 = new Engine(120, "ZAZ");
		Engine eng2 = new Engine(150, "Lada");
		DriverName driv1 = new DriverName("Vasya", 21);

		Car lorryCar = new Lorry("Matiz", "Compact", 1100, driv1, eng1, 500);
		Car sportCar = new SportCar("Granta", "SS", 800, driv1, eng2, 320);
		
		System.out.println(lorryCar.toString());
		System.out.println(sportCar.toString());	
		
	}

}
