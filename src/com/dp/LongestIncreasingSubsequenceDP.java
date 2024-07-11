package com.dp;

import java.util.Arrays;
import java.util.OptionalInt;

public class LongestIncreasingSubsequenceDP {

	public static void main(String[] args) {
		//int[] arr = {9, 2, 5, 3, 6, 14, 11, 7, 9, 5, 13, 3, 15, 0, 8, 4, 1, 9, 5, 13, 3, 11, 7, 15, 0, 10, 6, 14, 9, 2, 5, 3, 2, 10, 6, 10, 6, 5, 13, 3, 11, 7, 15, 3, 11, 7, 15};
		int[] arr = {0,1,0,3,2,3};
		
		int count = lis(arr);
		System.out.println(count);
	}

	private static int lis(int[] arr) {
		
		int[] lis = new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			lis[i] = 1;
		}
		
		for(int i=1; i<arr.length; i++){
			for(int j=0; j<i; j++){
				if(arr[i] > arr[j] && lis[j]+1 > lis[i])
					lis[i] = lis[j] + 1;
			}
		}
		
		OptionalInt max = Arrays.stream(lis).max();
		
		return max.getAsInt();
	}
}
