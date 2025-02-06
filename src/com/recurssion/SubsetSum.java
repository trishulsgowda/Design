package com.recurssion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SubsetSum {

	public static void main(String[] args) {
		int arr[] = {3,1,4};
		List<Integer> res = subsetSum(arr);
		res.stream().forEach(n -> System.out.print(n + " "));
	}

	private static List<Integer> subsetSum(int[] arr) {
		List<Integer> res = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		int n = arr.length;
		int ind=0;
		
		func(ind,list,res, n, arr);
		
		return res.stream().sorted().collect(Collectors.toList());
	}

	private static void func(int ind, List<Integer> list, List<Integer> res, int n, int[] arr) {
		if(ind == n){
			int sum = 0;
			for(int i : list){
				sum = sum + i;
			}
			res.add(sum);
			return;
		}
		list.add(arr[ind]);
		func(ind + 1, list, res, n, arr);
		
		list.remove(Integer.valueOf(arr[ind]));
		func(ind + 1, list, res, n, arr);
		
	}
}
