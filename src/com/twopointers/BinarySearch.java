package com.twopointers;

public class BinarySearch {

	public static int binarySearch(int[] nums, int target) {

		int low = 0;
		int high = nums.length -1;

		while (low <= high) {
			int middle = low +  ((high - low) / 2);

			if (nums[middle] == target) {
				return target;
			} else if (target > nums[middle]) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}

		return -1;
	}
	
	public static void main(String[] args) {
		int nums[] = {1,3,5,7,8,9};
		
		System.out.println(BinarySearch.binarySearch(nums, 1));
		System.out.println(BinarySearch.binarySearch(nums, 3));
		System.out.println(BinarySearch.binarySearch(nums, 5));
		System.out.println(BinarySearch.binarySearch(nums, 7));
		System.out.println(BinarySearch.binarySearch(nums, 8));
		System.out.println(BinarySearch.binarySearch(nums, 9));
	}
}
