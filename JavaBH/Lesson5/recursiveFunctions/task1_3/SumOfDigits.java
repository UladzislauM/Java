package task1_3;

public class SumOfDigits {

	public static void main(String[] args) {
		int n = 4341;
		
		 System.out.println(sumNumber(n));
		 
		 // Описание смысла (для себя) - вызываю метод, который вызывает рекурсивную функцию (так же метод). В первом методе сразу же перевожу число в строку,
		 //передаю данные в массив (отправляю его в рекурсию). Создаю так же (в первом метогде) переменную для хранения суммы, для хранения позиции для записи числа.
		 //Далее, рекурсия, записываю на каждой итерации цифру в сумму и вызываю сам метод снова, выход - сравнение переменной позиции числа и длинны строки с чяислом.
		 // проще сделать точно можно, но нет времени) как всегда) 
			
		}
		
		static int sumNumber(int nN){
           int sum = 0;
           int check = 0;
           
            String[] lengthNum = (Integer.toString(nN)).split("");
			return sum = itsSum(lengthNum, sum, check);
		}
		
		static int itsSum(String[]lengthNum, int sum, int check){
			if (check == lengthNum.length - 1) {
				return sum += Integer.parseInt (lengthNum[lengthNum.length - 1]);
			}
			
			sum += Integer.parseInt (lengthNum[check++]);

			return itsSum(lengthNum, sum, check);

		}

}
