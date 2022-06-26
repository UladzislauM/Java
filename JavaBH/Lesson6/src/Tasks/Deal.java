package Tasks;

public class Deal {

	public static void main(String[] args) {
		int n = 3;
		
		String[] suits = {"Пик", "Бубен", "Черв", "Треф"};
		 
		String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10","Валет", "Королева", "Король", "Туз"};

		//перетусовка с помощью алгоритмов сортировки

		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n-i)); // случайная карта в колоде
		}
		
		
		


	}

}
