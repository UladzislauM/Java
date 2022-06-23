package task4;

import java.util.Arrays;

public class DeletingArrayElements {

	public static void main(String[] args) {
		int[] arr1 = {1,2,4,65,4,73,24,8};
		int[] arr2 = {4,7,9,5,2,75,73};
		int[] newArr = new int[arr1.length];
		int iteration = 0;
		
		for (int i : arr1) {
			for (int j : arr2) {
				if (i == j) {
					break;
				}
				if (i != j && j == arr2[arr2.length - 1]) { 
					newArr[iteration] = i;
					iteration++;
				}
         	}
		}
		
		iteration = 0;
		for (int i : newArr) {
			if(i != 0) {
				iteration++;
			}
		}
		
		arr1 = Arrays.copyOf(newArr, iteration);
		
		for (int i : arr1) {
			System.out.println(i);
		}

	}

}
