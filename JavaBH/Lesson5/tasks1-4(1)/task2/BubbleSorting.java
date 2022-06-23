package task2;

public class BubbleSorting {

	public static void main(String[] args) {
		int [] nums = {7, 4, 5, 3, 2, 6, 1};
		
		boolean isSortted = false;
		int buffer = 0;
		
		while(!isSortted) {
			isSortted = true;
			for (int i = 0; i < nums.length -1; i++) {
				if(nums[i] > nums[i+1]) {
					isSortted = false;
					
					buffer = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = buffer;
				}
			}
		}
		
		for (int i : nums) {	
		System.out.println(i);
		}
	}
}
