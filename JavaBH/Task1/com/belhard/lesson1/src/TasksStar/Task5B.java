package TasksStar;
import java.util.Scanner;

public class Task5B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input words: ");
		String words = in.nextLine();
		
		//считываем введенные данные из консоли и переворачиваем их
		String reverse = new StringBuffer(words).reverse().toString();
		
		System.out.printf("Revers words: \n" + reverse);
		in.close();
	}

}
