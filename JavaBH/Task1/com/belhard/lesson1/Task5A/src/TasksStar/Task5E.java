package TasksStar;
import java.util.Scanner;

public class Task5E {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		System.out.print("Input number 1: ");
		int number1 = in.nextInt();
		System.out.print("Input number 2: ");
		int number2 = in.nextInt();
		int amount = number1 + number2;
		int composition = number1 * number2;
		
		System.out.print("Amount: " + amount);
		System.out.print("\nComposition: " + composition);
		
		in.close();
	}

}
