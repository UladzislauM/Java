import modelsCars.Lorry;
import modelsCars.SportCar;
import vehicles.Car;

public class mains {

	public static void main(String[] args) {

		Car lorryCar = new Lorry("Matiz", "Compact", 1100, "Jenya", 8, 80, "Zaz", 500);
		Car sportCar = new SportCar("Granta", "SS", 800, "Valodya", 10, 470, "Lada", 320);
		
		System.out.println(lorryCar.toString());
		System.out.println(sportCar.toString());	}

}
