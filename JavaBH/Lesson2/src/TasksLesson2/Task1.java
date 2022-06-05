package TasksLesson2;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		System.out.print("Введите первое число: ");
		int num1 = in.nextInt();
		         
		System.out.print("Введите второе число: ");
		int num2 = in.nextInt();
		String answer = num1 < num2 ? " < " : " > ";
		
		System.out.println(num1 + answer + num2 + "\n");
		
		in.close();

	}

}
