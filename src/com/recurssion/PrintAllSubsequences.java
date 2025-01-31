package com.recurssion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {

	public static void main(String[] args) {
		int[] arr = {1,2,4,3};
		int n = arr.length;
		List<Integer> list = new ArrayList<>();
		
		function(0,arr,n,list);
	}

	private static void function(int i, int[] arr, int n, List<Integer> list) {
		if(i >= n){
			list.stream().forEach(num -> System.out.print(num + " "));
			System.out.println("\n");
			return;
		}
		
		list.add(arr[i]);
		function(i+1, arr, n, list);
		
		list.remove(Integer.valueOf(arr[i]));
		function(i+1, arr, n, list);
	}
}
