package com.dp;

public class NumberFactors {

	public static long countWays (int n) {

        long[] dp = new long[n + 1];

        dp[0] = 1;

        for(int i=1; i<=n; i++){

            
            dp[i] = (i - 1 < 0?0 : dp[ i - 1]) + (i - 3 < 0?0:dp[ i - 3]) + (i - 4 < 0?0 : dp[ i - 4]);
        }


        return dp[n];
    }
	
	public static void main(String[] args) {
		System.out.println(countWays(4));
	}
}
