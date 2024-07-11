package com.recurssion;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] arr = {9, 2, 5, 3, 6, 14, 11, 7, 9, 5, 13, 3, 15, 0, 8, 4, 1, 9, 5, 13, 3, 11, 7, 15, 0, 10, 6, 14, 9, 2, 5, 3, 2, 10, 6, 10, 6, 5, 13, 3, 11, 7, 15, 3, 11, 7, 15};
		
		int count = lis(Integer.MIN_VALUE, 0, 0, arr);
		System.out.println(count);
	}

	private static int lis(int maxElement, int count, int index, int[] arr) {
		
		if(index >= arr.length) return count;
		
		int excludeCount = lis(maxElement, count, index+1, arr);
		
		if(arr[index] >= maxElement){
			count = count + 1;
			maxElement = arr[index] + 1;
		}
		
		int includeCount = lis(maxElement,count, index+1, arr);
		
		return Math.max(includeCount, excludeCount);
	}
}
