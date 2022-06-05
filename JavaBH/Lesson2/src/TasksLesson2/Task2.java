package TasksLesson2;

public class Task2 {

	public static void main(String[] args) {
		int population = 10_000_000;
		int birhtRateInt = 14;
		int birthRate = birhtRateInt * 10_000;
		int mortalityInt = 8;
		int mortality = mortalityInt * 10_000;
		int duration = 10;
		
		for (int i = 0; i < duration; i++) {
			population += birthRate - mortality;
		}
		
		System.out.println("Population in 10 ears = " + population);

	}

}
