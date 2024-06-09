package com.dp;

public class KnapsackProfit {

	public static int findMaxKnapsackProfit(int capacity, int [] weights, int [] values) {
		
		int n = weights.length -1;
		return findMaxKnapsackProfitHelper(capacity, weights, values, n);
	}
	
	private static int findMaxKnapsackProfitHelper(int capacity, int[] weights, int[] values, int n) {
		
		if(n < 0 || capacity ==0) return 0;
		
		if(weights[n] <= capacity){
			return Math.max(values[n] + findMaxKnapsackProfitHelper(capacity - weights[n], weights, values, n - 1), findMaxKnapsackProfitHelper(capacity, weights, values, n - 1));
		}else{
			return findMaxKnapsackProfitHelper(capacity, weights, values, n -1);
		}
	}

	public static void main(String[] args) {
		int[] weights = {3,1,2,4};
		int[] values = {3,5,2,7};
		int capacity =5;
		
		System.out.println(findMaxKnapsackProfit(capacity, weights, values));
	}
}
