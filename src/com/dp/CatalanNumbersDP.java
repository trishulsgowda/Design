package com.dp;

public class CatalanNumbersDP {

	public static void main(String[] args) {
		int n =4;
		
		System.out.println(catalan(n));
	}
	
	public static long catalan (int n) {

        if(n == 0) return 1;
        
        long[] dp = new long[n+1];
        dp[0] = 1;
        
        for(int j=1; j<dp.length; j++){
        	long sum = 0;
        	for(int i=0; i<j; i++){
        		sum = sum + dp[i] * dp[j-1-i];
        	}
        	dp[j] = sum;
        }
        
        return dp[n];
    }
}
