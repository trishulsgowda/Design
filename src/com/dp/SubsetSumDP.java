package com.dp;

public class SubsetSumDP {

	public static boolean subsetSum(int [] arr, int total)
    {
		int[][] dp = new int[arr.length + 1][total + 1];
		
		for(int row=0; row<=arr.length; row++){
			dp[row][0] = 1;
		}
		
		for(int i=1; i<=arr.length; i++){
			for(int j=1; j<=total; j++){
				
				if(arr[i-1] > j){
					dp[i][j] = dp[i - 1][j];
					continue;
				}
				
				if(j == arr[i-1] || dp[i - 1][j] == 1){
					dp[i][j] =1;
				}
				else if(dp[i-1][j-arr[i-1]] == 1){
					dp[i][j] =1;
				}
			}
		}
		
		print(dp);
		
		return dp[arr.length][total]==1? true : false;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,2,1,7};
		int total = 6;
		
		System.out.println(subsetSum(arr, total));
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
