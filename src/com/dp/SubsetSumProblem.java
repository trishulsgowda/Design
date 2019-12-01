package com.dp;

public class SubsetSumProblem {

	public static void main(String[] args) {
		int sum = 7;
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
		
		for(int i=0 ; i<a.length; i++){
			for(int j=0; j<=sum; j++){
				System.out.print(dp[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
}
