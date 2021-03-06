package TasksStar;
import java.util.ArrayList;
import java.util.Scanner;

public class Task6C {

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
			
			ArrayList<Integer> divisibleNums = new ArrayList<Integer>(); //создаем коллекцию для конечных чисел чисел
			
			for (int numbersAfters : numbersAfter) {
				if (numbersAfters % 3 == 0 || numbersAfters % 9 == 0) {//проверка делимости на нужные величины
					divisibleNums.add(numbersAfters);//Добавление нужных чисел в коллекцию
				}
			}
			
			System.out.print("Numbers that are divisible by 3 or by 9: ");
			for (int divisibleNumss : divisibleNums) {
				System.out.print(divisibleNumss + ", ");//Вывод на экран нужных значений
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
