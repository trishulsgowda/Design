package com.dp;

public class KnapsackProfitDP {

	public static int findMaxKnapsackProfit(int capacity, int [] weights, int [] values) {
		
		int[][] dp = new int[weights.length+1][capacity+1];
		
		print(dp);
		
		for(int i=1; i<dp.length; i++){
			for(int j=1; j< dp[0].length; j++){
				int cur_itemWeight = weights[i-1];
				int cur_capacity = j;
				
				if(cur_itemWeight > cur_capacity){
					dp[i][j] = dp[i-1][j]; // MaxValue so far, excluding the current item
				}else{
					dp[i][j] = Math.max(values[i-1] + dp[i-1][j - weights[i-1]] , dp[i-1][j]); //max(including current item, excluding current item)
					// Including current item means = adding value of current item - values[i-1] and 
					// MaxValue so far, for the remaining capacity. 
					// We always find the maxValue so far in previous row. i.e dp[i-1]
					// remaining capacity means = cur_capacity - cur_itemWeight. i.e dp[i-1][j - weight[i-1]] 
				}
			}
		}
		
		System.out.println("Results of Tabulation:");
		print(dp);
		
		return dp[weights.length][capacity];
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

	public static void main(String[] args) {
		//int[] weights = {3,1,2,4};
		//int[] values = {3,5,2,7};
		//int capacity =5;
		
		int[] weights = {1,2,3,5};
		int[] values = {1,5,4,8};
		int capacity =6;
		
		System.out.println("Max Profit = " + findMaxKnapsackProfit(capacity, weights, values));
	}
}
