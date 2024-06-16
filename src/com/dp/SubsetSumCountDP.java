package com.dp;

public class SubsetSumCountDP {

	public static void main(String[] args) {
		int[] arr = {1,2,7,4,5};
		int total = 7;
		
		System.out.println(subsetSum(arr, total));
	}

	private static int subsetSum(int[] arr, int total) {
		
		int[][] dp = new int[arr.length+1][total+1];
		
		// Base case
		dp[0][0] =1;
		
		for(int i=1; i <=arr.length; i++){
			for(int j=0; j <=total; j++){
				if(arr[i-1] > j){
					dp[i][j] = dp[i-1][j];
				}else if(arr[i-1] == j){
					dp[i][j] = dp[i-1][j] + 1;
				}else if(arr[i-1] < j){
					dp[i][j] = dp[i-1][j-arr[i-1]] + dp[i-1][j];
				}
			}
		}
		
		print(dp);
		
		return dp[arr.length][total];
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
