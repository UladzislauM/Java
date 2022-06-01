package TasksStar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Task6B {

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
		
		Collections.sort(numbersAfter, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1.toString().compareTo(o2.toString());
			}
		});
		
		System.out.print("\nLargest number: ");
		System.out.print(numbersAfter.get(numbersAfter.size() - 1)); 
		
		System.out.print("\nSmallest number: ");
		System.out.print(numbersAfter.get(0)); 
				
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
