package TasksStar;
import java.util.Scanner;
import java.util.Random;

public class Task5C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many random digits can I output?: ");
		int numOfNumbers = in.nextInt();
		System.out.print("With the transition to a new line? (1. Yes, 2. No):");
		int checkNewString = in.nextInt();
		
		Random rand = new Random();
		
		 for (int iCount = 0; iCount < numOfNumbers; iCount++)
	     {
			int randomNumber = rand.nextInt(100);
			if(checkNewString == 1)
			{
			 System.out.printf("\n Random number: " + randomNumber);
			}
			if (checkNewString == 2)
			{
		     System.out.printf(" Random number: " + randomNumber + ", ");
			}
	     }
		in.close();
	}

}
