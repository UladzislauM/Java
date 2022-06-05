package TasksLesson2;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		byte choice = 0;
		int num1 = 0;
		int num2 = 0;
		
		do {
		System.out.println("Enter 1 num: ");
		num1 = in.nextInt();
		         
		System.out.println("Enter 2 num: ");
		num2 = in.nextInt();
		
		System.out.println("Num1 * Num2 = " + (num1 * num2));
		
		System.out.println("would you like to continue? 1 - yes, any key is not");
		choice = in.nextByte();
		}
		while(choice == 1);
		//проверок не делал, так как понимаю что смысл задания не в этом.
		
		in.close();

	}

}
