package TasksStar;
import java.util.ArrayList;
import java.util.Scanner;

public class Task6A {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		
		System.out.print("Enter n integers: ");
		String numbers = in.nextLine();
		String[] num = numbers.split(" ");
		ArrayList<Integer> numbersAfter = new ArrayList<Integer>();
 
		for (String nums : num) {
			if (isNumeric(nums)) {
				numbersAfter.add(Integer.parseInt(nums));	
			}
		}
		
		System.out.print("Odd numbers: ");
		for (int numbersAfters : numbersAfter) {
			if (numbersAfters % 2 == 1) {
				System.out.print(numbersAfters + ", "); 
			}
			
		 }
		
		System.out.print("\nEven numbers: ");
		for (int numbersAfters : numbersAfter) {
			if (numbersAfters % 2 == 0) {
				System.out.print(numbersAfters + ", "); 
			}
			
		 }
		
		in.close();
	}
	
	 public static boolean isNumeric(String str) {
	        try {
	            Double.parseDouble(str);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
}
