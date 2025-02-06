package com.recurssion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		int[] candidates = {2,3,6,7};
		int target =7;
		
		List<List<Integer>> result = combinationSum(candidates, target);
		for(List<Integer> list : result){
			list.stream().forEach(n -> System.out.print(n + " "));
			System.out.println("\n");
		}
	}
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> list = new ArrayList<>();
		int n = candidates.length;
		int ind =0;
		
		func(ind,target,list,result,n,candidates);
		return result;
    }

	private static void func(int ind, int target, List<Integer> list, List<List<Integer>> result, int n,
			int[] candidates) {
		
		if(target ==0){
			result.add(new ArrayList<>(list));
			return;
		}
		if(ind == n){
			return;
		}
		
		if(target >= candidates[ind]){
			list.add(candidates[ind]);
			func(ind, target - candidates[ind], list, result, n, candidates);
			list.remove(Integer.valueOf(candidates[ind]));
		}
		func(ind+1, target, list, result, n, candidates);
	}
}
