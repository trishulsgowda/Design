package com.advancedsorting;

public class FirstMissing {
	
	public static int firstMissingPositiveInteger(int[] nums) {
		int i = 0;
		int len = nums.length;
		while (i < len) {
			if (nums[i] < 0 || nums[i] - 1 == i){
				i++;
			}else{
				if (nums[i] - 1 < len && nums[i] - 1 >=0)
					swap(nums, i, nums[i] - 1);
				else i++;
			}
		}

		for (int j = 0; j < len; j++) {
			if (nums[j] != j + 1)
				return j + 1;
		}

		return len + 1;
	}

	public static void swap(int[] arr, int i, int j) {
		int a = arr[i];
		arr[i] = arr[j];
		arr[j] = a;
	}
	
	public static void main(String[] args) {
		int[] nums = {55,22,52,100,1,3,-5};
		System.out.println(firstMissingPositiveInteger(nums));
	}
}