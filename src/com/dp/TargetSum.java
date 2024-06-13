package com.dp;

import java.util.ArrayList;
import java.util.List;

public class TargetSum {

	public static void main(String[] args) {
		int[] arr = {1,2,1};
		int T=0;
		
		List<Integer> count = new ArrayList<>();
		
		func(arr, 0,T, count,0);
		
		System.out.println(count.size());
	}

	private static void func(int[] arr, int sum, int T, List<Integer> count, int i) {
		if(sum == T && i == arr.length){
		//	System.out.println("Sum:" + sum + " i:" + i);
		//	count = count + 1;
			count.add(1);
		}
		
		if(i >= arr.length) return;
		
		
		func(arr, arr[i] + sum, T, count, i + 1);
		
		func(arr, sum - arr[i], T, count, i + 1);
	}
	
	
}
