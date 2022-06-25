package task1_3;

public class NaturalNumber {

	public static void main(String[] args) {
		int n = 25;
		
	 nateralNumber(n);
		
	}
	
	static int nateralNumber(int nN){
		System.out.println(nN);
		if (nN == 1) {
			return 1;
		}
		return nateralNumber(nN-1);
	}

}
