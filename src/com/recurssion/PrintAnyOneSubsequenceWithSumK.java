package com.recurssion;

import java.util.ArrayList;
import java.util.List;

public class PrintAnyOneSubsequenceWithSumK {

	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int k=10;
		List<Integer> list = new ArrayList<>();
		
		func(0,list,a.length,a,0, k);
		
	}
	
	private static boolean func(int ind, List<Integer> list, int n, int[] a, int sum, int k) {
		if(ind == n){
			if(sum == k){
				list.stream().forEach(num -> System.out.print(num + " "));
				System.out.println("\n");
				return true;
			}
			return false;
		}
		sum = sum + a[ind];
		list.add(a[ind]);
		
		if(func(ind+1, list, n, a, sum, k)){
			return true;
		}
		
		sum = sum - a[ind];
		list.remove(Integer.valueOf(a[ind]));
		return func(ind+1, list, n, a, sum, k);
	}
}
