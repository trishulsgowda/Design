package com.recurssion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequencesWithSumK {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int k=6;
		List<Integer> list = new ArrayList<>();
		
		func(0,list,a.length,a,0, k);
		
	}

	private static void func(int ind, List<Integer> list, int n, int[] a, int sum, int k) {
		if(ind == n){
			if(sum == k){
				list.stream().forEach(num -> System.out.print(num + " "));
				System.out.println("\n");
			}
			return;
		}
		sum = sum + a[ind];
		list.add(a[ind]);
		
		func(ind+1, list, n, a, sum, k);
		
		sum = sum - a[ind];
		list.remove(Integer.valueOf(a[ind]));
		func(ind+1, list, n, a, sum, k);
	}
}
