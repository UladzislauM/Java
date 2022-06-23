package task2;

public class InsertionSort {
	public static void main(String[] args) {
		int [] nums = {7, 4, 5, 3, 2, 6, 1};
		
		for (int i = 0; i < nums.length; i++) {
			// Вытаскиваем значение элемента
			int value = nums[i];
			// Перемещаемся по элементам, которые перед вытащенным элементом
			int it = i - 1;
			for (; it >= 0; it--) {
				// Если вытащили значение меньшее — передвигаем больший элемент дальше
				if (value < nums[it]) {
					nums[it + 1] = nums[it];
				} else {
					// Если вытащенный элемент больше — останавливаемся
					break;
				}
			}
			// В освободившееся место вставляем вытащенное значение
			nums[it + 1] = value;
		}
		
		for (int i : nums) {	
			System.out.println(i);
			}
		
		int [] nums2 = {17, 12, 20, 13, 11, 10};
		insertionSortRecursive(nums2, nums2.length);
		
		for (int i : nums2) {	
			System.out.println(i);
			}
		
	}
	
	private static void insertionSortRecursive(int[] input, int i) {
	    if (i <= 1) {
	        return;
	    }
	    insertionSortRecursive(input, i - 1);
	    int key = input[i - 1];
	    int j = i - 2;
	    while (j >= 0 && input[j] > key) {
	        input[j + 1] = input[j];
	        j = j - 1;
	    }
	    input[j + 1] = key;
	}
}
