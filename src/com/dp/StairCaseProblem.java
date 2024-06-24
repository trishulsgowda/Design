package com.dp;

public class StairCaseProblem {

	public static long countWays(int n) {

		if (n == 0 || n == 1)
			return 1;

		long[] dp = new long[n + 1];
		dp[0] = dp[1] = 1;
		dp[2] = 2;

		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		}

		return dp[n];
	}
	
	public static void main(String[] args) {
		System.out.println(countWays(3));
	}
}
