package TasksStar;
import java.util.Scanner;
import  java.util.Date;

public class Task5F {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Date date = new Date();

        long start = System.currentTimeMillis();//получение стартового значения в миллисекундах
        System.out.println("Data Start: " + date.toString());
		System.out.print("Uladzislau M.");
		in.close();
		long end = System.currentTimeMillis();//получение конечного значения в миллисекундах
		long diff = end - start;
        System.out.println("\nData End: " + date.toString() + "\nTime run program: " + diff);
	}

}
