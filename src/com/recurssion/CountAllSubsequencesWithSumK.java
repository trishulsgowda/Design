package com.recurssion;

import java.util.ArrayList;
import java.util.List;

public class CountAllSubsequencesWithSumK {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int k=7;
		List<Integer> list = new ArrayList<>();
		
		int count = func(0,list,a.length,a,0, k);
		
		System.out.println(count);
		
	}
	
	private static int func(int ind, List<Integer> list, int n, int[] a, int sum, int k) {
		if(ind == n){
			if(sum == k){
				return 1;
			}
			return 0;
		}
		sum = sum + a[ind];
		list.add(a[ind]);
		
		int lSum = func(ind+1, list, n, a, sum, k);
		
		sum = sum - a[ind];
		list.remove(Integer.valueOf(a[ind]));
		int rSum = func(ind+1, list, n, a, sum, k);
		
		return lSum + rSum;
	}
}
