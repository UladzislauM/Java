package Tasks;

import java.util.Collections;

public class Deal {

	public static void main(String[] args) {
		int nunberPiples = 3;
		String numberCardsPiples[][] = new String [nunberPiples][5];
		
		String[] suits = {"Peak", "Tambourine", "Hearts", "Clubs"};
		 
		String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

		//перетусовка с помощью алгоритмов сортировки
		
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
	static void heapify(int[] array, int length, int i) {  
	    int leftChild = 2*i+1;
	    int rightChild = 2*i+2;
	    int largest = i;

	    // если левый дочерний больше родительского
	    if (leftChild < length && array[leftChild] > array[largest]) {
	        largest = leftChild;
	    }

	    // если правый дочерний больше родительского
	    if (rightChild < length && array[rightChild] > array[largest]) {
	        largest = rightChild;
	    }

	    // если должна произойти замена
	    if (largest != i) {
	        int temp = array[i];
	        array[i] = array[largest];
	        array[largest] = temp;
	        heapify(array, length, largest);
	    }
	}

	public static void heapSort(int[] array) {  
	    if (array.length == 0) return;

	    // Строим кучу
	    int length = array.length;
	    // проходим от первого без ответвлений к корню
	    for (int i = length / 2-1; i >= 0; i--)
	        heapify(array, length, i);

	    for (int i = length-1; i >= 0; i--) {
	        int temp = array[0];
	        array[0] = array[i];
	        array[i] = temp;

	        heapify(array, i, 0);
	    }
	}

}
