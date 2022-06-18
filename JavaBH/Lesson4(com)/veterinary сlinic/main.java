import java.util.ArrayList;
import java.util.List;
import animals.Cat;
import animals.Dog;
import animals.Horse;
import base.Animal;
import humans.Veterinarian;

public class main {

	public static void main(String[] args) {
		
		List<Animal> animals = new ArrayList<Animal>();
		Veterinarian veterinarian = new Veterinarian();

			animals.add(new Cat("Barsik", "green", 4, "sausage", "Minsk"));
			animals.add(new Dog("Shwarkhi", "yard", 2, "cutlet", "Orsha"));
			animals.add(new Horse("Mustang", false, 1, "grass", "Molodechno"));
			
			for (Animal animal : animals) {
				veterinarian.theatAnimal(animal);
			}

	}

}
