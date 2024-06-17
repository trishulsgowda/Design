package com.dp;

public class UnboundedKnapsack {

	public static int unboundedKnapsack(int[] weights, int[] values, int n, int capacity) {

        int[][] dp = new int[weights.length+1][capacity+1];
        
        for(int i=1; i<=weights.length; i++){
        	for(int j=1; j<=capacity; j++){
        		if(weights[i-1] > j)
        			dp[i][j] = dp[i-1][j];
        		else if(j%weights[i-1] == 0){
        			int d = j/weights[i-1];
        			dp[i][j] = Math.max(dp[i-1][j], values[i-1] * d);
        		}else if(j%weights[i-1] != 0){
        			int d = j/weights[i-1];
        			System.out.println("i:"+i + " j:" + j);
        			dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j%weights[i-1]] + d*values[i-1]);
        		}
        	}
        }
		
        print(dp);
		
        return  dp[weights.length][capacity];
    }
	
	public static void main(String[] args) {
		//int[] weights = {2,4,6};
		//int[] values = {5,11,13};
		//int capacity =10;
		
		int[] weights = {2};
		int[] values = {3};
		int capacity =3;
		
		System.out.println(unboundedKnapsack(weights, values,weights.length, capacity));
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
