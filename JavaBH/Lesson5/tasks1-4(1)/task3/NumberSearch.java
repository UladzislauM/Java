package task3;

public class NumberSearch {

	public static void main(String[] args) {
		int numbers = 120;
		boolean [] simpleNumbers = new boolean [numbers];
		simpleNumbers[0] = simpleNumbers [1] = true;
		
		
		
		for (int i = 2; i < simpleNumbers.length; i++) {
			if (!simpleNumbers[i]) {
				for (int j = i; j < simpleNumbers.length; j++) {
					if (j % i == 0 && i!=j) {
						simpleNumbers[j] = true;
						
					}
				}
			}
		}
		
		for (int i = 3; i < simpleNumbers.length; i++) {
			if(simpleNumbers[i]) {
			System.out.println(i + "\n");
			}
		}

	}
	
//	static int 

}
