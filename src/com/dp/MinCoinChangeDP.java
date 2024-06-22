package com.dp;

import java.util.Arrays;

public class MinCoinChangeDP {

	public static int coinChange(int[] coins, int total) {

		int[] dp = new int[total+1];
		
		for(int i=1;i<=total; i++){
			dp[i] = total + 1;
		}
		
		print(dp);

		for(int i=1; i<=total; i++){
			for(int j=0; j<coins.length; j++){
				if( i >= coins[j]){
					dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
				}
			}
		}

		print(dp);
		
		if(dp[total] != total+1) return dp[total]; 
		else return -1;
	}
	
	public static void main(String[] args) {
		//int[] coins = {1,2,3};
		//int total = 5;
		
		//int[] coins = {5};
		//int total = 3;
		
		int[] coins = {2};
		int total = 4;
		
		System.out.println("\n" + coinChange(coins, total));
	}
	
	private static void print(int[] dp) {

		Arrays.stream(dp).forEach(i -> System.out.print(i + " "));
	}
}
