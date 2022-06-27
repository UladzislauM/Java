package Tasks;

public class Deal {

	public static void main(String[] args) {
		int nunberPiples = 3;
		String numberCardsPiples[][] = new String [nunberPiples][5];
		
		String[] suits = {"Peak", "Tambourine", "Hearts", "Clubs"};
		 
		String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

		String [][] numbersCards = new String[4][14];
		
		//Заполняю 2-мерный массив всеми вариантами карт
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 14; j++) {
				switch (i) {
				case 0: {
					if(j == 0) {
						numbersCards[i][j] = suits[i];
					}
					else {
					numbersCards[i][j] = rank[j-1];
					}
					break;
				}
                case 1: {
                	if(j == 0) {
						numbersCards[i][j] = suits[i];
					}
					else {
					numbersCards[i][j] = rank[j-1];
					}
                	break;
				}
                case 2: {
					if(j == 0) {
						numbersCards[i][j] = suits[i];
					}
					else {
					numbersCards[i][j] = rank[j-1];
					}
					break;
				}
                case 3: {
                	if(j == 0) {
						numbersCards[i][j] = suits[i];
					}
					else {
					numbersCards[i][j] = rank[j-1];
					}
                	break;
				}

				}
			}
		}
		
		
		//перетусовка с помощью алгоритмов сортировки
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 14; j++) {
				
				int r = i + (int) (Math.random() * (j - i)); // случайная карта в колоде
	        String temp = numbersCards[i][r];
	        numbersCards[i][r] = numbersCards[i][j];
	        numbersCards[i][j] = temp;

	        }
		}

		for (int i = 0; i < nunberPiples; i++) {
			for (int j = 0; j < 5; j++) {
				numberCardsPiples[i][j] = numbersCards[i][j];
				System.out.println(numberCardsPiples[i][j]);

			}
			System.out.println("\n");
		}
	}
}
