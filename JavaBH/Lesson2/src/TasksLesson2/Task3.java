package TasksLesson2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.println("Enter loan amount: ");
		double amount = in.nextInt();
		         
		System.out.println("Enter loan term In months: ");
		int term = in.nextInt();
		
		double persents = 0.07;
		
		for (int i = 0; i < term; i++) {
			amount += amount * persents;
		}
		System.out.println("Your amount = " + amount);
		
		in.close();
	}

}
