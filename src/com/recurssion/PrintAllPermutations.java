package com.recurssion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPermutations {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		List<List<Integer>> list = printAllPermutation(a);
		
		list.stream().forEach(n -> System.out.print(n + " "));
	}

	private static List<List<Integer>> printAllPermutation(int[] a) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		boolean[] freq = new boolean[a.length];
		recursePermute(list,res,freq,a);
		return res;
	}

	private static void recursePermute(List<Integer> list, List<List<Integer>> res, boolean[] freq, int[] a) {
		if(list.size() == a.length){
			res.add(new ArrayList<>(list));
			return;
		}
		
		for(int i=0; i<a.length; i++){
			if(freq[i] != true){
				list.add(a[i]);
				freq[i] = true;
				recursePermute(list, res, freq, a);
				list.remove(Integer.valueOf(a[i]));
				freq[i] = false;
			}
		}
		
	}
}
