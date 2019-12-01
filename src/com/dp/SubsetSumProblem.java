package com.dp;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumProblem {

	public static void main(String[] args) {
		int sum = 5;
		int a[] = new int[]{1,2,3,4};
		boolean dp[][] = new boolean[a.length][sum+1];
		
		dp[0][0] = true;
		dp[0][a[0]] = true;
		
		for(int i=1 ; i<a.length; i++){
			for(int j=0 ; j<=sum; j++){
				if(j==0){
					dp[i][j] = true;
					continue;
				}
				dp[i][j] = dp[i-1][j] || dp[i-1][j-a[i]];
			}
		}
		/*for(int i=0 ; i<a.length; i++){
			for(int j=0; j<=sum; j++){
				System.out.print(dp[i][j] + "\t");
			}
			System.out.println("\n");
		}*/
		List<Integer> list = new ArrayList<>();
		printSubset(dp,a,a.length-1,sum,list);
	}

	private static void printSubset(boolean[][] dp, int[] a, int i, int sum, List<Integer> list) {
		if(i == 0 || sum == 0){
			System.out.println(list);
			return;
		}
		
		if(dp[i][sum]){
			printSubset(dp,a,i-1,sum,list);
		}
		
		if(dp[i][sum]){
			list.add(a[i]);
			printSubset(dp, a, i-1, sum - a[i], list);
		}
	}
}
