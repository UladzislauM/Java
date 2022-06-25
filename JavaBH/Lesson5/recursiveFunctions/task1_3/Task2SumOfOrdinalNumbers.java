package task1_3;

public class Task2SumOfOrdinalNumbers {

	public static void main(String[] args) {
		int n = 4;
		 System.out.println(ordinalNumber(n));
		}
		static int ordinalNumber(int nN){
			if (nN == 2) {
				return nN += 1;
			}
			return nN += ordinalNumber(nN-1);
		}
}
