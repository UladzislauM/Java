package TasksStar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Task6E {

	public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
			
			System.out.print("Enter numbers: ");
			String numbers = in.nextLine();
			//дробим строку на подстроки в коллекции по разделителю (пробел)
			String[] num = numbers.split(" "); 
			ArrayList<Integer> numbersAfter = new ArrayList<Integer>();
			
			for (String nums : num) {
				if (isNumeric(nums)) {//проверяем является ли введенное значение числом
					numbersAfter.add(Integer.parseInt(nums));	
				}
			}
			
			//Сортируем числа по возрастанию
			Collections.sort(numbersAfter, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return o1.toString().compareTo(o2.toString());
				}
			});
			
			for (Integer numbersAfters : numbersAfter) {
				System.out.print(numbersAfters);
				//Условие для запятой
				if (numbersAfter.size() > 1 && numbersAfter.get(numbersAfter.size() - 1) != numbersAfters) {
					System.out.print(", ");
				}
			}
			
			System.out.print("\n");
			
			// Поворачиваем коллекцию.
			Collections.reverse(numbersAfter);
			for (Integer numbersAfters : numbersAfter) {
				System.out.print(numbersAfters);
				if (numbersAfter.size() > 1 && numbersAfter.get(numbersAfter.size() - 1) != numbersAfters) {
					System.out.print(", ");
				}
			}
			
			in.close();//Закрываем поток считывающий данные

	}
	 public static boolean isNumeric(String str) {//Метод проверки на число
	        try {
	            Double.parseDouble(str);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }

}
