package com.dp;

import java.util.Arrays;
import java.util.OptionalInt;

public class MaximumSumIncreasingSubsequence {

	public static void main(String[] args) {
		// int[] arr = {9, 2, 5, 3, 6, 14, 11, 7, 9, 5, 13, 3, 15, 0, 8, 4, 1,
		// 9, 5, 13, 3, 11, 7, 15, 0, 10, 6, 14, 9, 2, 5, 3, 2, 10, 6, 10, 6, 5,
		// 13, 3, 11, 7, 15, 3, 11, 7, 15};
		int[] arr = {4,2,3,6,10,1,12};

		int count = msis(arr);
		System.out.println(count);
	}

	private static int msis(int[] arr) {

		int[] lis = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			lis[i] = arr[i];
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && lis[j] + arr[i] > lis[i])
					lis[i] = lis[j] + arr[i];
			}
		}

		OptionalInt max = Arrays.stream(lis).max();

		return max.getAsInt();
	}
}
