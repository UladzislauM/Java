package TasksStar;
import java.util.Scanner;

public class Task5D {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String correntPass = "qw34";
		System.out.print("Input password: ");
		String password = in.nextLine();

		if (password.equals(correntPass)) {
			System.out.print("Ok");
		}
		else {
			System.out.print("Incorrect Password!!!");
		}
        in.close();
	}

}
