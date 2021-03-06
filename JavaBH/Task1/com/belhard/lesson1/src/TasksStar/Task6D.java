package TasksStar;
import java.util.ArrayList;
import java.util.Scanner;

public class Task6D {

	public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
			
			System.out.print("Enter numbers: ");
			String numbers = in.nextLine();
			String[] num = numbers.split(" "); //дробим строку на подстроки в коллекции по разделителю (пробел)
			ArrayList<Integer> numbersAfter = new ArrayList<Integer>();
			ArrayList<Integer> num3 = new ArrayList<Integer>();
			int countNum = 0;//пременная для хранения колличества знаков в числе
	 
			for (String nums : num) {
				countNum = 0;
				if (isNumeric(nums)) {//Проверяем является ли строка именно числом
					for (int i = 0; i < nums.length(); i++) {
						countNum++;
					}
					if (countNum == 3) {
						String[] num3int = nums.split("");//Дробим число на 3 знака
						num3.clear();//Очищаем коллекцию для следующей итерации
						
						for (String num3ints : num3int) {
							//Добавляем в массив все знаки 3-х значного числа
							num3.add(Integer.parseInt(num3ints));
						}
						
							if (num3.get(0) != num3.get(1)) {
								if (num3.get(0) != num3.get(2)) {
									if (num3.get(1) != num3.get(2)) {
										/*Вставляем 3-х значные числа, в которых 
										не повторяются знаки в отдельный массив*/
										numbersAfter.add(Integer.parseInt(nums));
									}
								}
							}
						
					}
					
				}
	
			}
			System.out.print("All three-digit numbers with no identical digits in the decimal notation: ");
			for (Integer numbersAfters : numbersAfter) {
				System.out.print(numbersAfters);
				//Условие для запятой
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
