package TasksStar;
import java.util.Scanner;

public class Task5A {

	public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				System.out.print("Inpun a you name: ");
				String name = in.nextLine();
				
				System.out.printf("Hello: \n" + name);
				in.close();
	}

}
