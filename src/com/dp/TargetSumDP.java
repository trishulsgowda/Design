package com.dp;

import java.util.Arrays;

public class TargetSumDP {

	public static void main(String[] args) {
		int[] arr = {1,2,1};
		int T=0;
		
		System.out.println(targetSum(arr,T));
	}

	private static int targetSum(int[] arr, int target) {
		
		int total = Arrays.stream(arr).sum(); //4
		
		int[][] dp = new int[arr.length][2 * total + 1];
		
		for(int t=-total; t<=total; t++){
			if(arr[0] == Math.abs(t))
				dp[0][total + t] = 1;
		}
		
		for(int i=1; i<arr.length; i++){
			for(int t=-total; t<=total; t++){
				if(dp[i-1][total + t] > 0){
					dp[i][total+t - arr[i]] += dp[i-1][total + t];
					dp[i][total+t + arr[i]] += dp[i-1][total + t]; 
				}
			}
		}
		
		print(dp);
		
		return dp[arr.length-1][total+target];
	}
	
	private static void print(int[][] dp) {
		int rows = dp.length;
		int columns = dp[0].length;
		
		for(int i=0;i< rows; i++){
			for(int j=0 ; j< columns ; j++){
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
