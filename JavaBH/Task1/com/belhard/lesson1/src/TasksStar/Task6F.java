package TasksStar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task6F {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		String numbers = in.nextLine();
		//дробим строку на подстроки в коллекции по разделителю (пробел)
		String[] num = numbers.split(" "); 
		ArrayList<Integer> numbersAfter = new ArrayList<Integer>();
		ArrayList<Integer> num3 = new ArrayList<Integer>();
		ArrayList<Integer> num3Rev = new ArrayList<Integer>();
		int countNum = 0;//пременная для хранения колличества знаков в числе
		
		for (String nums : num) {
			numbersAfter.clear();
			if (isNumeric(nums)) {//проверяем является ли введенное значение числом
				numbersAfter.add(Integer.parseInt(nums));
				
				//Вычисляем количество цифр в числе
				for (int i = 0; i < nums.length(); i++) {
					countNum++;
				}
				
				if (countNum >= 3) {
					String[] num3int = nums.split("");//Дробим число на 3 знака и более
					for (String  num3ints : num3int) {
						//Переводим строковую коллекцию в численную
						num3.add(Integer.parseInt(num3ints));
					}
					
					countNum = 0;
					num3.clear();//Очищаем коллекцию для следующей итерации
					
					for (String num3ints : num3int) {
						//Добавляем в массив все числа более 3-х знаков
						num3.add(Integer.parseInt(num3ints));
					}
					String[] copyNum3int = num3int; // создаем копию коллекции всех знаков числа
					// Поворачиваем коллекцию чисел более 3-х знаков.
					num3Rev.clear();
					for (String  copyNum3ints : copyNum3int) {
						//Переводим строковую коллекцию в численную
						num3Rev.add(Integer.parseInt(copyNum3ints));
					}
					
					//переворачиваем массив числа
					Collections.reverse(num3Rev);
					
					boolean isEqual = num3.equals(num3Rev); //сравниваем числа
					if (isEqual) {
						for (Integer numbersAfters : numbersAfter) {
							System.out.print(numbersAfters + " - Polindrom!\n");
							if (numbersAfter.size() > 1 && numbersAfter.get(numbersAfter.size() - 1) != numbersAfters) {
								System.out.print(", ");
							}
							
						}
						
					}
			    }
		    }
		}
		
		in.close(); //Закрываем поток считывающий данные
		
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
