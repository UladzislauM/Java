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
		String[] num = numbers.split(" ");//дробим строку на подстроки в коллекции по разделителю (пробел)
		ArrayList<Integer> numbersAfter = new ArrayList<Integer>();//создаем коллекцию для чисел
 
		for (String nums : num) {
			if (isNumeric(nums)) {//проверяем является ли введенное значение числом
				numbersAfter.add(Integer.parseInt(nums));	
			}
		}
		
		Collections.sort(numbersAfter, new Comparator<Integer>() {//Сортируем числа по возрастанию
			public int compare(Integer o1, Integer o2) {
				return o1.toString().compareTo(o2.toString());
			}
		});
		
		System.out.print("\nLargest number: ");
		System.out.print(numbersAfter.get(numbersAfter.size() - 1)); //выводим в консоль максимальное число
		
		System.out.print("\nSmallest number: ");
		System.out.print(numbersAfter.get(0)); //выводим в консоль минимальное число
				
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
